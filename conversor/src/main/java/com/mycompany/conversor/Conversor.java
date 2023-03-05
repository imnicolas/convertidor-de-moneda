

package com.mycompany.conversor;

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.util.*;


public class Conversor {
    public Conversor() {
    }

    // Converter money from $ to USD, YEN, EU, etc...
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

            // Converter temperature
            public static double convertirTemp(double valor, String temperaturas){
                double resultadoTemp =0 ;
              if (temperaturas == "kelvin"){
                  resultadoTemp = valor / 10;
              }
                if (temperaturas == "farenheit"){
                    resultadoTemp = valor / 20;
                }
                if (temperaturas == "celcius"){
                    resultadoTemp = valor / 30;
                }
                return resultadoTemp;
            };


            public static void main(String[] args) {


                String[] tipoDeMoneda = {"dolar", "euro", "yen", "seulWonCoreano", "libraEsterlina"};
                String[] temperaturas = {"farenheit","celcius","kelvin"};
                String[] elijoConversor= {"moneda","temperatura"};

                String seleccionoConversor = String.valueOf(JOptionPane.showInputDialog(
                        null,
                        "Choose 1 option",
                        "Convertidor",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        elijoConversor,
                        elijoConversor[0]));

                if (seleccionoConversor == "moneda"){

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

                }else {

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
                    JOptionPane.showMessageDialog(null,"la conversion de la temperatura es "+ resultadoTemp);

                }
            }
        }