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
public class IgualesMenor {
    public static void main(String[] args) {
        int n1 = numero();
        int n2 = numero();
        if(n1==n2){
            System.out.print("Iguales");
        }
        else if (n1 < n2){
            System.out.print(n1+" es menor");
        }
        else{
            System.out.print(n2+" es menor");
        }
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        return n;
    }
}
