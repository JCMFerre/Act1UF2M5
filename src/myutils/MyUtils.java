package myutils;

import java.util.Calendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena != null) {
            for (int i = 0; i < cadena.length(); i++) {
                resultat += cadena.charAt(cadena.length() - i - 1);
            }
        } else {
            resultat = null;
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat > 150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int any = Calendar.getInstance().get(Calendar.YEAR) - year;
        int mes = Calendar.getInstance().get(Calendar.MONTH) - month + 1;
        int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - day;
        if (any > 150) {
            any = -1;
        } else {
            if (any < 0 || any <= 0 && mes < 0 || any <= 0 && mes <= 0 && dia < 0) {
                any = -2;
            }
            if (any > 0 && mes <= 0 && mes < 0) {
                any--;
            }
        }
        return any;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
