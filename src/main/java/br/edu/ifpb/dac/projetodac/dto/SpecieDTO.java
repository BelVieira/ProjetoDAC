package br.edu.ifpb.dac.projetodac.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifpb.dac.projetodac.model.FamilyModel;
import br.edu.ifpb.dac.projetodac.model.SpecieModel;

public class SpecieDTO {
	private String uuid;
	public Integer chave;
	public String nome;
	public String nomePopular;

	public SpecieDTO(SpecieModel model) {
	        this.uuid = model.getUuid();
	        this.chave = model.getChave();
	        this.nome = model.getNome();
	        this.nomePopular = model.getNomePopular();
	    }

	public static List<FamilyDTO> convert(List<FamilyModel> classes) {
		return classes.stream().map(FamilyDTO::new).collect(Collectors.toList());
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Integer getChave() {
		return chave;
	}

	public void setChave(Integer chave) {
		this.chave = chave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}
	
}
