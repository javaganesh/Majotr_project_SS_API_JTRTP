package com.google.in.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.in.model.Citizen;

@Service
public class CitizenService {
	


	private Map<String, Citizen> citizenData = new HashMap<>();

    public Citizen getCitizenBySSN(String ssn) {
    	 String determineStateName = determineStateName(ssn);
        return citizenData.get(determineStateName);
    }

    
    
    public void addCitizen(Citizen citizen) {
        citizenData.put(citizen.getStateName(), citizen);
    }


	private String determineStateName(String ssn) {
		// Logic to determine state name based on SSN prefix
		char ssnPrefix = ssn.charAt(0);
		switch (ssnPrefix) {
		case '1':
			return "New Jersey";
		case '2':
			return "Ohio";
		case '3':
			return "Texas";
		case '4':
			return "California";
		case '5':
			return "Rhode Island";
		case '6':
			return "Kentucky";
		default:
			return "Invalid SSN";
		}
	}
}
