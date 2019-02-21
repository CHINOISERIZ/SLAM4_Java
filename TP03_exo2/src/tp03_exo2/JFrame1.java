/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_exo2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author CHINOISERIZ
 */
public class JFrame1 extends JFrame{
    
    private List<JLabel> livres = new ArrayList();
    private JPanel panelCenter = new JPanel();
    private JPanel panelNorth = new JPanel();
    private JButton buttonAdd = new JButton("Add");
        
    
    public JFrame1(List<JLabel> livres){      
        // <editor-fold defaultstate="collapsed" desc="Set: jframe">
        setLayout(new BorderLayout());
        setSize(500,500);
        // </editor-fold>        

        panelCenter.setLayout(new GridLayout(livres.size(),1));
        
        for(JLabel livre : livres){
            panelCenter.add(new JLabel(livre.getText()));
        }
                
        panelCenter.setBackground(Color.ORANGE);
        add(panelNorth, BorderLayout.NORTH);
        panelNorth.add(new JLabel(" VOS LIVRES : "));
        add(panelCenter, BorderLayout.CENTER);
        add(buttonAdd, BorderLayout.PAGE_END);
        
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame2 frame2 = new JFrame2(livres, true);
                setVisible(false);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc="Set: jframe">
        setVisible(true);
        setDefaultCloseOperation(JFrame1.EXIT_ON_CLOSE);   
        // </editor-fold>        
    }
}
