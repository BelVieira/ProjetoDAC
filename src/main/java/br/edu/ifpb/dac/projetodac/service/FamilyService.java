package br.edu.ifpb.dac.projetodac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.projetodac.model.FamilyModel;
import br.edu.ifpb.dac.projetodac.repository.FamilyRepository;


@Service
public class FamilyService extends ServiceTemplate{	 

	    @Autowired
	    private FamilyRepository repository;

	    public boolean create(FamilyModel family) {
	        return super.create(family, this.repository);
	    }

	    public List<FamilyModel> read() {
	        return (List<FamilyModel>) super.read((JpaRepository) this.repository);
	    }

	    public boolean delete(String uuid) {
	        return super.delete(uuid,(JpaRepository) this.repository);
	    }

	    public FamilyModel findByUuid(String uuid) {
	        return (FamilyModel) super.findByUuid(uuid, (JpaRepository) this.repository);
	    }

	    public boolean update(FamilyModel family, String uuid) {
	        try {
	        	FamilyModel result = ((FamilyService) this.repository).findByUuid(uuid);
	            String name = family.getName()==null? result.getName() : family.getName();
	            result.setName(name);
	            this.repository.save(result);
	            return true;
	        }catch (Exception error){
	            return false;
	        }
	    }
}
