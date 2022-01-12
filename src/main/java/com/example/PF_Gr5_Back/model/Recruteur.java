package com.example.PF_Gr5_Back.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Recruteur {

	@Id
	private int id;
	private String nom_Entreprise;
	private String login;
	private String mdp;
	private String localisation;
	
	private String contact;
	@Version
	private int version;
	

	public Recruteur() {
	}


	public Recruteur(int id, String nom_Entreprise, String login, String mdp, String localisation, String contact) {
		super();
		this.id = id;
		this.nom_Entreprise = nom_Entreprise;
		this.login = login;
		this.mdp = mdp;
		this.localisation = localisation;
		this.contact = contact;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom_Entreprise() {
		return nom_Entreprise;
	}


	public void setNom_Entreprise(String nom_Entreprise) {
		this.nom_Entreprise = nom_Entreprise;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Recruteur [id=" + id + ", nom_Entreprise=" + nom_Entreprise + ", login=" + login + ", mdp=" + mdp
				+ ", localisation=" + localisation + ", contact=" + contact + ", version=" + version + "]";
	}
	
}
