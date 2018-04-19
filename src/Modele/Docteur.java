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
public class Docteur {
   private String specialite;
   private int numero;
   
   public void Docteur(){
   specialite= null ;
   numero=0;
   }
   
   public String getSpecialite(){
       return specialite;
   }
   
   public int getNumero(){
       return numero;
   }
   
   public void setSpecialite(String specialite){
       this.specialite=specialite;
   }
   
    public void setNumero(int numero){
       this.numero=numero;
   }
     
}
