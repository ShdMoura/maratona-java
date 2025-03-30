package academy.devDojo.maratonaJava.introducao.Aulas07;

public class Aula07_Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3]; //Cria um array de tamanho 3 com valores padrão 0.
        int [] numeros2 = {1,2,3,4,5}; //Cria e inicializa um array com valores específicos.
        int [] numeros3 = new int []{5,4,3,2,1}; //Cria um array com valores específicos, mas usando new int[].
        // Três formas acima de declarar um array /\/\

        for (int num : numeros3){
            System.out.println(num);
        }
        /*
        Este é um loop for-each, que percorre cada elemento do array numeros3, atribuindo cada valor à variável num e imprimindo-o.
         No for-each, os dois pontos (:) substituem a lógica de índice, facilitando a leitura.
         Passo a passo do loop:

         num = 5 → imprime 5
         num = 4 → imprime 4
         num = 3 → imprime 3
         num = 2 → imprime 2
         num = 1 → imprime 1

         */

    }
}
