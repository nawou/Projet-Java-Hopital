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
import Vue.FenetreRecherche;


/**
 *
 * @author nawellalioui
 */
public class TestHopital { 
    
    Statement myStat = null;
    ResultSet myRs = null;
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
    //Connexion cn = new Connexion(); 
MenuConnexion mconnexion = new MenuConnexion();
 /** Connexion cn;
    cn = new Connexion("Hopital","root","");
    MenuConnexion mconnexion = new MenuConnexion();
    //FenetreConnexionLocale fe = new FenetreConnexionLocale();
    //System.out.println(afficherAttribut("medecin"));
=======
    //Connexion cn;
    //cn = new Connexion("Hopital","root","");
    //MenuConnexion mconnexion = new MenuConnexion();
    //FenetreConnexionLocale fe = new FenetreConnexionLocale();
    //System.out.println(afficherAttribut("medecin"));

>>>>>>> 663819a7a50118550d2426facde8bbbaab6a8538
   
    */
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

      /**
        //Rechercher un docteur 
      String spe= sc.nextLine();
      String nom1= sc.nextLine();
      String prenom1= sc.nextLine();
      ArrayList r1 = rech.rechercherDocteur(spe,nom1,prenom1);
      for (int i = 0; i < r1.size(); i++){
              System.out.println(r1.get(i));
          }
      
     //Rechercher un infirmier
     String rot= sc.nextLine();
     String nom2= sc.nextLine();
     String prenom2= sc.nextLine();
      ArrayList r2 = rech.rechercherInfirmier(rot,nom2,prenom2);
      for (int i = 0; i < r2.size(); i++){
              System.out.println(r2.get(i));
          }
          
    //Rechercher un service
     String nomService= sc.nextLine();
     String nom3= sc.nextLine();
     String prenom3= sc.nextLine();
     ArrayList r3 = rech.rechercherService(nomService,nom3,prenom3);
      for (int i = 0; i < r3.size(); i++){
              System.out.println(r3.get(i));
          }
    
      /**         
    //Rechercher un malade
     String nom4= sc.nextLine();
     String prenom4= sc.nextLine();
     String mutuelle= sc.nextLine();
     ArrayList r4 = rech.rechercherMalade(nom4,prenom4, mutuelle);
      for (int i = 0; i < r4.size(); i++){
              System.out.println(r4.get(i));
          } 
    
      
      //Rechercher un malade à partir d'un numero de chambre
     String nom5= sc.nextLine();
     String prenom5= sc.nextLine();
     String no_chambre= sc.nextLine();
     ArrayList r5 = rech.rechercherHospitalisation(nom5,prenom5, no_chambre);
      for (int i = 0; i < r5.size(); i++){
              System.out.println(r5.get(i));
          } 
     
       //Rechercher les infos d'une info d'une chambre
     String nb_lits= sc.nextLine(); //On recherche les chambres à partir du nombre de lits
     String no_chambre= sc.nextLine(); //Recherche à partir du num de la chambre
     ArrayList r6 = rech.rechercherChambre(nb_lits, no_chambre);
      for (int i = 0; i < r6.size(); i++){
              System.out.println(r6.get(i));
          } 
      */
       //Rechercher les infos d'une info d'un patient soigné
     String nom= sc.nextLine(); //On recherche la personne soignée a partir de son nom
     String prenom= sc.nextLine(); //On recherche la personne soignée a partir de son prenom
     String nomD= sc.nextLine(); //On recherche la personne soignée a partir du nom de son medecin
     String prenomD= sc.nextLine(); //On recherche la personne soignée a partir du prenom de son medecin
     ArrayList r7 = rech.rechercherSoigne(nom, prenom,nomD, prenomD);
      for (int i = 0; i < r7.size(); i++){
              System.out.println(r7.get(i));
          } 
}
/**
      String nom = sc.nextLine();
      maj.DeleteEmploye(nom);
      //ArrayList r = rech.rechercherInfirmier(rot);
      //for (int i = 0; i < r.size(); i++){
              //System.out.print(r.get(i));
         // }
     
    

    }

*/
}



    
