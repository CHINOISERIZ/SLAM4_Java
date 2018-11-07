/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo2;

/**
 *
 * @author CHINOISERIZ
 */
public class Document {

    private Mode mode;
    private Type type;
    private String texte;
    
    public Document(){}
    public Document(Mode mode, Type type) {
        this.mode = mode;
        this.type = type;
        this.texte = "0";
    }
    
    public Type Get_Type(){
        return this.type;
    }    
    public String Get_Texte(){
        return this.texte;
    }
    public void Set_Texte(String str){
        this.texte += str;
    }
    public Mode Get_Mode(){
        return this.mode;
    }
    
}
