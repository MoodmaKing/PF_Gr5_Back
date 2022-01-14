package com.example.PF_Gr5_Back.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Candidat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String mdp;
	private String mail;
	private String profession;
	private int anneesXP;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTEMENT_ID")
	private Departement departement;
	
	private int age;
	
	@ManyToMany(mappedBy="listeCandidats")
	private Collection<Annonce> listeAnnonces;
	
	@Version
	private int version;

	public Candidat() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAnneesXP() {
		return anneesXP;
	}

	public void setAnneesXP(int anneesXP) {
		this.anneesXP = anneesXP;
	}

	
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement dpt) {
		this.departement = dpt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Collection<Annonce> getListeAnnonce() {
		return listeAnnonces;
	}

	public void setListeAnnonce(Collection<Annonce> listeAnnonce) {
		this.listeAnnonces = listeAnnonce;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", mail=" + mail
				+ ", profession=" + profession + ", anneesXP=" + anneesXP + ", dpt=" + departement + ", age=" + age + "]";
	}
	
}


	