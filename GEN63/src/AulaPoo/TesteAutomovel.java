package AulaPoo;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel("Bruna","Kombi","NOA2008",1998);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferência de Proprietário");
		
		auto1.setNomeProprietario("Larissa Pimenta");
		auto1.imprimirInfo();
		
		System.out.println("\nMudança de placa");
		
		auto1.setPlaca("ABC8888");
		auto1.imprimirInfo();

	}

}