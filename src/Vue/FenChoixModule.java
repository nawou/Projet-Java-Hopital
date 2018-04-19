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

    
    private JButton moduleRecherche, moduleMAJ, moduleReporting;
    private JLabel choixModule, veuillez;
    private JPanel p0;
    
    public FenChoixModule(){
        
         // creation par heritage de la fenetre
        super("Gestion informatique d'un centre hospitalier");
        setSize(600,500);  //taille
        setLocationRelativeTo(null); //on centre la fenêtre
        setResizable(false); //On autorise le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter lors du clic sur la croix
        setVisible(true);
        
        Font f=new Font("Arial", Font.BOLD, 18);
        Font f2=new Font("Arial", Font.BOLD, 14);
          
        // creation du panel
        JPanel p0 = new JPanel(); 
        p0.setLayout(new BoxLayout(p0, BoxLayout.Y_AXIS));
        p0.setBackground(Color.white);
        p0.setPreferredSize(new Dimension(100,200));
        
        // creation des boutons
        moduleRecherche = new JButton("Recherche");
        moduleMAJ = new JButton("Mise à jour");
        moduleReporting = new JButton("Reporting");
        
        // creation des labels
        choixModule = new JLabel("CHOIX DE MODULE");
        veuillez = new JLabel("Veuillez faire votre choix parmi les 3 modules suivants:");
        veuillez.setForeground(Color.RED);
        
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
        moduleRecherche.setBackground(Color.green);
        moduleRecherche.setOpaque(true);
        moduleRecherche.setBorderPainted(false);
        moduleRecherche.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleRecherche.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleRecherche);
     
        moduleMAJ.setFont(f); 
        moduleMAJ.setBackground(Color.RED);
        moduleMAJ.setOpaque(true);
        moduleMAJ.setBorderPainted(false);
        moduleMAJ.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleMAJ.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add(moduleMAJ);
        
        moduleReporting.setFont(f); 
        moduleReporting.setBackground(Color.yellow);
        moduleReporting.setOpaque(true);
        moduleReporting.setBorderPainted(false);
        moduleReporting.setAlignmentX(Component.CENTER_ALIGNMENT);
        moduleReporting.setPreferredSize(new Dimension(50, 10));
        p0.add(Box.createRigidArea(new Dimension(0, 50)));
        p0.add( moduleReporting);
       
        
        add(p0);
        //Mise en forme des boutons
        
moduleRecherche.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
       if(source == moduleRecherche) {
       super.dispose(); 
       FenetreRecherche fen2= new FenetreRecherche();
       
    }
    
       
                           
        
    }
    
    
    
    
    
  

    
    
}
