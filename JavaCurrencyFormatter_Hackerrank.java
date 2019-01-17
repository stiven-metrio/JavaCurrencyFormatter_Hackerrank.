/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacurrencyformatter_hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
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
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = usFormatter.format(payment);
        String india = indiaFormatter.format(payment);
        String china = chinaFormatter.format(payment);
        String france = franceFormatter.format(payment);
                
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
