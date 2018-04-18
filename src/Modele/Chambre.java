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
public class Chambre {
   private String code_service;
   private int no_chambre , surveillant, nb_lits;
   
   public void Chambre(){
   code_service= null ;
   no_chambre=0;
   surveillant=0;
   nb_lits=0;
   }
   
   public String getCode_service(){
       return code_service;
   }
   
   public int getNo_chambre(){
       return no_chambre;
   }
   
   public int getSurveillant(){
       return surveillant;
   }
   
   public int getNb_lits(){
       return nb_lits;
   }
   
   public void setCode_service(String code_service){
       this.code_service=code_service;
   }
   
    public void setNo_chambre(int no_chambre){
       this.no_chambre=no_chambre;
   }
    
    public void setSurveillant(int surveillant){
       this.surveillant=surveillant;
   }
    
     public void setNb_lits(int nb_lits){
       this.nb_lits=nb_lits;
   }
    
    
}
