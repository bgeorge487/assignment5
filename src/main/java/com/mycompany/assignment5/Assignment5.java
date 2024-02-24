/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment5;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author brgeorge
 */
public class Assignment5 {

    public static void main(String[] args) {
        
        int charAtPosition;
        
        do{
        Scanner city = new Scanner(System.in);
        System.out.println("What's your favorite city?");
        String cityInput = city.nextLine();
        System.out.println("Now choose a number to get a letter from it!");
        charAtPosition = city.nextInt();
        
        if(charAtPosition > 0){
        char result = Task1.showChar(cityInput, charAtPosition);
        System.out.println(result);
        System.out.println();
        } else {
            System.out.println("You must enter a positive integer.");
            break;
        }
        }while(charAtPosition >= 0);
       

        int distance = Task2.distanceCal();
        JOptionPane.showMessageDialog(null, "You have gone " + distance + " miles.");
        
        
        System.out.println();
        System.out.println("Enter a degree in Celsius and I will convert it to Farhenheit: ");
        Scanner deg = new Scanner(System.in);
        double degree = deg.nextDouble();
        Task3.fahrenheit(degree);
        
       
    }
}
