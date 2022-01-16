package com.example.PF_Gr5_Back.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PF_Gr5_Back.model.Annonce;
import com.example.PF_Gr5_Back.model.Candidat;
import com.example.PF_Gr5_Back.repo.AnnonceRepo;
import com.example.PF_Gr5_Back.repo.CandidatRepo;

@RestController
@RequestMapping("/api")
public class CandidatRestController {

	@Autowired
	private CandidatRepo repo;

//Create
	
	//http://localhost:8080/danavalley/candidatrest/candidat
	@CrossOrigin
	@PostMapping("/candidats")
	public void m3(@RequestBody Candidat c) {
		repo.save(c);
	}
	
//Get
	//http://localhost:8080/danavalley/candidatrest/candidat
	@CrossOrigin
	@GetMapping("/candidats")
	public List<Candidat> m1() {
		return this.repo.findAll();
	}
	
	//http://localhost:8080/danavalley/candidatrest/candidatid/2
	@CrossOrigin
	@GetMapping("/candidats/{id}")
	public Candidat m2(@PathVariable(name = "id") int id) {
		return this.repo.findById(id).get();
	}
	
	//http://localhost:8080/danavalley/candidatrest/candidatnom/uuu
	@CrossOrigin
	@GetMapping("/candidatsnom/{nom}")
	public List<Candidat> m3(@PathVariable(name = "nom") String nom) {
		return this.repo.findByNom(nom);
	}
	
	//http://localhost:8080/danavalley/candidatrest/candidatpre/az
	@CrossOrigin
	@GetMapping("/candidatsprenom/{prenom}")
	public List<Candidat> m4(@PathVariable(name = "prenom") String prenom) {
		return this.repo.findByPrenom(prenom);
	}

	//http://localhost:8080/danavalley/candidatrest/candidatmail/aad
	@CrossOrigin
	@GetMapping("/candidatsmail/{mail}")
	public Candidat m5(@PathVariable(name = "mail") String mail) {
		return this.repo.findByMail(mail);
	}
	
	//http://localhost:8080/danavalley/candidatrest/candidatprof/
	@CrossOrigin
	@GetMapping("/candidatsprof/{profession}")
	public List<Candidat> m6(@PathVariable(name = "profession") String profession) {
		return this.repo.findByProfession(profession);
	}
	
//	@CrossOrigin
//	@GetMapping("/candidatprof/{mail}/{mdp}")
//	public Candidat findByMailAndPass(@PathVariable(name = "login") String mail,@PathVariable(name = "mdp") String mdp) {
//		Candidat c=repo.findByMailAndMdp(mail, mdp);
//		return c;
//
//	}
	
	/*
	//http://localhost:8080/danavalley/candidatrest/candidat
	@CrossOrigin
	@GetMapping("/candidat/{dpt}")
	public List<Candidat> m7(@PathVariable(name = "dpt") int dpt) {
		return repo.findByDpt(dpt);
	}
	*/
	
	//http://localhost:8080/danavalley/candidatrest/candidatage/55
	@CrossOrigin
	@GetMapping("/candidatsage/{age}")
	public List<Candidat> m8(@PathVariable(name = "age") int age) {
		return this.repo.findByAge(age);
	}
	
//Delete
	//http://localhost:8080/danavalley/candidatrest/candidat/3
	@CrossOrigin
	@DeleteMapping("/candidats/{id}")
	public void d(@PathVariable(name = "id") Integer id) {
		Candidat c = this.repo.findById(id).get();
		this.repo.delete(c);
	}
	
//Update
	//http://localhost:8080/danavalley/candidatrest/candidat
	@CrossOrigin
	@PutMapping("/candidats")
    private void update(@RequestBody Candidat c) {
	    
	    repo.save(c);
	    
    }
}

