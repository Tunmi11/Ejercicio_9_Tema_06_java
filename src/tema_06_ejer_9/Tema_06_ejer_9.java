/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_06_ejer_9;

import java.util.Scanner;

/**
 *
 * @author Tunmi
 */
public class Tema_06_ejer_9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws RangoException, ArrayIndexOutOfBoundsException 
    {
         Scanner tec = new Scanner(System.in);
         Scanner tec2 = new Scanner(System.in);
         Scanner tec3 = new Scanner(System.in);
         int opcion = 0;
         String cambiar = "";
         try{

             Alumno alu = new Alumno();
             
             System.out.println("Vamos a Pedir las notas del Alumno: ");
             alu.pedirNotas();
             System.out.println("----------------------------------------");
             System.out.println("Ahora Podemos cambiar las notas quieres  ");
             System.out.println("Desea Cambiar la nota: (SI,Si, s, si,NO, No, n, no)");
             cambiar = tec2.nextLine();
             
             switch(cambiar)
             {
                 case "SI":
                 case "Si":
                 case "s":
                 case "si":
                     System.out.println("Dime la posicion que deseas cambiar: ");
                     int posicion = tec.nextInt();
                     System.out.println("Dime la nota nueva para el Alumno: ");
                     double nnnota = tec3.nextDouble();
                     alu.modificarNota(posicion, nnnota);
                     System.out.println("Notas del alumno");
                     System.out.println("--------------------------");
                     alu.imprimirCalificaciones();
                     break;
                     
                 case "NO":
                 case "No":
                 case "n":
                 case "no":
                     System.out.println("Notas del alumno");
                     System.out.println("--------------------------");
                     alu.imprimirCalificaciones();
                     break;
                                 
             }
            
             
         }catch(RangoException | ArrayIndexOutOfBoundsException  e)
         {
             System.err.println(e.toString());
         }
         
    
}

}