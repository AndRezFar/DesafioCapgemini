import java.util.Scanner;

public class Desafio1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus:");
        int quantidade = scanner.nextInt();

        String estrelas = "";
        String vazio = "";


        for (int c = 0; c < quantidade; c++) {
            vazio = vazio + " ";
        }

        int vazio1 = vazio.length();
        for (int b = 0; b < quantidade; b++) {
            estrelas = estrelas + "*";
            int vazio2 = vazio1 / 2;
            vazio = vazio.substring(0, vazio2).concat(vazio.substring(vazio2 + 1, vazio1));
            System.out.println(vazio + estrelas);
            vazio1 = vazio.length();
        }

        System.out.println("Fim!");
    }

}