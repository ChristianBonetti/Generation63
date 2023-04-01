package ControleDeFluxo;

public class ControleDeFluxoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int estoque = 50;
		
		if(estoque >= 100) {
			System.out.println("Produto Suficiente");
		} else if (estoque <100 && estoque >50) {
			System.out.println("alerta : avaliar possibilidade de novo pedido");
			}else {
				System.out.println("atenção faça um novo pedido");
			}
		
		
		
	}

}
