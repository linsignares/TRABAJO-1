/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep17;

import java.util.Scanner;

/**
 *
 * @author julianainsignares
 */
public class POOEP17 {

    public static void main(String[] args) {
        double radio, area, longitud;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio = entrada.nextDouble();
        area = Math.PI*(radio*radio);
        longitud = 2*radio*Math.PI;
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del circulo es: " + longitud);
    }
}
