package com.example.PF_Gr5_Back.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PF_Gr5_Back.model.Annonce;



public interface AnnonceRepo extends JpaRepository<Annonce, Integer> {

	//List<Annonce> findByTitreContaining(String titre);
	
	List<Annonce> findByTitre(String titre);
	List<Annonce> findByCategorie(String categorie);
	List<Annonce> findByDate(String date);
	//List<Annonce> findByTypeContrat(String type_Contrat);
	//List<Annonce> findByTeleTravail(String tele_travail);
	
}