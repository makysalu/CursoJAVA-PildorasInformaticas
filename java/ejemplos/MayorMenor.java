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
public class MayorMenor {
    public static void main(String[] args) {
        int x = numero();
        int y = numero();
        int z;
        if (x > y){
            z = x;
            System.out.print(z+" es mayor");
        }
        else{
            z = y;
            System.out.print(z+" es mayor");
        }
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero ");
        int n = sc.nextInt();
        return n;
    }
}
