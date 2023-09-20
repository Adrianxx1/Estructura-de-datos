/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;




import java.util.Scanner;

public class Practica1 {
    public static int sumaCuadrados(int y, int z) { 
        if (y > z) { 
            return 0; 
        } else {
            int cuadrado = y * y; 
            return cuadrado + sumaCuadrados(y + 1, z); 
        }
    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        boolean hacerOtraSuma = true;

        while (hacerOtraSuma) { 
            System.out.print("Ingrese el valor de y: "); 
            int y = scanner.nextInt(); 

            System.out.print("Ingrese el valor de z: ");
            int z = scanner.nextInt(); 

            int resultado = sumaCuadrados(y, z);
            System.out.println("La suma de los cuadrados desde " + y + " hasta " + z + " es: " + resultado); 

            
            System.out.print("¿Desea hacer otra suma de cuadrados? (true/false): ");
            hacerOtraSuma = scanner.nextBoolean(); //

            if (hacerOtraSuma) { 
                System.out.print("¿Desea cambiar el valor de y? (true/false): ");
                boolean cambiarY = scanner.nextBoolean(); 

                if (cambiarY) { 
                }
            }
        }

        scanner.close();
    }
}