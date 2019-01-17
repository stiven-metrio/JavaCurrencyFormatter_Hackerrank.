/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacurrencyformatter_hackerrank;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class JavaCurrencyFormatter_Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance();
        String us = usFormatter.format(payment);
        
        System.out.println("US: " + us);
        //System.out.println("India: " + india);
        //System.out.println("China: " + china);
        //System.out.println("France: " + france);
    }
    
}
