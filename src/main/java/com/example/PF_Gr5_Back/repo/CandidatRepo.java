package com.example.PF_Gr5_Back.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PF_Gr5_Back.model.Candidat;


public interface CandidatRepo extends JpaRepository<Candidat, Integer> {

	
	List<Candidat> findByNom(String nom);
	List<Candidat> findByPrenom(String prenom);
	Candidat findByMail(String mail);
	List<Candidat> findByProfession(String profession);
	//List<Candidat> findByDpt(int dpt);
	List<Candidat> findByAge(int age);
	//Candidat findByMailAndMdp(String mail, String mdp);
}
