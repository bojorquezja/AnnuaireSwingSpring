package com.objis.cameroun.aac.presention;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.objis.cameroun.aac.service.IService;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@Component
public class HomeAAC {
	
	@Autowired
	private EnregitreAgriculteurForm frameEnregistre;
	
	@Autowired
	private ListAgriculteurForm frameListe;
	
	@Autowired
	private IService service;

	public JFrame frmAnnuaireAgriculteurCameroun;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAAC window = new HomeAAC();
					window.frmAnnuaireAgriculteurCameroun.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public HomeAAC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAnnuaireAgriculteurCameroun = new JFrame();
		frmAnnuaireAgriculteurCameroun.getContentPane().setBackground(Color.WHITE);
		frmAnnuaireAgriculteurCameroun.setTitle("Annuaire Agriculteur Cameroun");
		frmAnnuaireAgriculteurCameroun.setBounds(100, 100, 450, 300);
		frmAnnuaireAgriculteurCameroun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAnnuaireAgriculteurCameroun.setJMenuBar(menuBar);
		
		JMenu mnAnnuaire = new JMenu("Annuaire");
		menuBar.add(mnAnnuaire);
		
		JMenuItem mntmEnregisterAgriculteur = new JMenuItem("Enregister Agriculteur");
		mntmEnregisterAgriculteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//EnregitreAgriculteurForm frame = new EnregitreAgriculteurForm();
				frameEnregistre.setVisible(true);
				
			}
		});
		mnAnnuaire.add(mntmEnregisterAgriculteur);
		
		JMenuItem mntmListeAgriculteur = new JMenuItem("Liste Agriculteur");
		mntmListeAgriculteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//ListAgriculteurForm frame = new ListAgriculteurForm();
				
				
				frameListe.setAgriculteurs(service.listAgriculteursService());
				frameListe.setVisible(true);
				
				
			}
		});
		mnAnnuaire.add(mntmListeAgriculteur);
		
		JMenu mnAnnonces = new JMenu("Annonces");
		menuBar.add(mnAnnonces);
		
		JMenu mnForum = new JMenu("Forum");
		menuBar.add(mnForum);
		frmAnnuaireAgriculteurCameroun.getContentPane().setLayout(null);
		
		JLabel lblBienvenueDansLannaire = new JLabel("Bienvenue dans l'annaire ders agriculteurs du Cameroun");
		lblBienvenueDansLannaire.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\bgGreenYellow1.jpg"));
		lblBienvenueDansLannaire.setForeground(Color.RED);
		lblBienvenueDansLannaire.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBienvenueDansLannaire.setBounds(0, 13, 407, 201);
		frmAnnuaireAgriculteurCameroun.getContentPane().add(lblBienvenueDansLannaire);
	}
}
