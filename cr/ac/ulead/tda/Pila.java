package cr.ac.ulead.tda;

import java.util.Scanner;

public class Pila {
	private static Scanner input = new Scanner(System.in);
	public static String[] data = new String[50];
	static int top = 0;
	static int option;
	static String info = null;

	public static void main(String[] args) throws Exception {
		do {
			System.out.println("Bienvenido a la PILA");
			System.out.println("1. Introducir un elemento de la pila");
			System.out.println("2. Sacar un elemento de la pila");
			System.out.println("3. Mostrar la menor edad almacenada");
			System.out.println("4. Salir de la pila");

			option = input.nextInt();
			if (option == 1) {
				System.out.println("Ingrese un dato a la pila:");
				push(info = input.next());
			}
			if (option == 2) {
				pop();
			}
			if (option == 3) {
				System.out.println("No se completo este paso.");
			}
		} while (option != 4);
	}

	public Pila(int size) {
		data = new String[size];
	}

	public static boolean isEmpthy() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	public static void push(String person) {
		data[top] = person;
		System.out.println("El dato: " + person + " ha sido almacenado");
		top++;
	}

	public static String pop() throws Exception {
		if (isEmpthy()) {
			throw new Exception("Stack is UnderFlow");
		} else {
			top = top - 1;
			System.out.println("El dato: " + data[top] + " ha sido eliminado");
			return data[top];
		}
	}

}
