package exercises;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero = 10;
		int idade;
		int soma;
		System.out.println("Digite um número");
		idade = input.nextInt();
		soma = numero + idade;
		if(soma != 7)
			System.out.printf("O numero %d é maior que 7\n",soma);

	}

}
