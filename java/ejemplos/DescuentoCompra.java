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
public class DescuentoCompra {
    public static void main(String[] args) {
        System.out.print("Introduce el Precio: ");
        double precio = numero();
        System.out.print("Introduce el Precio Final: ");
        double precioFinal = numero();
        double descuento = precio - precioFinal;
        double porcentaje = (descuento*100)/precio;
        System.out.println("El descuento es "+porcentaje);
        
        
    }
    public static double numero(){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        return n;
    } 
}
