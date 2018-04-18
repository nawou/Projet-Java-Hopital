/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author smahe
 */
public class Service {
   private String code_service, nom;
   private int directeur;
   private boolean batiment;
   
    public void Service(){
   code_service= null ;
   batiment=true;
   nom=null;
   directeur=0;
   }
   
   public String getCode_service(){
       return code_service;
   }
   
   public String getNom(){
       return nom;
   }
   
   public boolean getBatiment(){
       return batiment;
   }
   
   public int getDirecteur(){
       return directeur;
   }
   
   public void setCode_service(String code_service){
       this.code_service=code_service;
   }
   
    public void setNom(String nom){
       this.nom=nom;
   }
    
    public void setBatiment(boolean batiment){
       this.batiment=batiment;
   }
    
     public void setDirecteur(int directeur){
       this.directeur=directeur;
   }
    
    
}
