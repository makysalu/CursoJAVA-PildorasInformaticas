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
public class SumaPositivos {
    public static void main(String[] args) {
        boolean positivo = true;
        int suma=0;
        int numero=0;
        while (positivo == true){
            numero=numero();
            if(numero>=0){
                suma=suma+numero;
            }
            else{
                System.out.print("La suma es: "+suma);
                positivo=false;
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
