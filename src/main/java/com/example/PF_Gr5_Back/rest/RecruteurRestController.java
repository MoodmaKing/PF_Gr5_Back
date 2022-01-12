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

import com.example.PF_Gr5_Back.model.Recruteur;
import com.example.PF_Gr5_Back.repo.RecruteurRepository;

@RestController
@RequestMapping("/recruteur")
public class RecruteurRestController {
	@Autowired
	private RecruteurRepository repo;
	
	@GetMapping("/hello")
	public String getHello(){
		//Sur PostMan : http://localhost:8080/formation/rest/hello
		return "hello recruteur";
	}
	
	//find All recruteurs
	@CrossOrigin
	@GetMapping("/recruteurs")
	public List<Recruteur> list(){
		return this.repo.findAll();
	}
	
	//find recruteur by id
	@CrossOrigin
	@GetMapping("/recruteurs/{id}")
	public Recruteur findById(@PathVariable(name = "id") Integer id) {
		return this.repo.findById(id).get();

	}
	
	//create recruteur
	@CrossOrigin
	@PostMapping("/recruteurs")
	public void create(@RequestBody Recruteur recruteur) {
		this.repo.save(recruteur);
	}
	
	//update recruteur
	@CrossOrigin
	@PutMapping("/recruteurs")
	public void update(@RequestBody Recruteur recruteur) {

		this.repo.save(recruteur);

	}
	
	//delete recruteur
	@CrossOrigin
	@DeleteMapping("/recruteurs/{id}")
	public void delete(@PathVariable(name = "id") Integer id) {
		Recruteur r = this.repo.findById(id).get();
		this.repo.delete(r);

	}

}
