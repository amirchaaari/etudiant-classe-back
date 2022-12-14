package com.nadhem.etudiants.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nadhem.etudiants.entities.Classe;
import com.nadhem.etudiants.entities.Etudiant;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//@RepositoryRestResource(path = "rest")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNomContains(String nom);
	@Query("select e from Etudiant e where e.nom like %?1 and e.prenom like %?2")
	List<Etudiant> findByNomPrenom (String nom, String prenom);
	@Query("select e from Etudiant e where e.classe = ?1")
	List<Etudiant> findByClasse (Classe classe);
	List<Etudiant> findByClasseIdClasse(Long id);

}
