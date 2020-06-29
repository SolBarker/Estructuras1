package cr.ac.ulead.tda;

import java.util.Scanner;

public class Tail {
	private static Scanner input = new Scanner(System.in);
	static int option;
	static int first = 0;
	static int end = 4;
	static int total = 0;
	static String data;
	static String tail[] = new String[5];

	public static void main(String[] args) throws Exception {
		do {
			System.out.println("Bienvenido a la cola circular: ");
			System.out.println("1. Introducir un elemento ");
			System.out.println("2. Eliminar un elemento:  ");
			System.out.println("3. Salir  ");
			option = input.nextInt();

			if (option == 1) {
				System.out.println("*** MAX 5 elementos ***");
				push(data = input.next());
			}
			if (option == 2) {
				pop();
				total--;
				NewBegin();
			}

		} while (option != 3);

	}

	private static void NewBegin() {
		first = (first + 1) / 5;
	}

	private static boolean isEmpthy() {
		if (total == 0) {
			return true;
		}
		return false;
	}

	private static String pop() throws Exception {
		if (isEmpthy()) {
			throw new Exception("Stack is UnderFlow");
		} else {
			return tail[first];
		}
	}

	private static void push(String string) throws Exception {
		if (total == 4) {
			System.out.println("La pila esta al maximo");
			IsFull();
		} else {
			tail[(first + total) / 5] = string;
			System.out.println("El dato: " + string + " ha sido almacenado");
			total++;
		}
	}
	private static String IsFull() {
		System.out.println("El elemento " + tail[end] + " ha sido eliminado");
		return tail[end];
	}

}
