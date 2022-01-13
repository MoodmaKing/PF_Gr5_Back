package com.example.PF_Gr5_Back.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PF_Gr5_Back.model.Departement;
import com.example.PF_Gr5_Back.repo.DepartementRepo;



@RestController
@RequestMapping("/api")
public class DepartementRestController {

	@Autowired
	private DepartementRepo repo;
	
	//http://localhost:8080/danavalley/consolesrest/annonce
		@CrossOrigin
		@GetMapping("/departements")
		public List<Departement> m1() {
			return this.repo.findAll();
		}
		
		//http://localhost:8080/danavalley/consolesrest/annonce/1
		@CrossOrigin
		@GetMapping("/departements/{id}")
		public Departement m2(@PathVariable(name = "id") int id) {
			return this.repo.findById(id).get();
		}
}
