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
public class Soigne {
   private int no_docteur , no_malade;
   
   public void Soigne(){
   no_docteur=0;
   no_malade=0;
   }
   
   public int getNo_docteur(){
       return no_docteur;
   }
   
   public int getNo_malade(){
       return no_malade;
   }
   
   public void setNo_docteur(int no_docteur){
       this.no_docteur=no_docteur;
   }
   
    public void setNo_malade(int no_malade){
       this.no_malade=no_malade;
   }
  
    
}
