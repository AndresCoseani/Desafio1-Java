package coseanidesafio2;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class CoseaniDesafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> historial = new ArrayList<>();
        int numeroSecreto = random.nextInt(20) + 1;
        int intentos = 5;
        boolean gano = false;
       System.out.println("¡Bienvenido al juego de adivinanza!"); 
       System.out.println("He pensado en un número entre 1 y 20.");
    
       while(intentos > 0)
       {
           int numeroIngresado = scanner.nextInt();
             historial.add(numeroIngresado); // Guarda el intento
           
             if(numeroIngresado == numeroSecreto)
             {
                 System.out.println("Encontraste el numero");
                 gano = true;
                 break;
             }
             else if(numeroIngresado > numeroSecreto)
             {
                System.out.println("El numero secreto a menor");
             }
             else
             {
                System.out.println("El numero secreto a mayor");
             }
                 
             intentos--;
             if(intentos > 0)
             {
                System.out.println("te quedan " + intentos + " intentos");
             }
             
       }
       if(!gano)
             {
                 System.out.println("Te quedaste sin intentos"); 
                 System.out.println("El número secreto era: " + numeroSecreto);
             }
       System.out.println("Historial de tus intentos:");
       for (Integer intento : historial) {
        System.out.println(intento);
       }
        // [El código de ustedes]

         scanner.close();
    }
}