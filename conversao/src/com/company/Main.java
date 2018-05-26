package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //Celsius para Kelvin
    public static int temperatura(int valor1)
    {
        int result = valor1 + 273;
        return result;
    }

    //velocidade em km/h dividida por 3,6 corresponde a mesma em m/s
    public static double velocidade(double valor1)
    {
        double result = valor1 / 3.6;
        return result;

    }

    //Centímetros para Polegadas
    public static double distancia(double valor1)
    {
        double result = valor1 * 0.3937;
        return result;
    }

    //conversão de Segundos para Hora
    public static double tempo(double valor1)
    {
        double result= valor1 * 0.00027778;
        return result;
    }

}
