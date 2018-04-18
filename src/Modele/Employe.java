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
public class Employe {
    private String nom,prenom,adresse, tel;
   private int numero;
   
   public void Employe(){
   nom= null;
   prenom= null;
   adresse= null;
   tel= null;
   numero=0;
   }
   
   public String getNom(){
       return nom;
   }
   
   public String getPrenom(){
       return prenom;
   }
   
    public String getAdresse(){
       return adresse;
   }
   
   public String getTel(){
       return tel;
   }
   
   public int getNumero(){
       return numero;
   }
   
   public void setNom(String nom){
       this.nom=nom;
   }
   
   public void setPrenom(String prenom){
       this.prenom=prenom;
   }
   public void setAdresse(String adresse){
       this.adresse=adresse;
   }
    
    public void setTel(String tel){
       this.tel=tel;
   }
    
     public void setNumero(int numero){
       this.numero=numero;
   }
    
     
}
