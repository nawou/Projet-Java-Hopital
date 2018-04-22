/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author clara
 */
public class Mise_a_jour {
    
      Connexion cn;
      String query, query1;
      ArrayList<String> arr;
      
      public Mise_a_jour() throws ClassNotFoundException, SQLException{
        cn = new Connexion("Hopital", "root", "root");
}
      /*public boolean DeleteEmploye (String nom, String prenom) throws  SQLException{
              
      query = "DELETE FROM employe WHERE true";
      if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
      if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";} 
      try{System.out.print(query);
          //arr=cn.remplirChampsRequete(query);
          cn.executeUpdate(query);
          return true;}catch(SQLException e)
      { 
        JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");
        e.printStackTrace();
        return false;
      //JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");}
       }
     }*/
      
      public boolean DeleteEmploye (String nom,String prenom) throws SQLException{
              
      query1 = "SELECT * FROM employe WHERE true AND nom='"+ nom + "' AND prenom ='" + prenom + "'"; 
       query = "DELETE FROM employe WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";} 
      try {
      
          //arr=cn.remplirChampsRequete(query);
          if(cn.remplirChampsRequete(query1).size()==0){
              JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");
              return false;
          }
       else cn.executeUpdate(query);
      return true;}catch(SQLException e)
      {e.printStackTrace();
      JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");
      return false; }
       
      }
      
      public boolean AjouterEmploye (String numero, String nom, String prenom, String adresse, String tel) throws SQLIntegrityConstraintViolationException, SQLException{
       
      query = "INSERT INTO employe VALUES('" +numero+ "','" +nom+ "','"+ prenom+ "','" +adresse+ "','" +tel+ "')";
      try {
      cn.executeUpdate(query);
      return true;
      } catch (SQLIntegrityConstraintViolationException e) {
      JOptionPane.showMessageDialog(null,"Ce numéro d'employé existe déjà.");
      return false;
      } catch (SQLException e) {
       e.printStackTrace();
       return false;
      }
      
      /*try {System.out.print(query);
          cn.executeUpdate(query);
      }catch(SQLException e)
      {e.printStackTrace();} */  
    }
       
      public boolean AjouterMalade (String numero, String nom, String prenom, String adresse, String tel, String mutuelle){ 
          
      query = "INSERT INTO malade VALUES('" +numero+ "','" +nom+ "','"+ prenom+ "','" +adresse+ "','" +tel+ "','"+mutuelle+"')";
      try {
      cn.executeUpdate(query);
      return true;
      } catch (SQLIntegrityConstraintViolationException e) {
      JOptionPane.showMessageDialog(null,"Ce numéro de patient existe déjà.");
      return false;
      } catch (SQLException e) {
       e.printStackTrace();
       return false;  
      }
      }
      
      public boolean DeleteMalade (String nom,String prenom) throws SQLException{
              
      query1 = "SELECT * FROM malade WHERE true AND nom='"+ nom + "' AND prenom ='" + prenom + "'"; 
       query = "DELETE FROM malade WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     if (!prenom.equals("")){query+=" AND prenom ='" + prenom + "'";} 
      try {
          //arr=cn.remplirChampsRequete(query);
          if(cn.remplirChampsRequete(query1).size()==0){
              JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");
              return false;
          }
       else cn.executeUpdate(query);
      return true;}catch(SQLException e)
      {e.printStackTrace();
      JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes");
      return false; }
       
      }
     
      
      
      //Modifier un employe en recherchant son nom et en entrant tout le reste de ses infos 
      public boolean ModifierEmploye (String nomAncien, String nom, String prenom, String adresse, String tel) throws SQLException{
     //Connexion cn = new Connexion("Hopital", "root", "root");
     query1 = "SELECT * FROM employe WHERE true AND nom='"+ nomAncien + "'"; 
     query = "UPDATE employe SET nom ='"+nom+"' ,prenom ='"+prenom+"' ,adresse='"+adresse+"' ,tel ='"+tel+"' WHERE nom='" + nomAncien+ "'" ;
     try {
     if(cn.remplirChampsRequete(query1).size()==0){
              JOptionPane.showMessageDialog(null,"Cet employé n'existe pas");
              return false;}
          //arr=cn.remplirChampsRequete(query);
     else cn.executeUpdate(query);
     return true;
     }catch(SQLException e)
      {e.printStackTrace();
      return false;}
    }
     
      
      //Modifier un employe en recherchant son nom et en entrant tout le reste de ses infos 
      public boolean ModifierMalade (String nomAncien, String nom, String prenom, String adresse, String tel, String mutuelle) throws SQLException{
     //Connexion cn = new Connexion("Hopital", "root", "root");
     query1 = "SELECT * FROM malade WHERE true AND nom='"+ nomAncien + "'"; 
     query = "UPDATE malade SET nom ='"+nom+"' ,prenom ='"+prenom+"' ,adresse='"+adresse+"' ,tel ='"+tel+ "' ,mutuelle= '"+ mutuelle +"' WHERE nom='" + nomAncien+ "'" ;
     try {
     if(cn.remplirChampsRequete(query1).size()==0){
              JOptionPane.showMessageDialog(null,"Ce patient n'existe pas");
              return false;}
          //arr=cn.remplirChampsRequete(query);
     else cn.executeUpdate(query);
     return true;
     }catch(SQLException e)
      {e.printStackTrace();
      return false;}
    }
     
    /*  
///Modifier un malade en recherchant son nom et en entrant tout le reste de ses infos 
       public void ModifierMalade (String nomAncien, String numero, String nom, String prenom, String adresse, String tel, String mutuelle) throws SQLException{
     //Connexion cn = new Connexion("Hopital", "root", "root");
     query = "UPDATE malade SET numero ='" + numero+"' ,nom ='"+nom+"' ,prenom ='"+prenom+"' ,adresse='"+adresse+"' ,tel ='"+tel+ "' ,mutuelle= '"+mutuelle+"' WHERE nom='" + nomAncien+ "'" ;
     try {System.out.print(query);
          //arr=cn.remplirChampsRequete(query);
          cn.executeUpdate(query);}catch(SQLException e)
      {e.printStackTrace();}
    }*/

}