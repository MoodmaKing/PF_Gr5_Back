package com.example.PF_Gr5_Back.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Annonce {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@JsonIgnoreProperties(value = { "listeAnnonces" }, allowSetters = true)
	private Collection<Candidat> listeCandidats;
	
	@ManyToOne
	@JoinColumn(name="RECRUTEUR_ID")
	@JsonIgnoreProperties(value = { "listeAnnonces" }, allowSetters = true)
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

	
	public Collection<Candidat> getListeCandidats() {
		return listeCandidats;
	}

	public void setListeCandidats(Collection<Candidat> listeCandidats) {
		this.listeCandidats = listeCandidats;
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
