package academy.devDojo.maratonaJava.introducao;

public class Aula06_Estruturas_de_Repeticao04 {
    public static void main (String[]args){
        // Exercício : Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000

        double valorCarro = 10000;

        for (int parcela = 1; parcela <= 1000; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Número de parcelas: "+parcela+ " de R$ "+Math.round(valorParcela));
        }
    }
}
