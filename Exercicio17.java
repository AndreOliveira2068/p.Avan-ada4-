import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int X, cont;
		for (int i = 0; i < N; i++) {
			cont = 0;
			X = leitor.nextInt();
			for (int j = 2; j < X; j++) {
				if (X % j == 0)
					cont++;
			}
			if (cont == 0)
				System.out.println(X + " � primo");
			else
				System.out.println(X + " nao � primo");
		}
	}

}
