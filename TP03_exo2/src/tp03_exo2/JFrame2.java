/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_exo2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CHINOISERIZ
 */
public class JFrame2 extends JFrame{
    private boolean etat;
    private JPanel panelNorth = new JPanel();
    private JPanel panelCenter = new JPanel();
    private JPanel panelName = new JPanel();
    private JPanel panelEditeur = new JPanel();
    private JPanel panelDate = new JPanel();
    private List<JLabel> livres = new ArrayList();
    private JLabel name = new JLabel("Name : ");
    private JTextField entryName = new JTextField();
    private JLabel editeur = new JLabel("Editeur : ");
    private JTextField entryEditeur = new JTextField();
    private JLabel date = new JLabel("Date : ");
    private JTextField entryDate = new JTextField();
    private JButton buttonSave = new JButton("save");  
    private JLabel test = new JLabel();
    
    public JFrame2(List<JLabel> livres, boolean etat){
        this.livres = livres;
        this.etat = etat;
        
        // <editor-fold defaultstate="collapsed" desc="Set: jframe">
        setBackground(Color.ORANGE);
        setSize(500,500);
        setLayout(new BorderLayout());
        panelCenter.setLayout(new GridLayout(3,1));
        // </editor-fold>        
        // <editor-fold defaultstate="collapsed" desc="Set: entry">
        entryName.setPreferredSize(new Dimension(150,50));
        entryEditeur.setPreferredSize(new Dimension(150,50));
        entryDate.setPreferredSize(new Dimension(150,50));
        // </editor-fold>        
        
        add(panelNorth, BorderLayout.PAGE_START);
        add(panelCenter, BorderLayout.CENTER);
        add(buttonSave, BorderLayout.PAGE_END);
        panelName.add(name);
        panelName.add(entryName);
        panelEditeur.add(editeur);
        panelEditeur.add(entryEditeur);
        panelDate.add(date);
        panelDate.add(entryDate);
        panelNorth.add(new JLabel(" AJOUTER LIVRE : "));
        panelCenter.add(panelName);
        panelCenter.add(panelEditeur);
        panelCenter.add(panelDate);
        
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test.setText(entryName.getText() + ", " + entryEditeur.getText() + ", " + entryDate.getText());
                livres.add(test);
                JFrame1 frame1 = new JFrame1(livres);
                setVisible(false);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc="Set: jframe">
        setVisible(etat);
        setDefaultCloseOperation(JFrame2.EXIT_ON_CLOSE);
        // </editor-fold>
    }
}
