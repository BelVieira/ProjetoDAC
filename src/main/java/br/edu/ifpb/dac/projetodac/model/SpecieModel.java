package br.edu.ifpb.dac.projetodac.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="specie")
@Table(name="especies")
public class SpecieModel {

	@Id
	@Column(name = "uuid", nullable = false)
	private String uuid;
	public Integer chave;
	public String nome;
	public String nomePopular;

	public SpecieModel(Integer chave, String uuid, String nome, String nomePopular) {
		super();
		this.uuid = uuid;
		this.uuid = UUID.randomUUID().toString();
		this.chave = chave;
		this.nome = nome;
		this.nomePopular = nomePopular;
	}

	public SpecieModel() {
		this.uuid = UUID.randomUUID().toString();
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

	@Override
	public int hashCode() {
		return Objects.hash(chave, nome, nomePopular, uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecieModel other = (SpecieModel) obj;
		return Objects.equals(chave, other.chave) && Objects.equals(nome, other.nome)
				&& Objects.equals(nomePopular, other.nomePopular) && Objects.equals(uuid, other.uuid);
	}

	@Override
	public String toString() {
		return "SpecieModel [chave=" + chave + ", nome=" + nome + ", nomePopular=" + nomePopular + "]";
	}

}
