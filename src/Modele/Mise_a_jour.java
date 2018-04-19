/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.SQLException;

/**
 *
 * @author clara
 */
public class Mise_a_jour {
    
      Connexion cn;
      String query;
      
      public void Mise_a_jour() throws ClassNotFoundException, SQLException{
        cn = new Connexion("Hopital", "root", "");
}
      public void DeleteEmploye (String nom){
              
      query = "DELETE FROM employe WHERE true";
     if (!nom.equals("")){query+=" AND nom ='" + nom + "'";}
     
      try {System.out.print(query);
          cn.executeUpdate(query);}catch(SQLException e)
      {e.printStackTrace();}
    }
}
