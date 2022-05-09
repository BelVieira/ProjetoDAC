package br.edu.ifpb.dac.projetodac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.projetodac.model.FamilyModel;
import br.edu.ifpb.dac.projetodac.model.SpecieModel;
import br.edu.ifpb.dac.projetodac.repository.SpecieRepository;

@Service
public class SpecieService extends ServiceTemplate{
	 @Autowired
	    private SpecieRepository repository;

	    public boolean create(SpecieModel specie) {
	    	return super.create(specie, this.repository);
	    }

	    public List<SpecieModel> read() {
	        return (List<SpecieModel>) super.read((JpaRepository) this.repository);
	    }

	    public boolean delete(String uuid) {
	        return super.delete(uuid,(JpaRepository) this.repository);
	    }

	    public SpecieModel findByUuid(String uuid) {
	        return (SpecieModel) super.findByUuid(uuid, (JpaRepository) this.repository);
	    }

	    public boolean update(SpecieModel specie, String uuid) {
	        try {
	        	SpecieModel result = ((SpecieService) this.repository).findByUuid(uuid);
	            Integer chave = specie.getChave()==null? result.getChave() : specie.getChave();
	            result.setChave(chave);
	            this.repository.save(result);
	            return true;
	        }catch (Exception error){
	            return false;
	        }
	    }
}
