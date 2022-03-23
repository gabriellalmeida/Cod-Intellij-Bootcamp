package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        double c, d;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        c = a;
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        d = b;

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(c, d);

        System.out.println("Resultado somado:       " + somar);
        System.out.println("Resultado subtraido:    " + subtrair);
        System.out.println("Resultado multiplicado: " + multiplicar);
        System.out.println("Resultado dividido:     " + dividir);

    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(double c, double d){
        return c / d;
    }

}
