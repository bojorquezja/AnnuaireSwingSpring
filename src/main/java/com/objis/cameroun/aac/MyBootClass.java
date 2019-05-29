/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.cameroun.aac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;


import com.objis.cameroun.aac.presention.HomeAAC;


/**
 *
 * @author fouomene
 */
@SpringBootApplication       // @Configuration @EnableAutoConfiguration @ComponentScan
public class MyBootClass {

	
public static void main(String[] args) {
    	
        ConfigurableApplicationContext context = 
        		new SpringApplicationBuilder(MyBootClass.class)
        		.headless(false)
        		.run(args);
        HomeAAC window = context.getBean(HomeAAC.class);
        window.frmAnnuaireAgriculteurCameroun.setVisible(true);  		       
    }




}
