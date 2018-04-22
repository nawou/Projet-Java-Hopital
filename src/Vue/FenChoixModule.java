/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Connexion;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nawellalioui
 */
public class FenChoixModule extends JFrame implements ActionListener {

    
    private JButton moduleRecherche, moduleMAJ, moduleReporting, moduleAjouter, moduleSupprimer;
    private JLabel choixModule, veuillez;
    private JPanel p0;
    
    public FenChoixModule(){
        
         // creation par heritage de la fenetre
        super("Gestion informatique de votre centre hospitalier");
        setSize(700,550);  //taille
        setLocationRelativeTo(null); //on centre la fenêtre
        setResizable(false); //On autorise le redimensionnement
        setDefaultCloseOperation(this.EXIT_ON_CLOSE); //pour quitter lors du clic sur la croix
        setVisible(true);
        
        Font f=new Font("Arial", Font.BOLD, 13);
        Font f2=new Font("Arial", Font.BOLD, 13);
          
        // creation du panel
        JPanel p0 = new JPanel(); 
        p0.setLayout(new BoxLayout(p0, BoxLayout.Y_AXIS));
        p0.setBackground(Color.white);
        p0.setPreferredSize(new Dimension(100,200));
        
        // creation des boutons
        moduleRecherche = new JButton("Recherche");
        moduleMAJ = new JButton("Modification");
        moduleReporting = new JButton("Reporting");
        moduleAjouter = new JButton("Ajout");
        moduleSupprimer = new JButton("Suppression");
        
        // creation des labels
        choixModule = new JLabel("CHOIX DE MODULE");
        veuillez = new JLabel("Veuillez faire votre choix parmi les 3 modules suivants (recherche, mise à jour, reporting):");
        veuillez.setForeground(Color.red);
        
        //Mise en page des labels
        choixModule.setAlignmentX(Component.CENTER_ALIGNMENT);
        veuillez.setAlignmentX(Component.CENTER_ALIGNMENT);
        choixModule.setFont(f);
        veuillez.setFont(f2);
        
        p0.add(Box.createRigidArea(new Dimension(0, 25)));
        p0.add(choixModule);
        p0.add(Box.createRigidArea(new Dimension(0, 25)));
        p0.add(veuillez);
        
        //Mise en forme des boutons
        moduleRecherche.setFont(f); 
        moduleRecherche.setBackground(Color.orange);
        moduleRecherche.setOpaque(true);
        moduleRecherche.setBorderPainted(false);
        moduleRecherche.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleRecherche.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleRecherche);
     
        moduleAjouter.setFont(f); 
        moduleAjouter.setBackground(Color.LIGHT_GRAY);
        moduleAjouter.setOpaque(true);
        moduleAjouter.setBorderPainted(false);
        moduleAjouter.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleAjouter.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleAjouter);
        
        moduleMAJ.setFont(f); 
        moduleMAJ.setBackground(Color.LIGHT_GRAY);
        moduleMAJ.setOpaque(true);
        moduleMAJ.setBorderPainted(false);
        moduleMAJ.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleMAJ.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleMAJ);
        
        moduleSupprimer.setFont(f); 
        moduleSupprimer.setBackground(Color.LIGHT_GRAY);
        moduleSupprimer.setOpaque(true);
        moduleSupprimer.setBorderPainted(false);
        moduleSupprimer.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleSupprimer.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleSupprimer);
        
        moduleReporting.setFont(f); 
        moduleReporting.setBackground(Color.orange);
        moduleReporting.setOpaque(true);
        moduleReporting.setBorderPainted(false);
        moduleReporting.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleReporting.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add( moduleReporting);
       
        moduleRecherche.addActionListener(this);
        moduleAjouter.addActionListener(this);
        moduleMAJ.addActionListener(this);
        moduleSupprimer.addActionListener(this);
        
        add(p0);
        //Mise en forme des boutons
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
       if(source == moduleRecherche) {
       super.dispose(); 
       FenetreRecherche fen2= new FenetreRecherche();
    }
    
       else if(source == moduleAjouter) {
       super.dispose(); 
       FenChoixAjout fen2= new FenChoixAjout();
    }
        else if(source == moduleSupprimer) {
       super.dispose(); 
       FenChoixDelete fen2= new FenChoixDelete();
    }
       
       else if(source == moduleMAJ) {
       super.dispose(); 
       FenChoixModif fen2= new FenChoixModif();
    }
                           
        
    }
    
    
    
    
    
  

    
    
}
