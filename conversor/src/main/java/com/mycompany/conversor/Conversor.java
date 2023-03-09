

package com.mycompany.conversor;

import javax.swing.JOptionPane;
import java.math.BigDecimal;

// Clase de diseño ->
public class Conversor {
    // Converter Money from $ to ...
    public static BigDecimal convertir(BigDecimal monto, String tipoDeMoneda) {
        BigDecimal resultado = new BigDecimal(0);
        switch (tipoDeMoneda) {
            case "dolar":
                resultado = monto.divide(new BigDecimal(373), 2, BigDecimal.ROUND_HALF_UP);
                break;
            case "euro":
                resultado = monto.divide(new BigDecimal(203.06), 2, BigDecimal.ROUND_HALF_UP);
                break;
            case "yen":
                resultado = monto.divide(new BigDecimal(223.06), 2, BigDecimal.ROUND_HALF_UP);
                break;
            case "seulWonCoreano":
                resultado = monto.divide(new BigDecimal(6.71), 2, BigDecimal.ROUND_HALF_UP);
                break;
            case "libraEsterlina":
                resultado = monto.divide(new BigDecimal(300), 2, BigDecimal.ROUND_HALF_UP);
                break;
        }
        return resultado;
    }

    // Converter temperature
    public static double convertirTemp(double valor, String temperaturas) {
        double resultadoTemp = 0;
        if (temperaturas == "kelvin") {
            resultadoTemp = valor / 10;
        }
        if (temperaturas == "farenheit") {
            resultadoTemp = valor / 20;
        }
        if (temperaturas == "celcius") {
            resultadoTemp = valor / 30;
        }
        return resultadoTemp;
    }

}