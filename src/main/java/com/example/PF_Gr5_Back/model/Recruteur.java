package com.example.PF_Gr5_Back.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Recruteur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom_Entreprise;
	private String logo;
	private String login;
	private String mdp;
	private String nom;
	private String prenom;
	private String mail;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTEMENT_ID")
	private Departement departement;
	
	@OneToMany(mappedBy="recruteur")
	@JsonIgnoreProperties(value = { "recruteur" }, allowSetters = true)
	private Collection<Annonce> listeAnnonces;
	
	@Version
	private int version;
	
	public Recruteur() {
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
	
	public Collection<Annonce> getListeAnnonces() {
		return listeAnnonces;
	}


	public void setListeAnnonces(Collection<Annonce> listeAnnonces) {
		this.listeAnnonces = listeAnnonces;
	}


	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Recruteur [id=" + id + ", nom_Entreprise=" + nom_Entreprise + ", logo=" + logo + ", login=" + login
				+ ", mdp=" + mdp + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", departement="
				+ departement + "]";
	}	

}
