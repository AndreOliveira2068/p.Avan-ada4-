import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de sequ�ncia de n�meros que ser�o apresentadas: ");
        int qtdNum = sc.nextInt();
        System.out.println("Digite a quantidade de linhas de sa�da que ser�o apresentadas: ");
        int qtdLinhas = sc.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 0; j < qtdNum; j++) {
                System.out.print((i++) + " " + (i++) + " " + (i++));
                System.out.println();
            }   
        }

        sc.close();
    }
}