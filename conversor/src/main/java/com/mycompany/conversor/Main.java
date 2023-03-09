package com.mycompany.conversor;

import javax.swing.*;
import java.math.BigDecimal;

public class Main extends Conversor{

    public static void main(String[] args) {


        String[] tipoDeMoneda = {"dolar", "euro", "yen", "seulWonCoreano", "libraEsterlina"};
        String[] temperaturas = {"farenheit", "celcius", "kelvin"};
        String[] elijoConversor = {"moneda", "temperatura"};

        String seleccionoConversor = String.valueOf(JOptionPane.showInputDialog(
                null,
                "Choose 1 option",
                "Convertidor",
                JOptionPane.QUESTION_MESSAGE,
                null,
                elijoConversor,
                elijoConversor[0]));

        if (seleccionoConversor == "moneda") { // convertidor de moneda

            BigDecimal monto = new BigDecimal(JOptionPane.showInputDialog("ingresa el monto : "));
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

        } else { // convertidor de temperatura

            String montoTemp = JOptionPane.showInputDialog("ingresa la temperatura: ");
            double numeroMontoTemp = Double.parseDouble(montoTemp); // parsing String to double

            String elijoTemperatura = String.valueOf(JOptionPane.showInputDialog(
                    null,
                    "elegir una temperatura para convertir",
                    "Convesor de Temperaturas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    temperaturas,
                    temperaturas[0]));
            var resultadoTemp = convertirTemp(numeroMontoTemp, elijoTemperatura);
            JOptionPane.showMessageDialog(null, "la conversion de la temperatura es " + resultadoTemp);

        }
    }
}
