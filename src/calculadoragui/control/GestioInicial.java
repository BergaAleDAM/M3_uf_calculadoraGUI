package calculadoragui.control;

import calculadoragui.vista.CalculadoraAvanzada;
import calculadoragui.vista.CalculadoraSimple;
import calculadoragui.vista.InterficieInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;


public class GestioInicial implements ActionListener {

    private final InterficieInicial ig;
/**
 * Al constructor li passem el tipus de calculadora que es i la relació am Operacions
 * que servirà en el seu moment per fer les diverses operacions
 * @param ig 
 */
    public GestioInicial(InterficieInicial ig) {
        this.ig = ig;
    }

    /**
     * La sobreescritura d'aquest mètode com he dit abans ve de ActionListener
     * i te un filtre per saber si va a la simple o a la cientifica
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
        try {

            switch (accio) {

                case "Simple":
                    canvi(0);
                    break;
                case "Cientifica":
                    canvi(1);
                    break;

            }
        } catch (NumberFormatException ex) {
            ig.mostrarMissatgeError("No s'ha pogut accedir");
        }
    }

    /**
     * Aquest mètode serveix per executar el tipus de calculadora que s'ha escollit
     * i tanca la inicial per a que no estorbi
     * @param i 
     */
    private void canvi(int i) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

//                InterficieInicial intInici = new InterficieInicial();
//                intInici.dispose();

               
                if (i == 0) {
                    CalculadoraSimple intGraf = new CalculadoraSimple();
                    intGraf.setVisible(true);
                } else {

                    CalculadoraAvanzada intGraf = new CalculadoraAvanzada();
                    intGraf.setVisible(true);

                }

            }
        });

    }
}
