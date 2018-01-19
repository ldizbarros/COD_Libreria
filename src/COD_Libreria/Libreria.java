package COD_Libreria;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Libreria {
    
    public static int pregunta(String mensaje){
        Component frame = null;
        int opcion = JOptionPane.showConfirmDialog(frame, mensaje, "Pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
}
