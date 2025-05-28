package com.campusdual.classroom;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise30 {
    public static double divisionWithCustomException(int numerador, int denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }

    public static void main(String[] args) {
        try {
            double resultado = divisionWithCustomException(3, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (DivisionByZeroException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}