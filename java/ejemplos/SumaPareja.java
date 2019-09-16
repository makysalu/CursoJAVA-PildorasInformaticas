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
public class SumaPareja {
    public static void main(String[] args) {
        int x = numero();
        int y = numero();
        int z = numero();
        if((x+y)==z){
            System.out.print("Iguales");
        } 
        else if ((x+z)==y){
            System.out.print("Iguales");
        }
        else if ((y+z)==x){
            System.out.print("Iguales");
        }
        else{
            System.out.print("Distintos");
        }
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        return n;
    }
}
