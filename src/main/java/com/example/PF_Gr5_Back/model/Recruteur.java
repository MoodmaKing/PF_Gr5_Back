package com.example.PF_Gr5_Back.model;

public class Recruteur {

/*
-	Id
-	nom_Entreprise
-	MDP
-	Logo
-	Localisation
-	Contact (nom – prenom - mail)
 */
	private int id;
	private String nom_Ent;
	private String MDP;
	private String logo;
	private String localisation;
	
	private Contact contact;

	public Recruteur() {
	}

	public Recruteur(int id, String nom_Ent, String mDP, String logo, String localisation, Contact contact) {
		this.id = id;
		this.nom_Ent = nom_Ent;
		MDP = mDP;
		this.logo = logo;
		this.localisation = localisation;
		this.contact = contact;
	}
	
	

}
