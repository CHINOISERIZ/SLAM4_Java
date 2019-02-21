/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHINOISERIZ
 */
public class Jeu {
    
    private Plateau plateau = new Plateau();
    private List<Piece> pieces = new ArrayList();
    
    public Jeu(){
        for(Piece piece : plateau.Get_premiereLigne()){
            
        }
    }
}
