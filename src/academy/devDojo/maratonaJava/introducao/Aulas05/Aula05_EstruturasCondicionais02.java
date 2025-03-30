package academy.devDojo.maratonaJava.introducao.Aulas05;

public class Aula05_EstruturasCondicionais02 {
    public static void main (String[] args){
        // Exercício switch: Imprima um dia na semana, considerando 1 como domingo
        byte day = 20;
        switch (day){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia da semana inválido");


        }
        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
