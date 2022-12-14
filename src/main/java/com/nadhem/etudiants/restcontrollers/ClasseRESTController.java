package com.nadhem.etudiants.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.etudiants.entities.Classe;
import com.nadhem.etudiants.repos.ClassseRepository;

@RestController
@RequestMapping("/api/classe")
@CrossOrigin("*")
public class ClasseRESTController {
@Autowired
ClassseRepository classeRepository;


@RequestMapping(method=RequestMethod.GET)
public List<Classe> getAllCategories()
{
return classeRepository.findAll();
}


@RequestMapping(value="/{id}",method = RequestMethod.GET)
public  Classe getClasseById(@PathVariable("id") Long id) {
return classeRepository.findById(id).get();
}

@RequestMapping(method = RequestMethod.POST)
public Classe createClasse(@RequestBody Classe classe) {
return classeRepository.save(classe);
}


}