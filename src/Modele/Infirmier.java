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
public class Infirmier {
   private String code_service;
   boolean rotation;
   private int numero , salaire;
   
   public void Infirmier(){
   code_service= null ;
   rotation=true;
   numero=0;
   salaire=0;
   }
   
   public String getCode_service(){
       return code_service;
   }
   
   public int getNumero(){
       return numero;
   }
   
   public boolean getRotation(){
       return rotation;
   }
   
   public int getSalaire(){
       return salaire;
   }
   
   public void setCode_service(String code_service){
       this.code_service=code_service;
   }
   
    public void setNumero(int numero){
       this.numero=numero;
   }
    
    public void setRotation(boolean rotation){
       this.rotation=rotation;
   }
    
     public void setSalaire(int salaire){
       this.salaire=salaire;
   }
    
    
}
