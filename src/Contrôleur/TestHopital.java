/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrôleur;
import java.sql.*;

import Modele.Connexion;
import Vue.FenetreConnexionLocale;
import Vue.MenuConnexion;


/**
 *
 * @author nawellalioui
 */
public class TestHopital { 
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
    //Connexion cn = new Connexion(); 
    Connexion cn;
    cn = new Connexion("Hopital","root","");
    MenuConnexion mconnexion = new MenuConnexion();
    //FenetreConnexionLocale fe = new FenetreConnexionLocale();
    //System.out.println(afficherAttribut("medecin"));
    }

}



    
