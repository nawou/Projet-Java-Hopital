/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.Connexion;
import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author nawellalioui
 */
public class FenetreConnexionLocale extends JFrame implements ActionListener{
    
    private Connexion maconnexion;
    private JButton connect, retourMenu;
    private JLabel  nomUt, nomBDD, mdp, messageCo, messageInfo;
    private JTextField text_login, text_BDD;
    private JPasswordField text_pass;
    private JPanel p0, p1, p2;
    
    public FenetreConnexionLocale(){
   
         // creation par heritage de la fenetre
        super("Gestion informatique de votre centre hospitalier");
        setSize(800,300);  //taille
        setLocationRelativeTo(null); //on centre la fenêtre
        setResizable(false); //On empêche le redimensionnement
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter lors du clic sur la croix
        setVisible(true);
    
		
                //panel.setPreferredSize(new Dimension(100,200));
		text_login  = new JTextField();
                text_login.setColumns(8);
                //text_login.setAlignmentX(Component.CENTER_ALIGNMENT);
                //text_login.setPreferredSize(new Dimension(50, 10));
                text_login.setBackground(Color.RED);
                
                text_BDD = new JTextField();
                text_BDD.setColumns(8);
                text_pass = new JPasswordField(8);
		 //On lui donne un nombre de colonnes à afficher
                
                // creation des boutons
                connect = new JButton("Connexion");
                retourMenu = new JButton("Retourner au menu principal");
                
                // creation des textes
		text_login  = new JTextField();
                text_login.setColumns(8);
                //text_login.setBackground(Color.RED);
                text_BDD = new JTextField();
                text_BDD.setColumns(8);
                text_pass = new JPasswordField(8);
                
                //Création des labels
                nomUt = new JLabel("Nom d'utilisateur :", JLabel.CENTER);
                mdp = new JLabel("Mot de passe :", JLabel.CENTER);
                nomBDD = new JLabel("Nom de la base de données :", JLabel.CENTER);
                messageCo = new JLabel("FORMULAIRE DE CONNEXION", JLabel.CENTER);
                messageInfo = new JLabel("Veuillez entrer vos nom d'utilisateur, mot de passe et nom de base de données afin de vous connecter:", JLabel.CENTER);
		
                //Mise en forme des labels
                 Font f=new Font("Arial", Font.BOLD, 16);
                 messageCo.setFont(f); 
                 messageCo.setAlignmentX(Component.CENTER_ALIGNMENT);
                 //p2.add(Box.createRigidArea(new Dimension(0, 25)));
                 
                 Font f1=new Font("Arial", Font.BOLD, 12);
                 messageInfo.setFont(f1); 
                 messageInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
                 messageInfo.setForeground(Color.RED);
                 
                 
                
                 // creation des panneaux
                 p0 = new JPanel();
                 p1 = new JPanel();
                 p2 = new JPanel();
                
 
                 // mise en page des panneaux
                 p0.setLayout(new GridLayout(2, 1));
                 p0.setBackground(Color.LIGHT_GRAY);
                 p1.setLayout(new FlowLayout());
                 p1.add(p0);
                 p1.setBackground(Color.white);
                 p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
                 p2.setBackground(Color.white); //form, veuillez
                 
                 p0.add(nomUt);
                 p0.add(text_login);
                 p0.add(mdp);
                 p0.add(text_pass);
                 p0.add(nomBDD);
                 p0.add(text_BDD);
                 p0.add(connect);
                 p2.add(Box.createRigidArea(new Dimension(0, 25)));
                 p2.add(messageCo);
                 p2.add(Box.createRigidArea(new Dimension(0, 25)));
                 p2.add(messageInfo);
                 p1.add(retourMenu);
                 
                 //nord.add("North", p0);
                 
		/*panel.add(text_login);
                panel.add(text_BDD);
                panel.add(text_pass);*/
                
                 // disposition geographique des panneaux
                add(p1);
                add("North", p2);
                
                connect.addActionListener(this);
                retourMenu.addActionListener(this);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
       if(source == retourMenu) {
       super.dispose(); 
       MenuConnexion fen = new MenuConnexion();
    }
    
   
      
        else if (source == connect){
        try{
             if((text_BDD.getText().equals(""))&&(text_login.getText().equals(""))&&(text_pass.getText().equals(""))){
             JOptionPane.showMessageDialog(null, "Connexion impossible ! Veuillez réessayer");    
             }
       
             else if((text_BDD.getText().equals("Hopital"))&&(text_login.getText().equals("root"))&&(text_pass.getText().equals("root"))){
             maconnexion = new Connexion(text_BDD.getText(), text_login.getText(), text_pass.getText());
             super.dispose();
             JOptionPane.showMessageDialog(null, "Connexion réussie !");
             FenChoixModule fen = new FenChoixModule ();}
             
              else if((!text_BDD.equals("hopital"))||(!text_login.equals("root"))||(!text_pass.equals("root"))){
              
              JOptionPane.showMessageDialog(null,"Les informations saisies sont incorrectes, veuillez réessayer !");
            
             }
        }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}
                           

             
        }
            
      
                           
        
    }
    

}

/*

   
            if((!nomBDD.equals("hopital"))||(!login.equals("root"))||(!password.equals(""))){

                if(!nomBDD.equals("hopital"))
                    JOptionPane.showMessageDialog(null,"Error: La BDD n'existe pas !");
            
                if(!login.equals("root"))
                    JOptionPane.showMessageDialog(null,"Error: Login incorrect !");

                if(!password.equals(""))
                    JOptionPane.showMessageDialog(null,"Error: Password incorrect !");  


/*
try{
             maconnexion = new Connexion(text_BDD.getText(), text_login.getText(), text_pass.getText());
             super.dispose();
             if((text_BDD.equals("Hopital")) && (text_login.equals("root")) && (text_pass.equals("root")))
             JOptionPane.showMessageDialog(null, "Connexion réussie !");
               try{
        }
             FenChoixModule fen = new FenChoixModule ();
        }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}*/


/*else if (source == connect){
        try{
             //maconnexion = new Connexion(text_BDD.getText(), text_login.getText(), text_pass.getText());
             if((text_BDD.equals("Hopital"))&&(text_login.equals("root"))&&(text_pass.equals("root"))){
             maconnexion = new Connexion(text_BDD.getText(), text_login.getText(), text_pass.getText());    
             super.dispose();
             JOptionPane.showMessageDialog(null, "Connexion réussie !");
             FenChoixModule fen = new FenChoixModule ();}
             
        }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}

             
        }*/