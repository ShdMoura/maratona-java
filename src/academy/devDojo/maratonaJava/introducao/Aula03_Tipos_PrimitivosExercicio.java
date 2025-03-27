package academy.devDojo.maratonaJava.introducao;

/// Prática
/// Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem:
/// Eu <nome>, morando no endereço <endereço>,
/// confirmo que recebi o salário de <salario>, na data<data>.///
public class Aula03_Tipos_PrimitivosExercicio {
    public static void main (String[] args){
        String nome = "Arthur";
        String endereco = "Travessa Cavalheiro 168";
        int salario = 4000;
        String dataRecibo = "27/03/2025";
        String relatorio = "Eu " +nome+ ", morando no endereço " +endereco+
                ", confirmo que recebi o salário de R$ " +salario+", na data "
                +dataRecibo+".";

        System.out.println(relatorio);

    }
}
