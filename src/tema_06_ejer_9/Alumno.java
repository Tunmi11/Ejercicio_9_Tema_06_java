/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_06_ejer_9;

import java.util.ArrayList;

/**
 *
 * @author Tunmi
 */
public class Alumno 
{
    private static int numeromaterias = 5;
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
        
        for (int i = 0; i < Alumno.numeromaterias; i++) 
        {
            System.out.println("");
            
        }
    }
    
}
