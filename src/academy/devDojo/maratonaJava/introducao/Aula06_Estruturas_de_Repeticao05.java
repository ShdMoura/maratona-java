package academy.devDojo.maratonaJava.introducao;

public class Aula06_Estruturas_de_Repeticao05 {
    public static void main(String[] args) {
        double valorCarro = 10000;
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcelas "+parcela+ " por R$ " + Math.round(valorParcela));

        }
    }
}
