/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.cameroun.aac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.cameroun.aac.domaine.entities.Agriculteur;


/**
 *
 * @author fouomene
 */
public interface AgriculteurRepository extends JpaRepository<Agriculteur, Long>{


}
