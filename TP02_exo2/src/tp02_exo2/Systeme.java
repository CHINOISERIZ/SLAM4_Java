/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_exo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CHINOISERIZ
 */
public class Systeme {
    Scanner input = new Scanner(System.in);
    
    private List<Document> documents = new ArrayList();
    private HashMap<String, Statut> moq = new HashMap();
    private Personne personne;
    
    public Systeme(){
        // C'est une "BD" sous forme d'un HashMap des utilisateurs
        moq.put("admin", Statut.manager);
        moq.put("user", Statut.employe);
    }
    
    // Lit un document
    public void Read(Document document){
        System.out.println(document.Get_Texte());
    }
    
    // Rajoute une chaîne de caractère au document
    public void Write(Document document, String str){
        if(document.Get_Mode() == Mode.lecture_seule){
            // Sort de la fonction
            return;
        }
        document.Set_Texte(str);
    }
    
    // Crée un document si c'est un manager
    public void Create(){
        if(personne.Get_Statut() != Statut.manager){
            return;
        }
        
        /* Sachant que les modes d'un document sont sous forme d'une énumération, 
        j'ai choisi de créer un tableau permettant de récupérer les éléments avec l'indice du tableau*/
        System.out.println("\nQuel mode d'écriture? \n 1 : Lecture seule \n 2 : Lecture&Ecriture");
        System.out.print("-> ");
        int a = input.nextInt();
        Mode[] modes = new Mode[2];
        modes[0] = Mode.lecture_seule;
        modes[1] = Mode.lecture_ecriture;
        
        // Création du doc en utilisant l'héritage
        System.out.println("\nQuel est le type de votre document ? \n 1 : Facture \n 2 : Relance Client \n 3 : Document technique");
        System.out.print("-> ");
        String b = input.next();
        Document document;
        if (b == "1"){
            document = new Facture(modes[a-1]);
        }
        else if (b == "2"){
            document = new Relance_Client(modes[a-1]);
        }
        else{
            document = new Technique(modes[a-1]);
        }
        documents.add(document);        
    }
    
    // Authentification au système si l'utilisateur est connu
    public void Connexion(){
        if(personne == null){
            System.out.print("Entrez votre nom : ");
            String nom = input.next();
            if(moq.get(nom) == null){
                System.out.println("Cet utilisateur n'existe pas");
            }
            else{
                personne = new Personne(nom);
                if(moq.get(nom) == Statut.manager){
                    personne.Set_Statut(Statut.manager);
                }
                else{
                    personne.Set_Statut(Statut.employe);
                }
            }
        }
    }
    
    // Différentes fonctionnalitées du système
    public void Menu(){
        boolean bol = true;
        while (bol) { 
            System.out.println("\nHello ! " + personne.Get_Nom() + "\n 1. Sélectionner un document \n 2. Créer un document ");
            System.out.print("-> ");
            int a = input.nextInt();

            if(a == 1){
                if(documents.size() != 0){
                    System.out.println("\n Il y a " + documents.size() + " documents. Choisissez en un : ");
                }
                else{
                    System.out.println("\n Il n'y a pas de document");
                    if(personne.Get_Statut() == Statut.manager){
                        Create();
                        continue;
                    }
                    else{
                        return;
                    }
                }

                System.out.print("-> ");
                int b = input.nextInt();
                if(documents.get(b-1).Get_Mode() == Mode.lecture_seule){
                    System.out.println("Le document est en lecture seule.");
                    Read(documents.get(b-1));
                }
                else{
                    Read(documents.get(b-1));
                    System.out.println("Voulez-vous le modifier ? 1. oui / 2. non");
                    int c = input.nextInt();
                    if (c == 1){
                        System.out.println("-> ");
                        String str = input.next();
                        Write(documents.get(b-1), str);
                    }
                }
                
                System.out.println("\nVoulez-vous : 1. Quitter 2. Revenir");
                System.out.print("-> ");
                int d = input.nextInt();
                if (d == 1){
                    bol = false;
                }
            }    
            else{
                if(personne.Get_Statut() == Statut.manager){
                        Create();
                        continue;
                }
                else{
                    System.out.println("\n Vous n'avez pas les droits");
                }
            }
            
        }
        
    }
}
