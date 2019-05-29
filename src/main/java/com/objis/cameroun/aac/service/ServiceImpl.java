package com.objis.cameroun.aac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objis.cameroun.aac.domaine.entities.Agriculteur;
import com.objis.cameroun.aac.repository.AgriculteurRepository;

@Service
public class ServiceImpl implements IService {

	//injection de l'interface repository
	@Autowired
	private AgriculteurRepository agriculteurRepository;
	
	
	public Agriculteur enregistrerAgriculteurService(Agriculteur agriculteur) {
		
		return agriculteurRepository.save(agriculteur);

	}
	
	public List<Agriculteur> listAgriculteursService() {
		
		return agriculteurRepository.findAll();
	}

}
