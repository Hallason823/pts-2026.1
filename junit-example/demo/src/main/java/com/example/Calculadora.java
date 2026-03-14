package com.example;

public class Calculadora {

    // Soma dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Subtrai dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Divide dois números
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return (double) a / b;
    }

    // Multiplica dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }
}