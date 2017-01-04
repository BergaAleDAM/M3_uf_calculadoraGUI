package calculadoragui.model;

public class Operacions {

    /**
     * Aquest mètode calcula la suma dels dos valors de tipus double que rep per
     * paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la suma.
     */
    public double suma(double op1, double op2) {
        return op1 + op2;
    }

    /**
     * Aquest mètode calcula la resta dels dos valors de tipus double que rep
     * per paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la resta.
     */
    public double resta(double op1, double op2) {
        return op1 - op2;
    }

    /**
     * Aquest mètode calcula la multiplicació dels dos valors de tipus double
     * que rep per paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double , torna un el resultat de la multiplicació.
     */
    public double multiplicacio(double op1, double op2) {
        return op1 * op2;
    }

    /**
     * Aquest mètode calcula la divisió dels dos valors de tipus double que rep
     * per paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la divisió.
     */
    public double divisio(double op1, double op2) {
        return op1 / op2;
    }

    /**
     * Aquest mètode retorna el nombre més petit dels dos, en cas que siguin
     * iguals retornara el operador2, però això es indiferent perque son el
     * mateix nombre;
     *
     * @param op1
     * @param op2
     * @return
     */
    public double minim(double op1, double op2) {

        if (op1 < op2) {
            return op1;
        } else {
            return op2;
        }

    }

    /**
     * Aquest mètode retorna el nombre més gran dels dos, en cas que siguin
     * iguals retornara el operador2, però això es indiferent perque son el
     * mateix nombre;
     *
     * @param op1
     * @param op2
     * @return
     */
    public double maxim(double op1, double op2) {

        if (op1 < op2) {
            return op2;
        } else {
            return op1;
        }

    }

    /**
     * Aquest mètode retorna el mòdul de la divisio del primer operand amb el
     * del segon operand
     *
     * @param op1
     * @param op2
     * @return
     */
    public double modul(double op1, double op2) {

        return op1 % op2;

    }

        /**
     * Aquest mètode retorna el resultat de fer una potència del primer valor
     * les vegades que digui el segond valor
     * 
     * 
     * @param op1
     * @param op2
     * @return 
     */
    public double potencia(double op1, double op2) {
        
        return Math.pow(op1, op2);
        
    }
    
}
