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
public class SalarioSemanal {
    public static void main(String[] args) {
        System.out.print("Introduce las horas trabajadas: ");
        double horas = numero();
        double horasext = (horas - 40);
        if(horasext<=0){
            horasext=0;
        }
       
        System.out.print("Introduce el precio por hora: ");
        final double precio = 15;
        double total = (horas*precio)+(horasext*(precio*2));
        System.out.print("El total es: "+total);
        
    }
    public static double numero(){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        return n;
    }
}
