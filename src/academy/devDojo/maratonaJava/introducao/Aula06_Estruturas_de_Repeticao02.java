package academy.devDojo.maratonaJava.introducao;

public class Aula06_Estruturas_de_Repeticao02 {
    public static void main (String[] args){
        //imprima todos os números pares de 0 até 10000;
        for(int i = 0; i < 10000; i++){ // INCREMENTA ATÉ O MÁXIMO ESTIPULADO
            if(i % 2 == 0) { // VERIFICA SE O NÚMERO DIVIDO POR 2 É 0 , OU SEJA : PAR
                System.out.println(i); // SE FOR PAR , IMPRIME
            }
        }
    }
}
