/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coseani.desafio1;

/**
 *
 * @author Alumno
 */
public class CoseaniDesafio1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) { 
                 // Calificaciones de 5 estudiantes (valores fijos) 
        String[] nombres = {"Ana", "Beto", "Carmen", "Diego", "Elena"}; 
        int[] calificaciones = {25, 62, 96, 33, 88}; 
        int totalEstudiantes = 5;
        int promedio = 0;
        int total = 0;
        int max = calificaciones[0];
        int min = calificaciones[0];
        for(int i=0;i<totalEstudiantes;i++)
        {
            if(calificaciones[i]>=70)
            {
                System.out.println(nombres[i] + " Promociono con " + calificaciones[i] );
            }
            else if(calificaciones[i]>=40 && calificaciones[i]<=69)
            {
                System.out.println(nombres[i] + " Regularizo con " + calificaciones[i] );
            }
            else
            {
                System.out.println(nombres[i]+ " Desaprobo con " + calificaciones [i]);
            }
           
            promedio += calificaciones[i];
            
        }
        for(int j = 1; j< calificaciones.length; j++) {
            if(calificaciones[j] > max) {
                max = calificaciones[j];
            }
            if(calificaciones[j] < min) {
                min = calificaciones[j];
            }
           
        }
            System.out.println("Nota maxima: " + max);
            System.out.println("Nota minima:" + min);
            total= promedio / totalEstudiantes;
            System.out.println("Promedio: " + total);
   }
}
