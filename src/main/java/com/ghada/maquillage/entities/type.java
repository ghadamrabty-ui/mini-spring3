package com.ghada.maquillage.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class type {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idtyp;
	 private String nomtyp;
	
	@OneToMany(mappedBy = "type")
	@JsonIgnore
	private List<maquillage> maquillages;
	
	
	public void setMaquillages(List<maquillage> maquillages) {
		this.maquillages = maquillages;
	}
	
    public type() {
        super();
    }
	
	public Long getIdtyp() {
	return idtyp;
	}
	
	public void setIdtyp(Long idtyp) {
	this.idtyp = idtyp;
	}
	
	public String getNomtyp() {
	return nomtyp;
	}
	
	public void setNomtyp(String nomtyp) {
	this.nomtyp = nomtyp;
	}
	

	public List<maquillage> getMaquillages() {
	    return maquillages;
	}
}
