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
public class Operaciones {
    public static void main(String[] args) {
       int n1=numero();
       int n2=numero();
       int suma=n1+n2;
       System.out.println("La suma de "+n1+" mas "+n2+" es "+suma);
       int resta=n1-n2;
       System.out.println("La resta de "+n1+" menos "+n2+" es "+resta);
       int multiplicacion=n1*n2;
       System.out.println("La multiplicacion de "+n1+" por "+n2+" es "+multiplicacion);
       double division=(double)n1/n2;
       System.out.println("La division entre "+n1+" y "+n2+" es "+division);
       
    }
     public static int numero (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        int n = sc.nextInt();
        return n;
    }
}
