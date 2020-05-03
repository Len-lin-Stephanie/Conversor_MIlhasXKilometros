package cliente;

public class Programa {
	public static void main(String[] args) {
		Conversor conversor = new ConversorService().getConversorPort();
		
		//System.out.println(conversor.kilometrosParaMilhas(12));
		//System.out.println(conversor.milhasParaKilometros(12));
	}

}
