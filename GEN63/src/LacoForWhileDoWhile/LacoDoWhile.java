//For = intervalo definido
//While = teste logico no inicio
//DoWhile = teste logico no fim

package LacoForWhileDoWhile;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		int tabuada,x=1,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a tabuada que deseja visualizar");
		tabuada = leia.nextInt();
		
		do {
			
			resultado = tabuada * x;
			System.out.println("\n"+tabuada+"X"+x+" = "+resultado);
			x++;
			
		} while (x<=10);
		
		
		
		
		

	}

}
