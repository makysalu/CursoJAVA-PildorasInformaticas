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
public class Valores5 {
    public static void main(String[] args) {
        int n1=numero();
        int n2=numero();
        int n3=numero();
        int n4=numero();
        int n5=numero();
        int producto = n1*n2*n3*n4*n5;
        System.out.print(n1+"*"+n2+"*"+n3+"*"+n4+"*"+n5+" es "+producto);
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir un numero: ");
        int n = sc.nextInt();
        return n;
    }
}
