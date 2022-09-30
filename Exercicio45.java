import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeMaisNova = 99;
        String nomeDaPessoaMaisNova = "";
        int idadeMaisVelha = 0;
        String nomeDaPessoaMaisVelha = "";

        Scanner scan = new Scanner(System.in);
        // Entrada dos dados
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = scan.next();
            System.out.println("Digite a idade:");
            idades[i] = scan.nextInt();
        }
        // Extraindo os idades e nomes do maior e menor idade
        for (int i = 0; i < 3; i++) {
            if (idades[i] < idadeMaisNova) {
                idadeMaisNova = idades[i];
                nomeDaPessoaMaisNova = nomes[i];
            }
            if (idades[i] > idadeMaisVelha) {
                idadeMaisVelha = idades[i];
                nomeDaPessoaMaisVelha = nomes[i];
            }
        }
        // Exibindo os resultados
        System.out.println("Pessoa Mais nova Nome: " + nomeDaPessoaMaisNova);
        System.out.println("Pessoa Mais nova Idade: " + idadeMaisNova);
        System.out.println("Pessoa Mais velha Nome : " + nomeDaPessoaMaisVelha);
        System.out.println("Pessoa Mais velha Idade: " + idadeMaisVelha);
    }
}