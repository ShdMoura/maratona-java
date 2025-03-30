package academy.devDojo.maratonaJava.introducao.Aulas07;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        //byte , short , int, long , float e double o valor é 0
        //char o valor é '\u0000' ' '
        //boolean o valor é false
        //string  o valor é null

        String [] nomes = new String[3];
        nomes [0] = "Goku";
        nomes [1] = "Kurosaki";
        nomes [2] = "Luffy";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
