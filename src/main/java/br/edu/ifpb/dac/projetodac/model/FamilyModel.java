package br.edu.ifpb.dac.projetodac.model;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Família")
public class FamilyModel {
	@Id
	@Column(name = "uuid", nullable = false)
	private String uuid;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

	private List<FamilyModel> familyModels;

	public FamilyModel(String uuid, String name) {
		this.uuid = uuid;
		this.name = name;
		this.uuid = UUID.randomUUID().toString();

	}

	public FamilyModel() {
		this.uuid = UUID.randomUUID().toString();
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


	@Override
	public int hashCode() {
		return Objects.hash(name, familyModels, uuid);
	}

	public List<FamilyModel> getFamilyModels() {
		return familyModels;
	}

	public void setFamilyModels(List<FamilyModel> familyModels) {
		this.familyModels = familyModels;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamilyModel other = (FamilyModel) obj;
		return Objects.equals(name, other.name) && Objects.equals(familyModels, other.familyModels)
				&& Objects.equals(uuid, other.uuid);
	}

	@Override
	public String toString() {
		return "FamilyModel [uuid=" + uuid + ", name=" + name + ", familyModels=" + familyModels + "]";
	}
	
}
