


package com.mycompany.conversor;

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.util.List;


public class Conversor {


    public static BigDecimal convertir(BigDecimal monto, String tipoDeMoneda) {
        BigDecimal resultado = new BigDecimal(0);
        if (tipoDeMoneda == "dolar") {
            resultado = monto.divide(new BigDecimal(373),2, BigDecimal.ROUND_HALF_UP); // setScale(2, BigDecimal.ROUND_HALF_EVEN)
        }
        if (tipoDeMoneda == "euro") {
            resultado = monto.divide(new BigDecimal(203.06),2, BigDecimal.ROUND_HALF_UP); // setScale(2, BigDecimal.ROUND_HALF_EVEN)
        }
        if (tipoDeMoneda == "yen") {
            resultado = monto.divide(new BigDecimal(203.06),2, BigDecimal.ROUND_HALF_UP); // setScale(2, BigDecimal.ROUND_HALF_EVEN)
        }
        if (tipoDeMoneda == "seulWonCoreano") {
            resultado = monto.divide(new BigDecimal(6.71),2, BigDecimal.ROUND_HALF_UP); // setScale(2, BigDecimal.ROUND_HALF_EVEN)
        }
        if (tipoDeMoneda == "libraEsterlina") {
            resultado = monto.divide(new BigDecimal(373),2, BigDecimal.ROUND_HALF_UP); // setScale(2, BigDecimal.ROUND_HALF_EVEN)
        }
        return resultado;
    };


    public static void main(String[] args) {

        BigDecimal monto = new BigDecimal(JOptionPane.showInputDialog("ingresa el monto : "));

        String[] tipoDeMoneda = {"dolar", "euro", "yen", "seulWonCoreano", "libraEsterlina"};

        String elijoMoneda = String.valueOf(JOptionPane.showInputDialog(
                null,
                "elegi una moneda para convertir?",
                "Conversor de Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipoDeMoneda,
                tipoDeMoneda[0]));

        var resultado = convertir(monto, elijoMoneda);

        JOptionPane.showMessageDialog(null, "La conversion es " + resultado);
    }
}