package com.objis.cameroun.aac.domaine.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agriculteur {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idAgriculteur;
	
	private String nom;
	private String prenom;
	private String domaine;
	private String telephone;
	private String village;
	private int experience;
	
	
}
