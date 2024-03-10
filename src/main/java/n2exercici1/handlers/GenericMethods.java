package n2exercici1.handlers;

public class GenericMethods {
	
	//Java no permet que el arguments siguin genérics i no generics a la vegada.
	//Si que es correcte un únic genéric amb amb un parámetre no genéric.

	public <T> void imprimirPerPantalla(T primer, String paraula) {
		
		System.out.println("El primer argument és " + primer);
		System.out.println("El segon argument és " + paraula);
		
	}
}
