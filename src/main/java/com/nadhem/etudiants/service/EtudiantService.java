package com.nadhem.etudiants.service;

import java.util.List;

import com.nadhem.etudiants.entities.Classe;
import com.nadhem.etudiants.entities.Etudiant;

public interface EtudiantService {
	
	Etudiant updateEtudiant(Etudiant p);
	Etudiant saveEtudiant(Etudiant p);
	void deleteEtudiant(Etudiant p);
	 void deleteEtudiantById(Long id);
	 Etudiant getEtudiant(Long id);
	List<Etudiant> getAllEtudiants();
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNomContains(String nom);
	List<Etudiant> findByNomPrenom (String nom, String prenom);
	List<Etudiant> findByClasse (Classe classe);
	List<Etudiant> findByClasseIdClasse(Long id);
}
