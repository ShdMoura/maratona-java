package academy.devDojo.maratonaJava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args){
        // + - / * Operadores Aritmetimeticos
        int number01 = 10;
        int number02 = 20;

        // OPERADORES RELACIONAIS \/
        // Operador resto %

        int resto = 21 % 7;
        System.out.println(resto);

        // Operador maior que >
        // Operador menor que <
        // Operador menor igual <=
        // Operador maior igual >=
        // Operador igual ==
        // Operador diferente !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDifQueVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDifQueVinte "+isDezDifQueVinte);

        // OPERADORES LÓGICOS
        // && (and)
        // || (or)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPs5 = 3500;

        boolean isPs5Compravel = valorTotalContaCorrente > valorPs5 || valorTotalContaPoupanca > valorPs5;

        System.out.println("Ps5 é compravel? "+isPs5Compravel);

        // OPERADORES DE ATRIBUIÇÃO
        // = , += , -+ , *= , /= , %=
         double bonus = 1800;
         bonus += 1000; // 2800
        // bonus -= 1000; // 1800
        // bonus *= 2; // 3600
        // bonus /= 2; // 900
        //bonus %= 2; // 0

        System.out.println(bonus);

        // OPERADORES DE INCREMENTO ou DECREMENTO
        // ++ --
        int contador = 0;
        contador += 1; // contador = contador +1;
        contador++ ;
        contador--;







    }
}
