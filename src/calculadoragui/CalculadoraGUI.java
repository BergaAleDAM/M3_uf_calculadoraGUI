package calculadoragui;

import calculadoragui.vista.CalculadoraSimple;
import javax.swing.SwingUtilities;

public class CalculadoraGUI {

    public static void main(String[] args) {
                            SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            CalculadoraSimple intGraf = new CalculadoraSimple();
                            intGraf.setVisible(true);
                        }
                    });
        
    }

}
