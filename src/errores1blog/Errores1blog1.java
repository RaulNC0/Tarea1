package errores1Blog1;

import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author Gaby Nieva
 */
public class Errores1Blog1 {

    /**
     * @param args the command line arguments

    
    String  nombre;
    public static void main(String[] args) {
       // Declaración de variables
            Double  x, y,z;
            float a, b, c;


            
            
            BufredReader bufer = new BufferedReader(new ImputStreamReader());
            String entrada;
            
            System.out.println("Escribe el valor de x: ");
            entrada = bufer.readLine();
            x= Integer.parseInt(entrada);
            System.out.println("Escribe el valor de y: ");
            entrada = bufer.readLine();
            y = Double.parseDouble(entrada);
            z = y / x;
            System.out.println("El residuo de dividir y ( + y + ") entre x ( " +x + ) es: " + z);
            
            System.out.println("Escribe el valor de a: ");
            entrada = b.readLine();
            a = entrada;
            System.out.println("Escribe el valor de b: ");
            in = bufer.readLine();
            b = Float.parseFloat(entrada);
            c = a * b ;
            System.out.println("El resultado de multiplicar a por b es: " + c);
            
            
            
    }
    System.out.println("Escribe una letra: ");
    entrada = bufer.readLine();
    nombre = Entrada.ChartAt(12);
    System.out.println("El  nombre que escribiste es: " + Nombre);
}

