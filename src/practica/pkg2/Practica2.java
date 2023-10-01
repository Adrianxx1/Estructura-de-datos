/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2;

/**
 *
 * @author Adrian
 */import java.util.Scanner;

public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        int mcd = encontrarMCD(num1, num2);
        
        System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);
    }
    
    public static int encontrarMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}