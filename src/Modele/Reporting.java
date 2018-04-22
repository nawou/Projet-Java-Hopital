/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author clara
 */
public class Reporting {
 
    Connexion cn; 
    public Reporting() throws ClassNotFoundException, SQLException{
        cn = new Connexion("Hopital", "root", "root");
        }
 
    public JFreeChart PatientParService() throws SQLException, ClassNotFoundException {

        
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM hospitalisation WHERE code_service='CAR'"));
          int nb_car=0;
          while(cn.getRs().next()){
              nb_car++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT *  FROM hospitalisation WHERE code_service='REA'"));
          int nb_rea=0;
          while(cn.getRs().next()){
              nb_rea++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM hospitalisation WHERE code_service='CHG'"));
          int nb_chg=0;
          while(cn.getRs().next()){
              nb_chg++;
          }
          
          DefaultPieDataset patientService= new DefaultPieDataset();
          patientService.setValue("Cardiologie", nb_car);
          patientService.setValue("Réanimation", nb_rea);
          patientService.setValue("Chirurgie générale", nb_chg);
          JFreeChart chart = ChartFactory.createPieChart("Nombre de patients par service", patientService, true, true, false);
            
            //ChartFrame frame = new ChartFrame("tes", chart);
            //frame.pack();
            //frame.setVisible(true);
            
            return chart;
                    
    }
    
    
    
    public JFreeChart DocteurParService() throws SQLException{
        //Creation de la BDD

         cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Orthopediste'"));
          int nb_orth=0;
          while(cn.getRs().next()){
              nb_orth++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Cardiologue'"));
          int nb_car=0;
          while(cn.getRs().next()){
              nb_car++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Traumatologue'"));
          int nb_trau=0;
          while(cn.getRs().next()){
              nb_trau++;
          }
          
           cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Anesthesiste'"));
          int nb_an=0;
          while(cn.getRs().next()){
              nb_an++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Pneumologue'"));
          int nb_pneu=0;
          while(cn.getRs().next()){
              nb_pneu++;
          }
          
          cn.setRs(cn.getSt().executeQuery("SELECT * FROM docteur WHERE specialite='Radiologue'"));
          int nb_rad=0;
          while(cn.getRs().next()){
              nb_rad++;
          }
          
          
          
          DefaultPieDataset docSpe= new DefaultPieDataset();
          docSpe.setValue("Orthopediste", nb_orth);
          docSpe.setValue("Cardiologue", nb_car);
          docSpe.setValue("Traumatologue",nb_trau);
          docSpe.setValue("Anesthesiste", nb_an);
          docSpe.setValue("Pneumologue", nb_pneu);
          docSpe.setValue("Radiologue", nb_rad);
          JFreeChart chart = ChartFactory.createPieChart("Nombre de médecins par spécialité", docSpe, true, true, false);
            
            //ChartFrame frame = new ChartFrame("tes", chart);
            //frame.pack();
            //frame.setVisible(true);
            
            return chart;
           
        
    }
 
   
}
