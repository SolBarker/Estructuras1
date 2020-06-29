package cr.ac.ulead.ejecutables.ui;

import java.io.PrintStream;
import java.util.Scanner;

import cr.ac.ulead.ejecutables.Gestor;
import cr.ac.ulead.tda.Pila;

public class UI {
	private PrintStream output = new PrintStream(System.out);
	private Scanner input = new Scanner(System.in);
	Gestor logica = new Gestor();
	Pila inf = new Pila(10);

	public void ShowMenu() throws Exception {
		int option;
		output.println("Serializador de formato XML y Json");
		output.println("Escoja una opcion: ");
		output.println("1. Persona");
		output.println("2. Mascota");
		option = input.nextInt();
		logica.EjecutarOpcion(option);
	}

	public void wrongOption() {
		output.println("Opcion incorrecta!");
	}

	public void ShowMenu2() {
		System.out.println("------------------------------------------------ ");
		output.println("Escoja una opcion para serializar: ");
		output.println("1. Informacion en formato: XML");
		output.println("2. Informacion en formato: Json");
	}

	public void ShowAgain() {
		output.println("Desea Serealizar denuevo? ");
		output.println("1. Intentar denuevo ");
		output.println("2. Salir  ");

	}

	public void ShowFirewall() {
		output.println("Gracias por participar :) ");

	}

}
