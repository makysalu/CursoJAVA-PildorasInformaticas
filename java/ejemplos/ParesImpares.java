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
public class ParesImpares {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el numero maximo: ");
     int maximo = sc.nextInt();
     for(int cont=1; cont<=maximo; cont++){
         int numero = numero();
         if((numero%2)==0){
             System.out.println("El numero "+numero+" es par");
         }
         else{
             System.out.println("El numero "+numero+" es inpar");
         }
     }
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        return n;
    }
}
