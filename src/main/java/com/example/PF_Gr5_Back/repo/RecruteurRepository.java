package com.example.PF_Gr5_Back.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PF_Gr5_Back.model.Recruteur;

public interface RecruteurRepository extends JpaRepository<Recruteur, Integer>{
	//Recruteur findByLoginAndMdp(String login, String mdp);
	public Recruteur findByMail(String mail);
}
