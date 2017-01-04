package calculadoragui;

import calculadoragui.vista.CalculadoraAvanzada;
import calculadoragui.vista.CalculadoraSimple;
import calculadoragui.vista.InterficieInicial;
import javax.swing.SwingUtilities;

/**
 * Aquesta es la classe inicial i per tant serà la primera que es mostri en pantalla
 * dins del Main i veiem un SwingUtilities.invokelater que serà el que executarà
 * la pantalla del menu de calculadora perque dins fiquem un objecte tipus runnable
 * que servirà per marcar quina sera el Jframe que escollirem inicialment
 * @author Alejandro
 */
public class CalculadoraGUI {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {           
            InterficieInicial intGraf = new InterficieInicial();
            intGraf.setVisible(true);
            }
        });

    }

}
