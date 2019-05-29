package com.objis.cameroun.aac.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.objis.cameroun.aac.domaine.entities.Agriculteur;

public class AgriculteurModel extends AbstractTableModel {

    private final String[] entetes = {"Numero","Nom","Prenom","Domaine","Telephone","Village","Experience" };

    private List<Agriculteur> agriculteurs;

    public AgriculteurModel(List<Agriculteur> agriculteurs) {  
        this.agriculteurs = agriculteurs; 
    }


    public List<Agriculteur> getAgriculteurs() {
		return agriculteurs;
	}

	public void setAgriculteurs(List<Agriculteur> agriculteurs) {
		this.agriculteurs = agriculteurs;
	}

	
    public int getRowCount() {
        return agriculteurs.size();
    }

 
    public int getColumnCount() {
        return entetes.length;
    }

 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return agriculteurs.get(rowIndex).getIdAgriculteur();

            case 1:
                // Nom
                return agriculteurs.get(rowIndex).getNom();
            case 2:
                // Prenom
                return agriculteurs.get(rowIndex).getPrenom();
            case 3:
                // Domaine
                return agriculteurs.get(rowIndex).getDomaine();
            case 4:
                // Telephone
                return agriculteurs.get(rowIndex).getTelephone();
            case 5:
                // Village
                return agriculteurs.get(rowIndex).getVillage();
            case 6:
                // Experience
                return agriculteurs.get(rowIndex).getExperience();
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
