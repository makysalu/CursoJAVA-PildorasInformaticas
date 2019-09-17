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
public class DeterminarMultiplo3 {
    public static void main(String[] args) {
        String multiplo ="";
        for(int cont=5; cont>0; cont--){
            int nu = numero();
            if((nu%3)==0){
                if("".equals(multiplo)){
                    multiplo=" "+nu;
                }
                else{
                    multiplo=multiplo+","+nu;
                }
            } 
        }
        System.out.print(multiplo);
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        return n;
    }
}
