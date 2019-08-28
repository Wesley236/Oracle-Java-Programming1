/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agechecker;
import java.util.Scanner;

/**
 *
 * @author 0607137613
 */
public class AgeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
    int age;
   
    System.out.print("Please enter your age: ") ;
    age =  in.nextInt();
    
    if(age > 20)
        System.out.println("You are an Adult");
    else
        System.out.println("You are not an adult");
     in.close();
    }
    
}
