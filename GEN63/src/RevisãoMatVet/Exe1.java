package RevisãoMatVet;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		int[] vet = new int [5];
		int maiorPontuacao=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("\nEntre com um valor");
			vet[x] = leia.nextInt();
			
			if(maiorPontuacao < vet[x]) {
				maiorPontuacao = vet[x];
			}
			
			}
		}
		
		

	}

}
