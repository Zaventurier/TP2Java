/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpifelse;
//TP Java 2
import java.util.Scanner;

/**
 *
 * @author pasca
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TP Java 2 - Septembre 2022");
        //Exercice2
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre âge :");
        int age = sc.nextInt();
        System.out.println("l'âge est " + age);
        if(age >=18){
            System.out.println("Majeur");
        }else{
            System.out.println("Mineur");
        }
        
        //Exercice3
        System.out.println("Saisir nombre1 :");
        int nb1 = sc.nextInt();
        System.out.println("Saisir nombre2 :");
        int nb2 = sc.nextInt();
        
        int nbmax = Math.max(nb1, nb2);
        System.out.println("Le nombre le plus grand est : "+ nbmax);
        
        //Exercice4
        System.out.println("Saisir un nombre :");
        float nombre = sc.nextFloat();
        if (nombre > 0){
            System.out.println("Nombre positif");
        }else{
            if(nombre == 0){
                System.out.println("0");
            }else{
                System.out.println("Nombre négatif");
            }
        }
            
        //Exercice5
        System.out.println("Saisir âge du spectateur :");
        int agespec = sc.nextInt();
            
        //condition1 : Vérification si âge est < 5
        if(agespec <5){
            System.out.println("Âge du spectateur : " +agespec + " : place à 2€");
        }else{
            //Si condition1 est fausse
            if(agespec >=5 && agespec <=17){
                System.out.println("Âge du spectateur : " +agespec + " : place à 5€");
                }else{
                    System.out.println("Âge du spectateur : " +agespec + " : place à 9€");
                }
            }
        
        System.out.println("Saisir température du corps :");
        int temp = sc.nextInt();
        if (temp == 36 || temp == 37 || temp == 38){
            System.out.println("OK");
        }else{
            System.out.println("Allez voir un médecin");
        }
        }    
}
