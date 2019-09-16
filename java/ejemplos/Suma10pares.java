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
public class Suma10pares {
    public static void main(String[] args) {
        int pares = 0;
        int numero = 0;
        int suma = 0;
        while(pares<=10){
            if((numero%2)==0){
                suma=suma+numero;
                numero++;
                pares++;
            }
            else{
                numero++;
            }
        }
        System.out.print("La suma de los 10 primeros pares es: "+suma);
    }
}
