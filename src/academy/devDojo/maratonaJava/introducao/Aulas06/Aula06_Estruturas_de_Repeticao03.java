package academy.devDojo.maratonaJava.introducao.Aulas06;

public class Aula06_Estruturas_de_Repeticao03 {
    public static void main (String [] args){
        //Imprima os primeiros 25 números de um dado valor. por exemplo 50
        int valueMax = 50;
        for(int i = 0;i <= valueMax; i++){
            if(i > 25){
                break; // O `break` interrompe o laço quando `i` for maior que 25
            }
            System.out.println(i);
        }


    }
}
