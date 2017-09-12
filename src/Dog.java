import java.util.ArrayList;

public abstract class Dog extends Mammal {

	private int x;
	private int y;
	protected ArrayList<Dog> dogList = new ArrayList<Dog>();

	public Dog(String name, int id, double age, String type, String breed, String readyForAdoption,
			String medicalCondition, String notes, int x, int y) {
		super(name, id, age, type, breed, readyForAdoption, medicalCondition, notes);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ArrayList<Dog> getDogList() {
		return dogList;
	}

	public abstract ArrayList<Dog> addDog(Dog dog);

}
