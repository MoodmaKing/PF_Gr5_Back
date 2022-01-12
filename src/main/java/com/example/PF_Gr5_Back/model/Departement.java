package com.example.PF_Gr5_Back.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Departement {
	@Id
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="departement")
	private Collection<Annonce> listeAnnonces;
	@OneToMany(mappedBy="departement")
	private Collection<Recruteur> listeRecruteurs;
	@OneToMany(mappedBy="departement")
	private Collection<Candidat> listeCandidats;
	
	@Version
	private int version;
	
	public Departement() {
	}
	
	public Departement(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
	public Collection<Annonce> getListeAnnonces() {
		return listeAnnonces;
	}

	public void setListeAnnonces(Collection<Annonce> listeAnnonces) {
		this.listeAnnonces = listeAnnonces;
	}
	
	
	public Collection<Recruteur> getListeRecruteurs() {
		return listeRecruteurs;
	}

	public void setListeRecruteurs(Collection<Recruteur> listeRecruteurs) {
		this.listeRecruteurs = listeRecruteurs;
	}

	
	public Collection<Candidat> getListeCandidats() {
		return listeCandidats;
	}

	public void setListeCandidats(Collection<Candidat> listeCandidats) {
		this.listeCandidats = listeCandidats;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}
}
