
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
 * @author smahe
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
public ArrayList rechercherService (String nomService, String nom ,String prenom) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT service.nom, service.batiment, employe.nom, employe.prenom, employe.tel FROM employe INNER JOIN service WHERE true AND employe.numero=service.directeur";
     if (!nom.equals("")){query+=" AND employe.nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND employe.prenom ='" + prenom + "'";}
     if (!nomService.equals("")){query+=" AND service.nom='" + nomService + "'";} //Je cherche les infos d'un service
     
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
         
//Fonction pour rechercher une chambre selon le numéro et le nombre de lits
public ArrayList rechercherChambre (String nb_lits, String no_chambre) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT chambre.no_chambre, chambre.nb_lits, employe.nom, employe.prenom, employe.tel, chambre.code_service FROM employe INNER JOIN chambre WHERE true AND employe.numero=chambre.surveillant ";
     if (!nb_lits.equals("")){query+=" AND chambre.nb_lits ='" + nb_lits + "'";}
     if (!no_chambre.equals("")){query+=" AND chambre.no_chambre ='" + no_chambre + "'";}
    
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
    public ArrayList rechercherDocteur (String spe,String nom, String prenom) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
      query= "SELECT employe.numero, employe.nom, employe.prenom, employe.tel, docteur.specialite FROM employe INNER JOIN docteur WHERE true AND employe.numero=docteur.numero" ;
     if (!nom.equals("")){query+=" AND employe.nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND employe.prenom ='" + prenom + "'";}
     if (!spe.equals("")){query+=" AND docteur.specialite='" + spe + "'";} //Recherche à partir d'une spe
     
     /** query= "SELECT * FROM docteur WHERE true";
     if (!spe.equals("")){query+=" AND specialite='" + spe + "'";}  */   
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
    
    
    //Rechercher des infirmiers selon la rotation
    public ArrayList rechercherInfirmier (String rot,String nom, String prenom) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
      //Connexion cn = new Connexion("Hopital", "root", "root");
      query= "SELECT employe.numero, employe.nom, employe.prenom, employe.tel, infirmier.rotation, infirmier.salaire FROM employe INNER JOIN infirmier WHERE true AND employe.numero=infirmier.numero";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";}
     if (!rot.equals("")){query+=" AND rotation='" + rot + "'";} //Recherche à partir d'une spe
      
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
    //Rechercher un malade
     public ArrayList rechercherMalade (String nom, String prenom, String mutuelle) throws SQLException, ClassNotFoundException{

     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT * FROM malade WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";}
     if (!mutuelle.equals("")){query+=" AND mutuelle ='" + mutuelle + "'";}
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    }
     //Recherche un patient hospitalisé 
     public ArrayList rechercherHospitalisation (String nom, String prenom, String no_chambre) throws SQLException, ClassNotFoundException{
     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT malade.nom, malade.prenom, hospitalisation.no_chambre, hospitalisation.code_service, hospitalisation.lit FROM malade INNER JOIN hospitalisation WHERE true AND malade.numero=hospitalisation.no_malade";
     if (!nom.equals("")){query+=" AND malade.nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND malade.prenom ='" + prenom + "'";}
     if (!no_chambre.equals("")){query+=" AND hospitalisation.no_chambre='" + no_chambre + "'";} //Recherche à partir du numero de la chambre
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
      {e.printStackTrace();}
      return arr;
    } 
     
      //Recherche un patient hospitalisé 
     public ArrayList rechercherSoigne (String nom, String prenom, String nomD, String prenomD) throws SQLException, ClassNotFoundException{
     //Connexion cn = new Connexion("Hopital", "root", "root");
     query= "SELECT malade.nom, malade.prenom, employe.nom, employe.prenom, docteur.specialite FROM malade INNER JOIN employe INNER JOIN soigne INNER JOIN DOCTEUR WHERE true AND malade.numero=soigne.no_malade AND employe.numero=soigne.no_docteur AND docteur.numero=employe.numero";
     if (!nom.equals("")){query+=" AND malade.nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND malade.prenom ='" + prenom + "'";}
     if (!nomD.equals("")){query+=" AND employe.nom ='" + nomD + "'";}
     if (!prenomD.equals("")){query+=" AND employe.prenom ='" + prenomD + "'";}
      try {System.out.println(query);
          arr=cn.remplirChampsRequete(query);}catch(SQLException e)
              
      {e.printStackTrace();}
      return arr;
    } 
    
}