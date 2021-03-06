/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

/*
 * 
 * Librairies importées
 */
import Modele.Connexion;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuConnexion extends JFrame implements ActionListener{

    public JButton connexionLoc, connexionECE, quitter;
  
    /**
     * Constructeur qui initialise tous les objets graphiques de la fenetre
     */
    public MenuConnexion() {

        // creation par heritage de la fenetre
        super("Gestion informatique de votre centre hospitalier");
        setSize(700,600);  //taille
        setLocationRelativeTo(null); //on centre la fenêtre
        setResizable(false); //On empêche le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter lors du clic sur la croix
        setContentPane(MessageBienvenue());
        setVisible(true);
     
    }
    
    private JPanel MessageBienvenue(){ 
    JPanel panel = new JPanel(); 
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    // panel.setLayout(new BoxLayout());
    panel.setBackground(Color.white);
    panel.setPreferredSize(new Dimension(100,200));
    JLabel label = new JLabel("Bienvenue dans votre système de gestion de centre hospitalier !"); 
    
    Font f=new Font("Arial", Font.BOLD, 16);
    label.setFont(f); 
    
    label.setForeground(Color.RED);
    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(Box.createRigidArea(new Dimension(0, 25)));
    panel.add(label);
   
    
    connexionLoc = new JButton("Connexion locale");
    connexionLoc.setFont(f); 
    connexionLoc.setBackground(Color.LIGHT_GRAY);
    connexionLoc.setOpaque(true);
    connexionLoc.setBorderPainted(false);
    connexionLoc.setAlignmentX(Component.CENTER_ALIGNMENT);
    connexionLoc.setPreferredSize(new Dimension(50, 10));
    panel.add(Box.createRigidArea(new Dimension(0, 50)));
    //connexionLoc.addActionListener(this);
    panel.add(connexionLoc);
    
    connexionECE = new JButton("Connexion distante (momentanément indisponible)");
    connexionECE.setFont(f); 
    connexionECE.setBackground(Color.LIGHT_GRAY);
    connexionECE.setOpaque(true);
    connexionECE.setBorderPainted(false);
    connexionECE.setAlignmentX(Component.CENTER_ALIGNMENT);
    connexionECE.setPreferredSize(new Dimension(50, 10));
    panel.add(Box.createRigidArea(new Dimension(0, 25)));
    //connexionECE2.addActionListener(this);
    panel.add(connexionECE);
    
    quitter = new JButton("Quitter");
    quitter.setFont(f); 
    quitter.setBackground(Color.LIGHT_GRAY);
    quitter.setOpaque(true);
    quitter .setBorderPainted(false);
    quitter .setAlignmentX(Component.CENTER_ALIGNMENT);
    quitter .setPreferredSize(new Dimension(50, 10));
    panel.add(Box.createRigidArea(new Dimension(0, 25)));
    //connexionECE2.addActionListener(this);
    panel.add(quitter);
    
    
    
    panel.add(Box.createRigidArea(new Dimension(0, 25)));
    panel.add(Box.createRigidArea(new Dimension(0, 25)));
    
    ImageIcon image = new ImageIcon("src/images/image2.png");
    JLabel label1 = new JLabel("", image, JLabel.CENTER);
    label1.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(label1);

    connexionLoc.addActionListener(this);
    quitter.addActionListener(this);
    //connexionECE.addActionListener(this);
    
    return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       if(source == connexionLoc) {
       super.dispose(); 
       FenetreConnexionLocale fen = new FenetreConnexionLocale();
    }
      /*if(source == connexionECE) {
       super.dispose(); 
       FenetreConnexionLocale fen = new FenetreConnexionLocale();
    }*/
    
       
    else if (source == quitter){
        super.dispose(); 
      
        
    }
    }

}