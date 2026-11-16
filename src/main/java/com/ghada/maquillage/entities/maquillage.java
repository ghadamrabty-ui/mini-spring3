package com.ghada.maquillage.entities;

import java.util.Date;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class maquillage {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idmaquillage;
	private String nommaquillage;
	private Double prixmaquillage;
	private Date datemaquillage;
	
	@ManyToOne
	private type type;
	
	
	
	public maquillage() {
		super();
	}
	
	
	public maquillage(String nommaquillage, Double prixmaquillage, Date datemaquillage) {
		super();
		this.nommaquillage = nommaquillage;
		this.prixmaquillage = prixmaquillage;
		this.datemaquillage = datemaquillage;
	}


	public long getIdmaquillage() {
		return idmaquillage;
	}
	public void setIdmaquillage(long idmaquillage) {
		this.idmaquillage = idmaquillage;
	}
	public String getNommaquillage() {
		return nommaquillage;
	}
	public void setNommaquillage(String nommaquillage) {
		this.nommaquillage = nommaquillage;
	}
	public Double getPrixmaquillage() {
		return prixmaquillage;
	}
	public void setPrixmaquillage(Double prixmaquillage) {
		this.prixmaquillage = prixmaquillage;
	}
	public Date getDatemaquillage() {
		return datemaquillage;
	}
	public void setDatemaquillage(Date datemaquillage) {
		this.datemaquillage = datemaquillage;
	}


	@Override
	public String toString() {
		return "maquillage [idmaquillage=" + idmaquillage + ", nommaquillage=" + nommaquillage + ", prixmaquillage="
				+ prixmaquillage + ", datemaquillage=" + datemaquillage + "]";
	}


	public type getType() {
		return type;
	}


	public void setType(type type) {
		this.type = type;
	}
	
	
	
	
}
