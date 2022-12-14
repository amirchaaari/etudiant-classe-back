package com.nadhem.etudiants;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadhem.etudiants.entities.Classe;
import com.nadhem.etudiants.entities.Etudiant;
import com.nadhem.etudiants.repos.EtudiantRepository;


@SpringBootTest
class EtudiantsV2ApplicationTests {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Test
	public void testCreateEtudiant() {
	@SuppressWarnings("deprecation")
	Etudiant etud = new Etudiant("flen","foulen",new Date("09/04/2003"),"14330070");
	etudiantRepository.save(etud);
	}
	
	
	@Test
	public void testFindEtudiant()
	{
	Etudiant etud = etudiantRepository.findById(1L).get(); 
	System.out.println(etud);
	
	}
	
	@Test
	public void testUpdateProduit()
	{
	Etudiant e = etudiantRepository.findById(1L).get();
	e.setNom("karim");
	etudiantRepository.save(e);
	}
	@Test
	public void testDeleteProduit()
	{
	etudiantRepository.deleteById(1L);;
	}
	
	 
	@Test
	public void testListerTousProduits()
	{
	List<Etudiant> etuds = etudiantRepository.findAll();
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	}
	
	
	@Test
	public void testFindByNom()
	{
	List<Etudiant> etuds = etudiantRepository.findByNom("amir");

	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	@Test
	public void testFindByNomContains ()
	{
	List<Etudiant> etuds=etudiantRepository.findByNomContains("karim");

	for (Etudiant e : etuds)
	{
	System.out.println(e);
	} }
	
	
	@Test
	public void testfindByNomPrenom()
	{
	List<Etudiant> etuds = etudiantRepository.findByNomPrenom("amir","chaari" );
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	
	@Test
	public void testfindByClasse()
	{
	Classe cls = new Classe();
	cls.setIdClasse(1L);
	List<Etudiant> etud = etudiantRepository.findByClasse(cls);
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void findByClasseIdClasse()
	{
	List<Etudiant> etuds = etudiantRepository.findByClasseIdClasse(1L);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	 }

	
	
	

}
