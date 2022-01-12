package com.example.PF_Gr5_Back.model;

import java.util.*;

import javax.persistence.*;

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
	private Boolean tele_travail;
	
	
	@ManyToMany
	@JoinTable(
		name="annonces_candidats",
		joinColumns = @JoinColumn(name = "idAnnonce"),
		inverseJoinColumns = @JoinColumn(name = "idCandidat")
	)
	private Collection<Candidat> listeCandidats;
	
	@ManyToOne
	@JoinColumn(name="RECRUTEUR_ID")
	private Recruteur recruteur;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTEMENT_ID")
	private Departement departement;
	
	@Version
	private int version;
	
	
	
	public Annonce() {
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

	public Boolean getTele_travail() {
		return tele_travail;
	}

	public void setTele_travail(Boolean tele_travail) {
		this.tele_travail = tele_travail;
	}

	
	public Collection<Candidat> getListeCandidat() {
		return listeCandidats;
	}

	public void setListeCandidat(Collection<Candidat> listeCandidat) {
		this.listeCandidats = listeCandidat;
	}

	
	public Recruteur getRecruteur() {
		return recruteur;
	}

	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}

	
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement dpt) {
		this.departement = dpt;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Annonce [id=" + id + ", titre=" + titre + ", description=" + description + ", categorie=" + categorie
				+ ", date=" + date + ", salaire=" + salaire + ", type_Contrat=" + type_Contrat + ", tele_travail="
				+ tele_travail + ", recruteur=" + recruteur + ", dpt=" + departement + "]";
	}
	
	
	
}
