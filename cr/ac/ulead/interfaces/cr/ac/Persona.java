package cr.ac.ulead.interfaces.cr.ac;

import cr.ac.interfaces.SerializadorUlead;

public class Persona implements SerializadorUlead {

	String name;
	String lastname;
	String dateofbirt;
	String weight;
	String height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirt() {
		return dateofbirt;
	}

	public void setDateofbirt(String dateofbirt) {
		this.dateofbirt = dateofbirt;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public void SerializadorXML() {
		System.out.println("<?xml version='1.0' encoding'UFT-8'standalone='no'?>");
		System.out.println("<Persona.java>");
		System.out.println("      <name>" + name + "</name>");
		System.out.println("       <lastname>" + lastname + "</lastname>");
		System.out.println("         <dateofbirt>" + dateofbirt + "</dateofbirt>");
		System.out.println("        <weight>" + weight + "</weight>");
		System.out.println("      <height>" + height + "</height>");
		System.out.println("</Persona.java>");

	}

	@Override
	public void SerializadorJson() {
		System.out.println("{");
		System.out.println("     'name': '" + name + "' ,");
		System.out.println("      'lastname': '" + lastname + "' ,");
		System.out.println("        'dateofbirt': " + dateofbirt + " ,");
		System.out.println("         'weight': " + weight + " ,");
		System.out.println("          'height': " + height + " ,");
		System.out.println("}");

	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", lastname=" + lastname + ", dateofbirt=" + dateofbirt + ", weight=" + weight
				+ ", height=" + height + "]";
	}

}
