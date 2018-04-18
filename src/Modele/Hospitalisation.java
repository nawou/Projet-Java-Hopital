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
public class Hospitalisation {
     private String code_service;
   private int no_chambre , no_malade, lit;
   
   public void Hospitalisation(){
   code_service= null ;
   no_chambre=0;
   no_malade=0;
   lit=0;
   }
   
   public String getCode_service(){
       return code_service;
   }
   
   public int getNo_chambre(){
       return no_chambre;
   }
   
   public int getNo_malade(){
       return no_malade;
   }
   
   public int getLit(){
       return lit;
   }
   
   public void setCode_service(String code_service){
       this.code_service=code_service;
   }
   
    public void setNo_chambre(int no_chambre){
       this.no_chambre=no_chambre;
   }
    
    public void setNo_malade(int no_malade){
       this.no_malade=no_malade;
   }
    
     public void setLit(int lit){
       this.lit=lit;
   }
     
}
