package academy.devDojo.maratonaJava.JavaCore.BintroducaoMetodos.test;

import academy.devDojo.maratonaJava.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(30,2);
        System.out.println(resultado);
    }
}
