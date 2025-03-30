package academy.devDojo.maratonaJava.introducao.Aulas05;

public class Aula05_EstruturasCondicionais03 {
        public static void main(String[] args) {
            // Utilizando Switch e dados os valores 1 a 7, imprima se é dia útil ou final de semana
            // Considerando 1 como Domingo
            byte dia = 3; // Altere o número para testar diferentes dias da semana

            String nomeDia = "";  // Inicializando variáveis fora do switch
            String tipoDia = "";

            switch(dia) {
                case 1: {
                    nomeDia = "Domingo";
                    tipoDia = "Final de semana";
                    break;
                }
                case 2: {
                    nomeDia = "Segunda-feira";
                    tipoDia = "Dia útil";
                    break;
                }
                case 3: {
                    nomeDia = "Terça-feira";
                    tipoDia = "Dia útil";
                    break;
                }
                case 4: {
                    nomeDia = "Quarta-feira";
                    tipoDia = "Dia útil";
                    break;
                }
                case 5: {
                    nomeDia = "Quinta-feira";
                    tipoDia = "Dia útil";
                    break;
                }
                case 6: {
                    nomeDia = "Sexta-feira";
                    tipoDia = "Dia útil";
                    break;
                }
                case 7: {
                    nomeDia = "Sábado";
                    tipoDia = "Final de semana";
                    break;
                }
                default:
                    System.out.println("Dia inválido");
                    return; // Encerra o programa se o dia for inválido
            }

            // Após o switch, imprima o nome do dia e tipo
            System.out.println("Dia selecionado: " + nomeDia);
            System.out.println("Tipo: " + tipoDia);
        }

}
