package com.example.PF_Gr5_Back.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PF_Gr5_Back.model.Annonce;
import com.example.PF_Gr5_Back.model.Candidat;
import com.example.PF_Gr5_Back.repo.AnnonceRepo;
import com.example.PF_Gr5_Back.repo.CandidatRepo;

@RestController
@RequestMapping("/api")
public class AnnonceCandidatRestControlleur {

	@Autowired
	private CandidatRepo repoCandidat;
	
	@Autowired
	private AnnonceRepo repoAnnonce;
	
	
}
