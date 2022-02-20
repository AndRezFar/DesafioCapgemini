import java.util.Scanner;

public class Desafio2 {


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha desejada:");
        String senha = scanner.nextLine();
        int caracterSenha = senha.length();

        boolean senhaNumero = senha.matches("\\D*");
        boolean senhaLetraMaiuscla = senha.matches(".*[A-Z]+.*");
        boolean senhaCaracterEspecial = senha.matches(".*\\W+.*");
        boolean senhaEspaco = senha.matches("\\S*");

        if (caracterSenha == 0) {
            System.out.println("Digite a senha!");
        } else if (caracterSenha < 6) {
            System.out.println("Está faltando " + (6 - caracterSenha) + " caractéres para sua senha ser forte!");
        } else if (!senhaEspaco) {
            System.out.println("Não pode ter espaço na senha!");
        } else if (senhaNumero) {
            System.out.println("É necessário colocar 1 número!");
        } else if (!senhaLetraMaiuscla) {
            System.out.println("É necessário ter uma letra maiúscula");
        } else if (!senhaCaracterEspecial) {
            System.out.println("É necessário ter um caracter especial!");
        } else {
            System.out.println("Sua senha e forte!");
        }
    }
}
