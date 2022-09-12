/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpifelse;
//On importe la librairie Scanner
import java.util.Scanner;

/**
 *
 * @author pasca
 */
public class Tp2Suite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Le but de cet exercice est de calculer un taux de remise en fonction 
        du montant de la vente. Ici, on suppose que le montant de la vente est 
        saisi.*/
        
        //On déclare un objet Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le montant de la vente :");
        float montant = sc.nextFloat();
        //On déclare la variable taux.
        float taux = 0;
        
        //On détermine le taux de remise
        
        if(montant >=0 | montant <=10000){
            taux = 10/100;
        }
        else if (montant >10000 | montant<=20000){
            taux = 20/100;
        }
        else{
            taux = 30/100;
        }
        //On calcule puis on affiche le montant de la remise
        System.out.println("La remise est de : " + (montant*taux)/100);
        
    }
    
}
