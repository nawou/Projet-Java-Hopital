/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrôleur;
import java.sql.*;

import Modele.Connexion;
import Modele.Mise_a_jour;
import Modele.Recherche;
import Vue.FenChoixModule;
import Vue.FenetreConnexionLocale;
import Vue.MenuConnexion;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author nawellalioui
 */
public class TestHopital { 
    
    Statement myStat = null;
    ResultSet myRs = null;
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
    //Connexion cn = new Connexion(); 

    //Connexion cn;
    //cn = new Connexion("Hopital","root","");
    //MenuConnexion mconnexion = new MenuConnexion();
    //FenetreConnexionLocale fe = new FenetreConnexionLocale();
    //System.out.println(afficherAttribut("medecin"));

   
    
    //Connexion cn;
    //cn = new Connexion("Hopital","root","root");
    //MenuConnexion mconnexion = new MenuConnexion();
    //FenetreConnexionLocale fe = new FenetreConnexionLocale();
    //FenChoixModule fen = new FenChoixModule();
    /*try {
          ArrayList result = cn.remplirChampsRequete("SELECT * FROM malade;");
          ArrayList re = cn.remplirChampsRequete("SELECT prenom, nom FROM malade WHERE mutuelle ='MAAF'");
          ArrayList champsMalade = cn.remplirChampsTable("malade");
          
          for (int i = 0; i < champsMalade.size(); i++){
              System.out.print(champsMalade.get(i));
          }
                    } catch (SQLException e){
            e.printStackTrace();
            }*/
    /*Recherche rech = new Recherche();
    ArrayList r = rech.rechercherService("Cardiologie");
     for (int i = 0; i < r.size(); i++){
              System.out.print(r.get(i));
          }
    
      Recherche rech = new Recherche();
     ArrayList r = rech.rechercherChambre("101", "3");
     for (int i = 0; i < r.size(); i++){
              System.out.print(r.get(i));
          }
      
     Recherche rech = new Recherche();
     ArrayList r = rech.rechercherEmploye("", "Rafael");
     for (int i = 0; i < r.size(); i++){
              System.out.print(r.get(i));
          }
     
      Recherche rech = new Recherche();
      ArrayList r = rech.rechercherDocteur("Cardiologue");
      for (int i = 0; i < r.size(); i++){
              System.out.print(r.get(i));
          }*/

      Recherche rech = new Recherche();
      Mise_a_jour maj= new Mise_a_jour();
      Scanner sc = new Scanner(System.in);
      
      //L'utilisateur choisi lui meme les possibilités ( à reproduire dans un Jtextfield! mais attention blindage !!
      String nom = sc.nextLine();
      maj.DeleteEmploye(nom);
      //ArrayList r = rech.rechercherInfirmier(rot);
      //for (int i = 0; i < r.size(); i++){
              //System.out.print(r.get(i));
         // }
     
    

    }

}



    
