package com.example.PF_Gr5_Back.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.PF_Gr5_Back.repo.AnnonceRepo;

@RestController
@RequestMapping("/api")
public class AnnonceRestController {

	@Autowired
	private AnnonceRepo repo;

//Create
	
	//http://localhost:8080/danavalley/api/annonces
	@PostMapping("/annonces")
	public String create(@RequestBody Annonce a) {
		this.repo.save(a);
		return "annonce créée";
	}
	
//Get
	//http://localhost:8080/danavalley/api/annonces
	@CrossOrigin
	@GetMapping("/annonces")
	public List<Annonce> m1() {
		return this.repo.findAll();
	}
	
	//http://localhost:8080/danavalley/consolesrest/annonce/1
	@CrossOrigin
	@GetMapping("/annonces/{id}")
	public Annonce m2(@PathVariable(name = "id") int id) {
		return this.repo.findById(id).get();
	}
	
	//http://localhost:8080/danavalley/consolesrest/annoncetit/aa
	@CrossOrigin
	@GetMapping("/annoncestitre/{titre}")
	public List<Annonce> m3(@PathVariable(name = "titre") String titre) {
		return this.repo.findByTitre(titre);
	}
	
	//http://localhost:8080/danavalley/consolesrest/annoncecat/aa
	@CrossOrigin
	@GetMapping("/annoncescat/{cat}")
	public List<Annonce> m4(@PathVariable(name = "cat") String categorie) {
		return this.repo.findByCategorie(categorie);
	}

	//http://localhost:8080/danavalley/consolesrest/annoncecat/aa
	@CrossOrigin
	@GetMapping("/annoncesdate/{date}")
	public List<Annonce> m5(@PathVariable(name = "date") String date) {
		return this.repo.findByDate(date);
	}
	
//Delete
	
	//http://localhost:8080/danavalley/consolesrest/annonce/6
	@CrossOrigin
	@DeleteMapping("/annonces/{id}")
	public String d3(@PathVariable(name = "id") int id) {
		Annonce a = this.repo.findById(id).get();
		this.repo.delete(a);
		return "annonce suprimée";
	}
	
	
//Update
	//http://localhost:8080/danavalley/consolesrest/annonce
	@CrossOrigin
	@PutMapping("/annonces") 
	public String m5(@RequestBody Annonce a) {
		repo.save(a);
		return "annonce a jour";
	}
	
}
