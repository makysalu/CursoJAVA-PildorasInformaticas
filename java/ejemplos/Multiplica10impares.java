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
public class Multiplica10impares {
    public static void main(String[] args) {
        int impares = 0;
        int numero = 0;
        int total = 1;
        while(impares<10){
            if((numero%2)!=0){
                System.out.println(total+"="+total+"*"+numero);
                total=total*numero;
                numero++;
                impares++;
            }
            else{
                numero++;
            }
        }
        System.out.print("El total es :"+total);
    }
}
