/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpifelse;
import java.util.Scanner;

/**
 *
 * @author pasca
 */
public class Exercice8Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        
        System.out.println("Pizza Disponilble :");
        System.out.println("1 : Reine - 9€");
        System.out.println("2 : 4 Fromages - 11€");
        System.out.println("3 : Napolitaine - 10€");
        System.out.println("4 : 4 saisons - 11€");
        System.out.println("5 : Calzone - 11€");
        System.out.println("6 : Hawaïenne - 12€");
        
        System.out.println("Saisir le numéro de Pizza voulu :");
        int pizza = sc.nextInt();
        System.out.println("Saisir la quantité de pizza voulu :");
        int qté = sc.nextInt();
        int prix = 0;
        String nomPizza;
        String sup = "";
        String sup2 = "";
        
        if(pizza == 1){
            prix = 9*qté;
            nomPizza = "Reine";
        }
        else if (pizza == 2){
            prix = 11*qté;
            nomPizza = "4 Fromages";
        }
        else if (pizza == 3){
            prix = 10*qté;
            nomPizza = "Napolitaine";
        }
        else if (pizza == 4){
            prix = 11*qté;
            nomPizza = "4 saisons";
        }
        else if (pizza == 5){
            prix = 11*qté;
            nomPizza = "Calzone";
        }
        else {
            prix = 12*qté;
            nomPizza = "Hawaïenne";
        }
        System.out.println("Voulez vous un supplément oeufs ?");
        String reponse = sc.next();
        if (reponse.equals("Oui".toLowerCase())){
            
            prix = prix+1;
            sup = "Oeufs";
        }
        else{
        reponse ="";
    }
        reponse = "";
        System.out.println("Voulez vous le supplément Aubergine ?");
        reponse = sc.next();
        if (reponse.equals("Oui".toLowerCase())){
            
            prix = prix+2;
            sup2 = "Aubergine";
        }
        else{
        reponse ="";
        }
        System.out.println("----------------");
        System.out.println("Vous avez choisi " +qté + " pizzas " + nomPizza);
        System.out.println("avec comme supplément : " +sup.toString()+", " + sup2);
        System.out.println("Le prix total est de : " +prix+"€");
        System.out.println("----------------");
        
    }
    
}
