/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
        for (int i = 0; i < cadena.length(); i++) {
            resultat += cadena.charAt(cadena.length() - i - 1);
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.set(Calendar.YEAR, -year);
        cal.set(Calendar.MONTH, -month);
        cal.set(Calendar.DAY_OF_YEAR, -day);
        int dias = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.DAY_OF_MONTH) - cal.get(Calendar.DAY_OF_MONTH);
        int meses = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.MONTH) - cal.get(Calendar.MONTH);
        int años = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if (meses < 0) {

            resultat = años - 1;

        } else {
            resultat = años;
        }
        System.out.println(dias + ", " + meses + ", " + años);

        return resultat;
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
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
