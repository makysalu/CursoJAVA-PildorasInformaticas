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
public class PrecioCompra {
    public static void main(String[] args) {
        System.out.print("Introduce el precio: ");
        double precio = numero();
        System.out.print("Introduce el descuento: ");
        double descuento = numero();
        double total = precio-(precio * descuento);
        System.out.print("El precio final es "+total);
    }
    public static double numero(){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        return n;
    }
}
