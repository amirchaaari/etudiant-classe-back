package com.nadhem.etudiants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.etudiants.entities.Classe;
import com.nadhem.etudiants.entities.Etudiant;
import com.nadhem.etudiants.repos.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired 
	EtudiantRepository etudiantRepository ;

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);

	}

	@Override
	public void deleteEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		 etudiantRepository.delete(e);

	}

	@Override
	public void deleteEtudiantById(Long id) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(id);

		
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		// TODO Auto-generated method stub
		return  etudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		 return etudiantRepository.findAll();

	}

	@Override
	public List<Etudiant> findByNom(String nom) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNom(nom);
	}

	@Override
	public List<Etudiant> findByNomContains(String nom) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNomContains(nom);
	}

	@Override
	public List<Etudiant> findByNomPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByNomPrenom(nom, prenom);
	}

	@Override
	public List<Etudiant> findByClasse(Classe classe) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByClasse(classe);
	}

	@Override
	public List<Etudiant> findByClasseIdClasse(Long id) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByClasseIdClasse(id);
	}

}
