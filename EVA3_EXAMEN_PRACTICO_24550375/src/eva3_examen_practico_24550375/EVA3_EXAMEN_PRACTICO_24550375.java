/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_examen_practico_24550375;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA3_EXAMEN_PRACTICO_24550375 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = captu.nextInt();

        double[] calificaciones = new double[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " (entre 0 y 100): ");
                calificacion = captu.nextDouble();
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

        double promedio = calcularPromedio(calificaciones);

        int estudiantesMayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        System.out.println("Resultados:");
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Cantidad de estudiantes con calificación mayor o igual al promedio: " + estudiantesMayoresOIguales);
        System.out.println("La calificación más alta es: " + calificacionMasAlta);
        System.out.println("La calificación más baja es: " + calificacionMasBaja);
        
    }

    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double calificacionMasAlta = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > calificacionMasAlta) {
                calificacionMasAlta = calificacion;
            }
        }
        return calificacionMasAlta;
    }

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double calificacionMasBaja = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
        }
        return calificacionMasBaja;
    }
    
}
