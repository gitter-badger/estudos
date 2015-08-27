package exercises;
import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Esse programa calcula o produto de 3 inteiros
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		int result;
		System.out.println("Digite um numero inteiro:\n");
		x = input.nextInt();
		System.out.println("Digite um numero inteiro:\n");
		y = input.nextInt();
		System.out.println("Digite um numero inteiro:\n");
		z = input.nextInt();
		result = x+y+z;
		System.out.printf("O produto da soma dos três inteiros é: %d",result);
		
	}

}
