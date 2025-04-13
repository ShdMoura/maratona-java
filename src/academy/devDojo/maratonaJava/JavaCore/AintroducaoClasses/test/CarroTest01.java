package academy.devDojo.maratonaJava.JavaCore.AintroducaoClasses.test;

import academy.devDojo.maratonaJava.JavaCore.AintroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.ano = 2010;
        carro1.modelo = "Sedan";

        carro2.nome = "Golf GTI";
        carro2.ano = 2025;
        carro2.modelo = "Hatch";

        System.out.println("Carro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);


    }
}
