package COD_Libreria;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Libreria {
    
    public static int pregunta(String mensaje){
        Component frame = null;
        int opcion = JOptionPane.showConfirmDialog(frame, mensaje, "Pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
    
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static String pedirDatoString(String mensaje){
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }
    
    public static int pedirDatoInt(String mensaje){
        int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    
    public static float pedirDatoFloat(String mensaje){
        float dato = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    
    public static double pedirDatoDouble(String mensaje){
        double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
}
