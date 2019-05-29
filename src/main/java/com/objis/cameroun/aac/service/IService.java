package com.objis.cameroun.aac.service;

import java.util.List;

import com.objis.cameroun.aac.domaine.entities.Agriculteur;


public interface IService {

	public Agriculteur enregistrerAgriculteurService(Agriculteur agriculteur);
	public List<Agriculteur> listAgriculteursService();
	
}
