package ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
import java.util.Scanner;
public class ConversorMillas {
    public static void main(String[] args) {
        int metros = numero();
        final double milla = 1.852;
        double millas=(double)metros*milla;
        System.out.println("En "+metros+" metros hay "+millas+" millas");    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduces los metros: ");
        int n = sc.nextInt();
        return n;
    }
}
