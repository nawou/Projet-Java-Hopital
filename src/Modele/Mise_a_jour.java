/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author clara
 */
public class Mise_a_jour {
    
    private Connexion connect;
    private void remplirRequetesMaj() {
        // Requêtes d'insertion
        connect.ajouterRequeteMaj("INSERT INTO Dept (deptno,dname,loc) VALUES (50,'ECE','Paris');");

        // Requêtes de modification
        //connect.ajouterRequeteMaj("UPDATE Dept SET loc='Eiffel' WHERE loc='Paris';");

        // Requêtes de suppression
        //connect.ajouterRequeteMaj("DELETE FROM Dept WHERE loc='Eiffel';");
    }
     private void remplirTables() {
         
        connect.ajouterTable("Emp");
        connect.ajouterTable("Dept");
        connect.ajouterTable("Mission");
    }
        
    public void afficherTables() {
        for (String table : connect.tables) {
            System.out.println(table);
        }
    }

}