package calculadoragui.control;

import calculadoragui.model.Operacions;
import calculadoragui.vista.CalculadoraAvanzada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * En la classe de Gestio de Calculadora haurem d'implementar els action listener
 * per saber que opcio estarem fent
 * @author Alejandro
 */
public class GestioCalculadoraAvansada implements ActionListener{

    private final CalculadoraAvanzada ig;
    private final Operacions opers;
/**
 * Al constructor li passem el tipus de calculadora que es i la relació am Operacions
 * que servirà en el seu moment per fer les diverses operacions
 * @param ig 
 */
    public GestioCalculadoraAvansada(CalculadoraAvanzada ig) {

        this.ig = ig;
        opers = new Operacions();
    }

    /**
     * Fem una sobreescritura del mètode actionPerfomed que agafem al implementar
     * ActionListener i farem un filtres per saber quin tipus d'operació haurem d'escollir
     * 
     * He de dir que no em vaig complicar la vida y la part dels 4 case principals
     * estàn duplicats ambs els de CalculadoraSimple
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
        try {

            switch (accio) {

                case "+":
                    suma();
                    break;
                case "-":
                    resta();
                    break;
                case "x":
                    multiplicacio();
                    break;
                case "/":
                    divisio();
                    break;
                case "Minim":
                    minim();
                    break;
                case "Maxim":
                    maxim();
                    break;
                case "Mòdul":
                    modul();
                    break;
                case "Potència":
                    potencia();
                    break;
            }
        } catch (NumberFormatException ex) {
            ig.mostrarMissatgeError("Valors no numèrics");
            ig.buidarTextFields();
        }
    }

    /**
     * El metode suma va a opers, fa la suma i mostra el resultat en la caixa de resultat
     */
    private void suma() {
        ig.setResultat(opers.suma(ig.getOper1(), ig.getOper2()));
    }

     /**
     * El metode resta va a opers, fa la resta i mostra el resultat en la caixa de resultat
     */
    private void resta() {
        ig.setResultat(opers.resta(ig.getOper1(), ig.getOper2()));
    }

     /**
     * El metode multiplicacio va a opers, fa la multiplicacio i mostra el 
     * resultat en la caixa de resultat
     */
    private void multiplicacio() {
        ig.setResultat(opers.multiplicacio(ig.getOper1(), ig.getOper2()));
    }

     /**
     * El metode divisio va a opers, fa la divisio i mostra el 
     * resultat en la caixa de resultat
     */
    private void divisio() {
        double oper2 = ig.getOper2();
        if (oper2 != 0) {
            ig.setResultat(opers.divisio(ig.getOper1(), ig.getOper2()));
        } else {
            ig.mostrarMissatgeError("No es pot dividir per 0");
        }
    }

     /**
     * El metode minim va a opers, fa la comparació i mostra el 
     * resultat en la caixa de resultat
     */
    private void minim() {
        ig.setResultat(opers.minim(ig.getOper1(), ig.getOper2()));
    }

    
    /**
     * El metode maxim va a opers, fa la comparació i mostra el 
     * resultat en la caixa de resultat
     */
    private void maxim() {
        ig.setResultat(opers.maxim(ig.getOper1(), ig.getOper2()));
    }

    
    /**
     * El metode multiplicacio va a opers, fa el mòdul de la divisio i mostra el 
     * resultat en la caixa de resultat
     */
    private void modul() {
        ig.setResultat(opers.modul(ig.getOper1(), ig.getOper2()));
    }

    
    
    /**
     * El metode potencia va a opers, fa la potencia i mostra el 
     * resultat en la caixa de resultat
     */
    private void potencia() {
        ig.setResultat(opers.potencia(ig.getOper1(), ig.getOper2()));
    }

}
