package cr.ac.ulead.interfaces.cr.ac;

import cr.ac.interfaces.SerializadorUlead;

public class Mascota implements SerializadorUlead {
	String name;
	String tipo;
	String edad;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota [name=" + name + ", tipo=" + tipo + ", edad=" + edad + "]";
	}

	@Override
	public void SerializadorXML() {
		System.out.println("<?xml version='1.0' encoding'UFT-8'standalone='no'?>");
		System.out.println("<Mascota.java>");
		System.out.println("     <name>" + name + "</name>");
		System.out.println("      <type>" + tipo + "</Type>");
		System.out.println("        <age>" + edad + "</age>");
		System.out.println("</Mascota.java>");
	}

	@Override
	public void SerializadorJson() {
		System.out.println("{");
		System.out.println("     'name': '" + name + "' ,");
		System.out.println("      'type': '" + tipo + "' ,");
		System.out.println("        'age': " + edad + " ,");
		System.out.println("}");

	}
}
