package com.example.PF_Gr5_Back.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Candidat {
	
/*
-	Id
-	nom
-	prenom
-	MDP
-	mail
-	profession
-	anneesXP
-	departement
-	age

 */
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String mdp;
	private String mail;
	private String profession;
	private int anneesXP;
	private int dpt;
	private int age;
	@Version
	private int version;

	public Candidat() {
	}

	public Candidat(int id, String nom, String prenom, String mdp, String mail, String profession, int anneesXP,
			int dpt, int age) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.mail = mail;
		this.profession = profession;
		this.anneesXP = anneesXP;
		this.dpt = dpt;
		this.age = age;
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

	public int getDpt() {
		return dpt;
	}

	public void setDpt(int dpt) {
		this.dpt = dpt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
				+ ", profession=" + profession + ", anneesXP=" + anneesXP + ", dpt=" + dpt + ", age=" + age
				+ ", version=" + version + "]";
	}
	
	
	
	
}


	