import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Quantos HO serão falados por Noel: ");
        int qtdHo = sc.nextInt();

        for (int i = 0; i < qtdHo; i++) {
            System.out.print(" HO");
        }
            System.out.print("!");

        sc.close();
    }
}