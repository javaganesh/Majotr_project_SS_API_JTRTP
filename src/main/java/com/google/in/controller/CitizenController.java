package com.google.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.in.model.Citizen;
import com.google.in.service.CitizenService;

@RestController
public class CitizenController {

    private final CitizenService citizenService;
    

    

	@Autowired
    public CitizenController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @GetMapping("/citizen/{ssn}")
    public ResponseEntity<Citizen> getCitizenDetails(@PathVariable String ssn) {
    	Citizen citizenBySSN = citizenService.getCitizenBySSN(ssn);
    	System.out.println(citizenBySSN);
    	
		return ResponseEntity.ok(citizenBySSN);
		
        
    }

    @PostMapping("/citizen")
    public void addCitizen(@RequestBody Citizen citizen) {
        citizenService.addCitizen(citizen);
    }

}
