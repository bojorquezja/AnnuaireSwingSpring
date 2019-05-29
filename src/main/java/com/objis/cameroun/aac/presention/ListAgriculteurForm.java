package com.objis.cameroun.aac.presention;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.objis.cameroun.aac.domaine.AgriculteurModel;
import com.objis.cameroun.aac.domaine.entities.Agriculteur;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

import javax.swing.JTable;

@Component
public class ListAgriculteurForm extends JFrame {
   

	
	private JPanel contentPane;
	private JTable table;
	private AgriculteurModel agriculteurModel;
	
	private List<Agriculteur> agriculteurs = Collections.emptyList();



	/**
	 * Create the frame.
	 */
	public ListAgriculteurForm() {
		setTitle("Liste des Agriculteurs");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		
		
		// appel de la couche service
		
		//IService service = new ServiceImpl();
		
		//appel de la methode listAgriculteursService la couche service
		
		
		//agriculteurs = service.listAgriculteursService() ;
		
	    agriculteurModel = new AgriculteurModel(agriculteurs);
		
	    table = new JTable(agriculteurModel);
		table.setBounds(405, 239, -395, -225);
		
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
	}



	public List<Agriculteur> getAgriculteurs() {
		return agriculteurs;
	}



	public void setAgriculteurs(List<Agriculteur> agriculteurs) {
		this.agriculteurs = agriculteurs;
		
		agriculteurModel.setAgriculteurs(agriculteurs);
		agriculteurModel.fireTableDataChanged(); 
	}
	
	
	
	
}
