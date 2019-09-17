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
public class paras100 {
    public static void main(String[] args) {
        int pares=0;
        int n = 202;
        while(pares<=100){
            if((n%2)==0){
                System.out.println(n);
                n--;
                pares++;        
            }
            else{
                n--;
            }
        }
    }
}
