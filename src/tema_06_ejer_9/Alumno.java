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
    
    /**
     * Constructor por defecto
     * le pasamos los atributos por defecto y iniciamos el array
     */
    public Alumno()
    {
        nombre = "";
        notas = new ArrayList<>();
    }

    /**
     * Costructor por parametros 
     * al que unicamente le pasaremos un atributo el nombre
     * @param nombre nombre del alumno
     */
    public Alumno(String nombre) 
    {
        this.nombre = nombre;
    }

    /**
     * metodo get del nombre del alumno
     * @return devuelve el nombre del alumno
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * metodo set del nombre
     * modifica el nombre
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    /**
     * Metodo de pedir notas para el alumno
     * tenemos que controlar que las notas sean validas para el alumno mediante una excepcion
     * pedimos las notas hasta el numero de materias del alumno, lo agregamos al array
     * @throws RangoException controla que las notas sean validas
     */
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
    /**
     * Metodo que modifica una nota del alumno
     * con dos excepciones que controlar que la nota sea validad y la posicion sea correcta del array
     * 
     * @param posicion posicion de la nota para luego cambiarla o no
     * @param nnota nota del alumno
     * @throws RangoException controla que la nota sea valida
     * @throws ArrayIndexOutOfBoundsException controla que la posicion sea valida
     */
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
    /**
     * Metodo para mostrar la notas del alumno
     * pedimos el nombre del alumno y sus apellidos
     * recorremos el array para sacar las notas 
     * mostramos el nombre y las notas
     */
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
