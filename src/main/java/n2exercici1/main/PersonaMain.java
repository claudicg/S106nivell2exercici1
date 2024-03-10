package n2exercici1.main;

import n2exercici1.beans.Persona;
import n2exercici1.handlers.GenericMethods;

public class PersonaMain {

	public static void main(String[] args) {

		Persona persona = new Persona("Josep", "Ruiz", 36);
		GenericMethods demo = new GenericMethods();
		
		demo.imprimirPerPantalla("Casa", "Finestra");
		System.out.println();
		demo.imprimirPerPantalla(persona, "Casa");
		System.out.println();
		demo.imprimirPerPantalla(10, "Finestra");
	}

}
