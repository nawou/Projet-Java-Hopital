/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author clara
 */

public class Recherche {
   
//private Connexion maconnexion;
    Connexion cn;
    String query;
    ArrayList<String> arr;

public Recherche() throws ClassNotFoundException, SQLException{
    cn = new Connexion("Hopital", "root", "root");
}


//Fonction pour rechercher un service selon le nom 
public ArrayList rechercherService (String nom) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM service WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     
      try {System.out.print(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
         
//Fonction pour rechercher une chambre selon le numéro et le nombre de lits
public ArrayList rechercherChambre (String numero, String nb_chambres) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM chambre WHERE true";
     if (!numero.equals("")){query+=" AND no_chambre ='" + numero + "'";}
     if (!nb_chambres.equals("")){query+=" AND nb_lits ='" + nb_chambres + "'";}
     
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }

   //Fonction pour rechercher un employé avec son nom et prénom
    public ArrayList rechercherEmploye (String nom, String prenom) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM employe WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";}
     
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }

   //Rechercher des docteurs selon la spécialité
    public ArrayList rechercherDocteur (String spe) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM docteur WHERE true";
     if (!spe.equals("")){query+=" AND specialite='" + spe + "'";}     
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
    
    
    //Rechercher des infirmiers selon la rotation
    public ArrayList rechercherInfirmier (String rot) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM infirmier WHERE true";
     if (!rot.equals("")){query+=" AND rotation='" + rot + "'";}     
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
}


