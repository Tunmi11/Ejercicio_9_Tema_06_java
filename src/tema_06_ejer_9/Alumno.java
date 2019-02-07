/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_06_ejer_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tunmi
 */
public class Alumno 
{
    public static int numeromaterias = 5;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();
    
    public Alumno()
    {
        nombre = "";
        notas = new ArrayList<>();
    }

    public Alumno(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void pedirNotas() throws RangoException 
    { 
        Scanner tec = new Scanner(System.in);
        double nota = 0;
        
        for (int i = 0; i < Alumno.numeromaterias; i++) 
        {
            System.out.println("Dime La nota del alumno: ");
            nota = tec.nextDouble();
            notas.add(nota);
            
            if(nota > 10 || nota < 0)
            {
               throw new RangoException("Esto no se puede hacer, Nota invalida");
            }
        }
    }
    
    public void modificarNota(int posicion, double nnota) throws RangoException, ArrayIndexOutOfBoundsException 
    { 
       if(nnota < 0 || nnota > 10)
       {
           throw new RangoException("Esto no se puede hacer, Nota invalida");
       }else if(posicion > Alumno.numeromaterias)
       {
          throw new ArrayIndexOutOfBoundsException("Esto no se puede hacer, posicion invalida");
       }else
       {
           notas.remove(nnota);
           notas.add(posicion, nnota);
           System.out.println("-----------------------");
           System.out.println("Se han modificado las notas del Alumno");
           System.out.println("-----------------------");
           
       }
    }
    
    public void imprimirCalificaciones()
    { 
        Scanner tec = new Scanner(System.in);
        
        
        System.out.print("Dime el nombre del alumno: ");
        this.nombre = tec.nextLine();
        System.out.print("Dime el apellido del alumno: ");
        String apellido = tec.nextLine();
        
        System.out.println("Alumno: " + this.nombre + " " + apellido);
        for (int i = 0; i < notas.size(); i++) 
        {
            
            System.out.println("Las notas del alumno son: " + notas.get(i));
        }
        
    }
    
}
