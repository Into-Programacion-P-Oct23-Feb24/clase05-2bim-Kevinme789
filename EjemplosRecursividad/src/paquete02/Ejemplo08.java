/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio

        int f;
        System.out.println("Ingrese de que tamaño sera el arreglo");
        f = sc.nextInt();
        int[] arreglo = new int[f];
        for (int i = 0; i < f; i++) {
            System.out.println("Ingrese el valor para el arreglo");
            arreglo[i] = sc.nextInt();
        }
        int suma = misterio(arreglo,arreglo.length );
        System.out.println(suma);

    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
