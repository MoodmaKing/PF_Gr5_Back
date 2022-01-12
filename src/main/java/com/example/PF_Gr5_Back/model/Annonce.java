package com.example.PF_Gr5_Back.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Annonce {

	@Id
	private int id;
	private String titre;
	private String description;
	private String categorie;
	private String date;
	private int salaire;
	private String type_Contrat;
	private String tele_travail;
	
	@Version
	private int version;
	
	
	
	public Annonce() {
	}
	
	
	public Annonce(int id, String titre, String description, String categorie, String date, int salaire,
			String type_Contrat, String tele_travail) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.categorie = categorie;
		this.date = date;
		this.salaire = salaire;
		this.type_Contrat = type_Contrat;
		this.tele_travail = tele_travail;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	public String getType_Contrat() {
		return type_Contrat;
	}
	public void setType_Contrat(String type_Contrat) {
		this.type_Contrat = type_Contrat;
	}
	public String getTele_travail() {
		return tele_travail;
	}
	public void setTele_travail(String tele_travail) {
		this.tele_travail = tele_travail;
	}


	@Override
	public String toString() {
		return "Annonce [id=" + id + ", titre=" + titre + ", description=" + description + ", categorie=" + categorie
				+ ", date=" + date + ", salaire=" + salaire + ", type_Contrat=" + type_Contrat + ", tele_travail="
				+ tele_travail + "]";
	}
	
	
}
