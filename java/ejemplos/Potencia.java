/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author diego
 */
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        System.out.print("Introduce la base: ");
        double base = numero();
        System.out.print("Introduce el exponente: ");
        double exponente = numero();
        double potencia = Math.pow(base, exponente);
        System.out.print(base+" elevado a "+exponente+" es igual a "+potencia);
    }
    public static double numero(){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        return n;
    }
}
