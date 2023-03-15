package VarOpe;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		
		
		float n1,n2,soma;
		int op;
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário:");
		n1 = leitura.nextFloat();
		System.out.println("\nDigite o Abono:");
		n2 = leitura.nextFloat();
		
		soma = (n1+n2);
		System.out.printf("\nNovo Salário é:",soma);
		
		if(soma>= n1 +n2) {
			System.out.println(soma);
	
		
		}
	}

}
