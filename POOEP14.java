/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep14;

import java.util.Scanner;

/**
 *
 * @author julianainsignares
 */
public class POOEP14 {

    public static void main(String[] args) {
        int X, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        X = entrada.nextInt();
        cuadrado = X*X;
        cubo = X*X*X;
        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
}
