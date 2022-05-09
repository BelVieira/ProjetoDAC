package br.edu.ifpb.dac.projetodac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.projetodac.model.SpecieModel;
import br.edu.ifpb.dac.projetodac.repository.SpecieRepository;

@RestController
@RequestMapping("/projetodac/SpecieModel")
public class SpecieController {

	@Autowired
	private SpecieRepository specieRepository;

	public void criar() {
		for (int i = 1; i < 10; i++) {
			SpecieModel e = new SpecieModel();
			e.setChave(i);
			e.setNome("nome " + i);
			e.setNomePopular("nome popular " + i);
			specieRepository.save(e);
		}
	}

	public List<SpecieModel> listar() {
		return (List<SpecieModel>) specieRepository.findAll();
	}
}
