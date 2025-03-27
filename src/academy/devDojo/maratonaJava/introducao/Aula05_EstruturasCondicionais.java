package academy.devDojo.maratonaJava.introducao;

public class Aula05_EstruturasCondicionais {
    public static void main(String[] args) {
        // ESTRUTURAS CONDICIONAIS
        int idade = 26;

        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean isAutorizadoComprarBebida = idade >= 18;

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado, menor de idade");
        } else {
            System.out.println("Beba com moderação!");
        }

        // OPERADOR TERNARIO
        // Doar se salario foi maior que 5000
        double salario = 7000;
        String mensagemDoar = "Posso doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições de doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        // Operador ternario usando o ? e o : para ou seja= Se é o mesmo que ? e Se naõ é o mesmo que :

        System.out.println(resultado);

        //Exercício
        // Quero saber qual taxa de imposto será cobrado de imposto de mim, e quanto será o valor que pagarei ao governo.

        double salarioAnual = 70000;
        double valorImposto;
        String jurosAnual1 = "Taxa de juros anual: 9.70%";
        String jurosAnual2 = "Taxa de juros anual: 37.35%";
        String jurosAnual3 = "Taxa de juros anual: 49.50%";

        if (salarioAnual <= 34712){
            System.out.println(jurosAnual1);
        }else if (salarioAnual >34712 && salarioAnual < 68507){
            System.out.println(jurosAnual2);
        }else{
            System.out.println(jurosAnual3);
        }

        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa  = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double impostoAPagar;

        if(salarioAnual <= 34712){
            impostoAPagar = salarioAnual * primeiraFaixa;
        }else if(salarioAnual > 34712 && salarioAnual < 68507){
            impostoAPagar = salarioAnual * segundaFaixa;
        }else{
            impostoAPagar = salarioAnual * terceiraFaixa;
        }
        System.out.println("Imposto total a pagar: " +Math.round(impostoAPagar));

    }
}

