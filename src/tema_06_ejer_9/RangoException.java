/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_06_ejer_9;

/**
 *
 * @author Tunmi
 */
public class RangoException extends Exception
{
    /**
     * Excepcion creada para controlar las notas del alumno
     * @param mensaje mensaje que emite para mostrar el error
     */
    public RangoException(String mensaje)
    {
        super(mensaje);
    }
}
