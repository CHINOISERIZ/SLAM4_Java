
package java_tp01_ex1;


public class Feu {    
    /* Un feu possède un "état", càd soit 'Rouge', soit 'Vert' */
    
    private Etat etat;    
    
    public Feu(Etat etat){
        this.etat = etat;
    }   
    
    // <editor-fold defaultstate="collapsed" desc="Getter&Setter">
    public Etat Get_Etat(){
        return this.etat;
    }   
    public void Set_Etat(Etat etat){
        this.etat = etat;
    }
    // </editor-fold>

}
