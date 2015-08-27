package exercises;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c;
		System.out.println("Digite um número");
		c = input.nextInt();
		if(c < 7)
			System.out.println("Numero menor que 7");
		if(c >= 7)
			System.out.println("Numero maior ou igual a 7");
			

	}

}
