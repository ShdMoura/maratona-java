package academy.devDojo.maratonaJava.introducao.Aulas08;

public class Aula08_Arrays_Multidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        //31,28,31,30 Dias

        // EXEMPLO DE ARRAY MULTIDIMENSIONAL
        int[][] dias = new int[3][3];
        dias [0][0] =31;
        dias [0][1] =28;
        dias [0][2] =31;

        dias [1][0] =31;
        dias [1][1] =28;
        dias [1][2] =31;

        for(int i =0; i < dias.length; i++){
            for (int j = 0; j < dias[0].length; j++)
            {
                System.out.println(dias[i][j]);
            }
        }





    }
}
