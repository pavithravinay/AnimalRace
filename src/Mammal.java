import java.awt.Graphics;

import javax.swing.JComponent;

public abstract class Mammal implements IAnimal {

	private String name;
	private int id;
	private double age;
	private String type;
	private String breed;
	private String readyForAdoption;
	private String medicalCondition;
	private String notes;

	public Mammal() {

	}

	public Mammal(String name, int id, double age, String type, String breed, String readyForAdoption,
			String medicalCondition, String notes) {

		this.name = name;
		this.id = id;
		this.age = age;
		this.type = type;
		this.breed = breed;
		this.readyForAdoption = readyForAdoption;
		this.medicalCondition = medicalCondition;
		this.notes = notes;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getReadyForAdoption() {
		return readyForAdoption;
	}

	public void setReadyForAdoption(String readyForAdoption) {
		this.readyForAdoption = readyForAdoption;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Name: " + name + "<br>" + "Type: " + type + "<br>" + "Breed: " + breed + "<br>" + "Ready for adoption: "
				+ readyForAdoption + "<br>" + "Medical Condition: " + medicalCondition + "<br>" + "Notes: " + notes;

	}

	public abstract void draw(Graphics g, JComponent comp);

}
