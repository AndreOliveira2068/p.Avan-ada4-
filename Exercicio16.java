import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16{
	


	public static void main(String[] args) {
		 Double countryA, countryB;
		  int yearsToCome = 0;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  while(true) {
		   System.out.print("Digite a popula��o do Pais A: ");
		   try {
		    countryA = sc.nextDouble();
		    break;
		   } catch (InputMismatchException e) {
		    sc.next();
		    System.err.println("Digite apenas valore n�mericos!");
		   }
		  }
		  
		  while(true) {
		   System.out.print("Digite a popula��o do Pais B: ");
		   try {
		    countryB = sc.nextDouble();
		    if(!(countryA <= countryB)) {
		     System.err.println("A popula��o do pais B deve ser maior ou igual a popula��o do pais A!");
		     continue;
		    }
		    break;
		   } catch (InputMismatchException e) {
		    sc.next();
		    System.err.println("Digite apenas valore n�mericos!");
		   
		   }
		   
		  }
		  
	}
}
		  
		   
	   

	

