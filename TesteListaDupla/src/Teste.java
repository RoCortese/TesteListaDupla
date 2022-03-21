import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Lista lista = new Lista(); //lista tem a capacidade de armazenar o endereço de memória do objeto do tipo Lista
		
		Scanner teclado = new Scanner(System.in);
		
		lista.inserir("Rodrigo", 177834);
		lista.inserir("Selmini", 178067);
		lista.inserir("Didao", 179097);
		
		lista.imprimir();
		//menssagem
	}

}