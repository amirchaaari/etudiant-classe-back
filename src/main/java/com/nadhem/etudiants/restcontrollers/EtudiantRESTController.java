package com.nadhem.etudiants.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import com.nadhem.etudiants.entities.Etudiant;
import com.nadhem.etudiants.service.EtudiantService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class EtudiantRESTController {
	@Autowired
	EtudiantService etudiantService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Etudiant> getAllEtudiants() {
	return etudiantService.getAllEtudiants();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Etudiant getEtudiantById(@PathVariable("id") Long id) {
	return etudiantService.getEtudiant(id);
	 }
	

	@RequestMapping(method = RequestMethod.POST)
	public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
	return etudiantService.saveEtudiant(etudiant);
	}


	@RequestMapping(method = RequestMethod.PUT)
	public Etudiant updateProduit(@RequestBody Etudiant etudiant) {
	return etudiantService.updateEtudiant(etudiant);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEtudiant(@PathVariable("id") Long id)
	{
	etudiantService.deleteEtudiantById(id);
	}

	@RequestMapping(value="/etudclasse/{idClasse}",method = RequestMethod.GET)
	public List<Etudiant> getEtudiantByClasseId(@PathVariable("idClasse") Long id) {
	return etudiantService.findByClasseIdClasse(id);
	}

}









































