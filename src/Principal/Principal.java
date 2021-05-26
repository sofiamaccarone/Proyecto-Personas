package Principal;

import Persona.Persona;

public class Principal {
	
	public static void main() {
		Persona yo = new Persona ("Sofia", "Maccarone", "34552529", 31, 1.57, 65.00);
		System.out.println(yo.getEstado());
	}

}
