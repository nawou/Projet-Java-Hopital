/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author smahe
 */
public class AffichageBDD {
     
    ArrayList <String> listeChambre;
    ArrayList <String> listeDocteur;
    ArrayList <String> listeEmploye;
    ArrayList <String> listeHospitalisation;
    ArrayList <String> listeInfirmier;
    ArrayList <String> listeMalade;
    ArrayList <String> listeService;
    ArrayList <String> listeSoigne;
    
    Connexion conn;
    
    public void AffichageBDD() throws SQLException, ClassNotFoundException{
        /** Remplir les attributs de chaque tables */
        conn = new Connexion("hopital","root","");
        listeChambre = conn.remplirChampsTable("chambre");
        listeDocteur = conn.remplirChampsTable("docteur");
        listeService = conn.remplirChampsTable("service");
        listeSoigne = conn.remplirChampsTable("soigne");
        listeEmploye = conn.remplirChampsTable("employe");
        listeHospitalisation = conn.remplirChampsTable("hospitalisation");
        listeInfirmier = conn.remplirChampsTable("infirmier");
        listeMalade = conn.remplirChampsTable("malade");
    }

}
