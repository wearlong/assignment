/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chpeter868
 */
public class Ex9 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner answer = new Scanner (System.in);
        String guess1;
        String guess2;
        int max = 2000;
        int min = 1;
        int number = (max +  min)/2;
        boolean win = false;
        
        while (win == false){
             System.out.println("Do " + number + " is your answer? (y/n)");
             guess1 = answer.nextLine();
            if (guess1.equals ("y")) {
                win = true;
            } else  {
                System.out.println("Do the answer is bigger or smaller than " + number + " ? (smaller/bigger)");
                guess2 = answer.nextLine();
                if (guess2.equals("bigger")) {
                    min = number;
                }else if (guess2.equals("smaller")) {
                    max = number;
                } 
                number = (max +  min)/2;
           }
            
        }
        System.out.println("Game Over!");
    }
    
}
