/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Reporting;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author nawellalioui
 */
public class ReportingPatient extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ReportingPatient
     */
    private JPanel p0;
    private JButton retour;

    
    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ReportingPatient() throws ClassNotFoundException, SQLException  {
        super("Gestion informatique de votre centre hospitalier");
        initComponents();
        setSize(900,500);
        setLocationRelativeTo(null); //on centre la fenêtre
        setResizable(false); //On empêche le redimensionnement
        setVisible(true);
        this.setLayout(new BorderLayout());
       
        //JPanel p0 = new JPanel(); 
        //JPanel p3 = new JPanel();
        // p0.setLayout(new BoxLayout(p0, BoxLayout.Y_AXIS));
       // p0.add(Box.createRigidArea(new Dimension(0, 50)));
        //p3.setLayout(new BoxLayout(p0, BoxLayout.Y_AXIS));
       
 
        //Reporting reporting= new Reporting();
            //Affichage graphique Docteur par service
        //ChartFrame frame = new ChartFrame("Nombre de patient par service", reporting.PatientParService());
        //frame.pack();
        //frame.setVisible(true);
      
        //Création du bouton
       retour = new JButton("Retour");
        
       p0=new JPanel();
          
            Reporting reporting;
                  try {
                   reporting = new Reporting();
                   reporting.PatientParService();
                   ChartPanel frame = new ChartPanel(reporting.PatientParService());
                   frame.setVisible(true);
                   
                   p0.add(frame,BorderLayout.CENTER);
                   p0.add(retour,BorderLayout.SOUTH);
                   p0.validate();
                  } catch (ClassNotFoundException ex) {
                      Logger.getLogger(FenChoixReporting.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (SQLException ex) {
                      Logger.getLogger(FenChoixReporting.class.getName()).log(Level.SEVERE, null, ex);
                  }
         p0.setBackground(Color.WHITE); 
         add(p0);
         retour.addActionListener(this);  

   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReportingPatient().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ReportingPatient.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportingPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
         
           if (source==retour){
           FenChoixReporting fen = new FenChoixReporting();
           super.dispose();}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}