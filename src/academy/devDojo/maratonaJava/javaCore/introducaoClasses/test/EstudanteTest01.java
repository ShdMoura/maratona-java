package academy.devDojo.maratonaJava.javaCore.introducaoClasses.test;

import academy.devDojo.maratonaJava.javaCore.introducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 26;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);



    }
}
