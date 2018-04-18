/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author clara
 */
public class Recherche {
    public static void main(String[] args){
        
        try {
        
       
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");

        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String urlDatabase = "jdbc:mysql://localhost/hopital";
        String loginDatabase="root";
        String passwordDatabase="";
        //création d'une connexion JDBC à la base 
        Connection conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);
System.out.println("Connexion ok");
        // création d'un ordre SQL (statement)
        Statement stmt = conn.createStatement();
    System.out.println("Connexion ok");
    
    ResultSet rset = stmt.executeQuery("select * from malade");
System.out.println("Connexion ok");
        // récupération du résultat de l'ordre
         ResultSetMetaData rsetMeta = rset.getMetaData();
System.out.println("Connexion ok");

         while (rset.next()){
             System.out.println("Connexion ok");

             System.out.println("\tNom : "+rset.getString("nom") );
         }
         
        // calcul du nombre de colonnes du resultat
       
    rset.close();
    stmt.close();
        } catch (Exception e){
            e.printStackTrace();
            }
    

}
}