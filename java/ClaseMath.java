/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class ClaseMath {
    public static void main(String[] args) {
        //raiz cuadrada
        double raiz=Math.sqrt(25);
        System.out.println(raiz);
        
        //redondeo
        //int resultado=Math.round(12.76243F);
        double numero=12.121323;
        int resultado=(int)Math.round(numero);
        System.out.println(resultado);
        
        //
        double base=5;
        double exponente=3;
        resultado=(int)Math.pow(base, exponente);
        System.out.println("El resultado de "+(int)base+" elevado a "+(int)exponente+" es: "+resultado);
        
        /*
        Math.sqrt(a); raid cuadrada
        Math.pow(a, 2); elevar
        Math.sin(a); Math.cos(a); Math.tan(a); Math.atan(a); angulos seno, cosen
        Math.round(a); redondear
        Math.PI; pi
        */
        
    }
    
}
