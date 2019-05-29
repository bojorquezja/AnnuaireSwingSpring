package com.objis.cameroun.aac.presention;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.objis.cameroun.aac.domaine.entities.Agriculteur;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@Component
public class EnregitreAgriculteurForm extends JFrame {

    @Autowired	
	private IService service ;
	
	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField domaineTextField;
	private JTextField telephoneTextField;
	private JTextField villageTextField;
	private JTextField experienceTextField;

	
	/**
	 * Create the frame.
	 */
	public EnregitreAgriculteurForm() {
		setTitle("Enregistrer un Agriculteur");
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(12, 30, 56, 16);
		contentPane.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(79, 27, 241, 22);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(12, 73, 56, 16);
		contentPane.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(79, 70, 241, 22);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblDomaine = new JLabel("Domaine :");
		lblDomaine.setBounds(12, 112, 68, 16);
		contentPane.add(lblDomaine);
		
		domaineTextField = new JTextField();
		domaineTextField.setBounds(89, 109, 226, 22);
		contentPane.add(domaineTextField);
		domaineTextField.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telephone : ");
		lblTelephone.setBounds(12, 165, 90, 16);
		contentPane.add(lblTelephone);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setBounds(114, 162, 201, 22);
		contentPane.add(telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JLabel lblVillage = new JLabel("Village : ");
		lblVillage.setBounds(12, 204, 56, 16);
		contentPane.add(lblVillage);
		
		villageTextField = new JTextField();
		villageTextField.setBounds(98, 201, 222, 22);
		contentPane.add(villageTextField);
		villageTextField.setColumns(10);
		
		JLabel lblExperience = new JLabel("Experience :");
		lblExperience.setBounds(12, 245, 90, 16);
		contentPane.add(lblExperience);
		
		experienceTextField = new JTextField();
		experienceTextField.setBounds(114, 242, 201, 22);
		contentPane.add(experienceTextField);
		experienceTextField.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//recuperation des valeur saisir par l'utilisateur
				
				String nom = nomTextField.getText();
				String prenom = prenomTextField.getText();
				String domaine = domaineTextField.getText();
				String telephone = telephoneTextField.getText();
				String village = villageTextField.getText();
				int experience = Integer.parseInt(experienceTextField.getText());
				
				// creation d'un objet agriculteur et initialisatin de ses attributs.
				
				Agriculteur agriculteur = new Agriculteur();
				agriculteur.setNom(nom);
				agriculteur.setPrenom(prenom);
				agriculteur.setDomaine(domaine);
				agriculteur.setTelephone(telephone);
				agriculteur.setVillage(village);
				agriculteur.setExperience(experience);
				
				// Enregistremement de l'objet agriculteur dans la bd via couche service
				
				// appel de la couche service
				
				//IService service = new ServiceImpl();
				
				//appel de la methode enregisterAgriculteurService de la couche service
				
				//Agriculteur  agriculteur;
				
				agriculteur = service.enregistrerAgriculteurService(agriculteur);
				
				if(agriculteur!=null) {
					  JOptionPane.showMessageDialog(null, "Agriculteur" + agriculteur.getNom() + 
							  "enregistré dans la BD!");
					  
					  nomTextField.setText("");
					  prenomTextField.setText("");
					  domaineTextField.setText("");
					  telephoneTextField.setText("");
					  villageTextField.setText("");
					  experienceTextField.setText("");
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement de l'agriculteur!!! ");
				  }
				
				
				
			}
		});
		btnEnregistrer.setBounds(217, 295, 97, 25);
		contentPane.add(btnEnregistrer);
	}
}
