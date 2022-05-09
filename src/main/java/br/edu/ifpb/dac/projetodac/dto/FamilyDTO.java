package br.edu.ifpb.dac.projetodac.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifpb.dac.projetodac.model.FamilyModel;

public class FamilyDTO {
	private String uuid;
	private String name;

	public FamilyDTO(FamilyModel model) {
	        this.uuid = model.getUuid();
	        this.name = model.getName();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
