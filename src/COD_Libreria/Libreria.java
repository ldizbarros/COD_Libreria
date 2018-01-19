package COD_Libreria;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Clase que contienen todas las funciones de mi libreria
 * @author ldizbarros
 */

public class Libreria {
    
    /**
     * Funcion que te muestra una ventana para poder decidir si/no
     * @param mensaje mensaje que quieres que muetsrre la ventana
     * @return devuelve 1 si es si y 0 si es no 
     */
    public static int pregunta(String mensaje){
        Component frame = null;
        int opcion = JOptionPane.showConfirmDialog(frame, mensaje, "Pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
    
    /**
     * Muestra un mensaje en una ventana
     * @param mensaje mensaje que quieres mostrar por pantalla
     */
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    /**
     * Pide datos en una ventana de tipo String
     * @param mensaje mensaje que indica que es lo que quieres pedir
     * @return devuelve el string que solicitas
     */
    public static String pedirDatoString(String mensaje){
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }
    
    /**
     * Pide datos en una ventana de tipo int
     * @param mensaje mensaje que indica que es lo que quieres pedir
     * @return devuelve el int que solicitas
     */
    public static int pedirDatoInt(String mensaje){
        int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    
    /**
     * Pide datos en una ventana de tipo float
     * @param mensaje mensaje que indica que es lo que quieres pedir
     * @return devuelve el float que solicitas
     */
    public static float pedirDatoFloat(String mensaje){
        float dato = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    
    /**
     * Pide datos en una ventana de tipo double
     * @param mensaje mensaje que indica que es lo que quieres pedir
     * @return devuelve el double que solicitas
     */
    public static double pedirDatoDouble(String mensaje){
        double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
}
