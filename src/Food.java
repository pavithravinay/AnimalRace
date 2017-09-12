
public class Food {
	
	private String name;	
	private String animalName;
	private int power;
	private String filePath;
	
	public Food(String name, String animal, int power, String path){
		this.name=name;
		this.animalName=animal;
		this.power=power;
		this.filePath=path;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
