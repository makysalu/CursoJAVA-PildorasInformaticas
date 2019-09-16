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
public class SumaNumeros {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Hasta que numero hay que sumar: ");
     int maximo = sc.nextInt();
     int suma=0;
     for(int cont=maximo; cont>0; cont-- ){
         suma=suma+cont;
     }
     System.out.print("La suma de los numeros hasta el "+maximo+" es "+suma);
    }
}
