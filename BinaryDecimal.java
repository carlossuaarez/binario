/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydecimal;

// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)


/**
 *
 * @author carlossuarez
 */


import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Introduzca un número que sea mayor que 0: ");
            n = sc.nextInt();
        } while (n <= 0); //Corregí la condición del bucle do-while para que verifique n en lugar de i.

        System.out.println("\nBinario: ");
        decBin(n); //Cambié el nombre de "decBinario" a "decBin" para hacerlo coherente con el nombre del método.
    }

    // Método para pasar de decimal a binario
    public static void decBin(int n) { 
        if (n <= 1) { //Corregí la operación dentro del método decBinario para calcular correctamente los dígitos binarios ("1" en vez de "2").
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2); //Cambié el "^" por el "%".
        }
    }
}
