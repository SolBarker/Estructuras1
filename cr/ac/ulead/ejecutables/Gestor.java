package cr.ac.ulead.ejecutables;

import java.util.ArrayList;
import java.util.Scanner;
import cr.ac.ulead.ejecutables.ui.UI;
import cr.ac.ulead.interfaces.cr.ac.Mascota;
import cr.ac.ulead.interfaces.cr.ac.Persona;
import cr.ac.ulead.tda.Pila;

public class Gestor {
	private static Scanner input = new Scanner(System.in);
	Mascota pet = new Mascota();
	Persona person = new Persona();
	Pila pila = new Pila(50);

	public ArrayList<Persona> ARRAY = new ArrayList<Persona>();
	public ArrayList<Mascota> PET = new ArrayList<Mascota>();
	private String datos[] = new String[5];

	public void EjecutarOpcion(int option) throws Exception {
		UI user = new UI();
		int option2;
		int option3;
		switch (option) {
		case 1:
			InputData();
			person.setName(datos[0]);
			person.setLastname(datos[1]);
			person.setDateofbirt(datos[2]);
			person.setHeight(datos[3]);
			person.setWeight(datos[4]);
			ARRAY.add(person);
			user.ShowMenu2();
			option2 = input.nextInt();
			if (option2 == 1) {
				person.SerializadorXML();
			}
			if (option2 == 2) {
				person.SerializadorJson();
			}
			user.ShowAgain();
			option3 = input.nextInt();
			if (option3 == 1) {
				user.ShowMenu();
			}
			if (option3 == 2) {
				user.ShowFirewall();
			}
			break;
		case 2:
			InputPet();
			pet.setName(datos[0]);
			pet.setEdad(datos[1]);
			pet.setTipo(datos[2]);
			user.ShowMenu2();
			option2 = input.nextInt();
			if (option2 == 1) {
				pet.SerializadorXML();
			}
			if (option2 == 2) {
				pet.SerializadorJson();
			}
			user.ShowAgain();
			option3 = input.nextInt();
			if (option3 == 1) {
				user.ShowMenu();
			}
			if (option3 == 2) {
				user.ShowFirewall();
			}
			break;
		default:
			user.wrongOption();
		}

	}

	private void InputPet() {
		System.out.println("Introduzca el nombre: ");
		datos[0] = input.next();

		System.out.println("Introduzca el tipo de animal: ");
		datos[1] = input.next();

		System.out.println("Introduzca la edad ");
		datos[4] = input.next();

	}

	public void InputData() {
		System.out.println("Introduzca el nombre: ");
		datos[0] = input.next();

		System.out.println("Introduzca el apellido: ");
		datos[1] = input.next();

		System.out.println("Introduzca el peso: ");
		datos[4] = input.next();

		System.out.println("Introduzca la fecha de nacimiento: ");
		datos[2] = input.next();

		System.out.println("Introduzca la altura: ");
		datos[3] = input.next();

	}
}
