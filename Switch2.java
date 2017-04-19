/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una variale para pedir por consola los datos
        Scanner d = new Scanner(System.in);
        //Creacion de variables
        String horario;
        //Solicitud ingreso de variables
        System.out.println("Eliga una opcion(numero) para ver su clase y hora: "+"\n 1. Lunes"+"\n 2. Martes"+"\n 3. Miercoles"+"\n 4. Jueves"+"\n 5. Viernes");
        horario=d.next();
        
        //switch
        switch(horario){
            case "1":
                System.out.println("Gestión Productiva 1.1 de 16:00-17:00");
            break;
            case "2":
                System.out.println("Contabilidad de 7:00-10:00");
            break;
            case "3":
                System.out.println("Fundamentos de la Programacion de 7:00-10:00");
            break;
            case "4":
                System.out.println("Matemáticas Discretas de de 9:00-12:00");
            break;
            case "5":
                System.out.println("Electrónica Digital de 15:00-18:00");
            break;
            default:
            break;    
        }
        
    }
    
}
