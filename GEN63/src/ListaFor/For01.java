package ListaFor;

import java.util.Scanner;

public class Laco {

	public static void main(String[] args) {
		
		int numero,somaPar=0,contImpar=0;
		float n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=3;x++) { // x++ é a mesma coisa que x = x+1
			
			System.out.println("\nEntre com o nome do Alune");
			nome = leia.nextLine();
			leia.nextLine();
			System.out.println("\nEntre com a primeira nota");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;
			somaMedia += media; // somaMedia = SomaMedia + media
			System.out.println("\nA média do alune:"+nome+" foi de: "+media);
		}
		mediaGeral = somaMedia /3;
		System.out.printf("\nMédia geral da turma foi de: %.2f",mediaGeral);
		

			
		
	}
	}

