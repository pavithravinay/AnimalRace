import javax.swing.JComponent;

public class Animal extends JComponent {

	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private String name;
	private int speed;
	private int trackNumber; // On which track the animal will race;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String filePath;

	public Animal() {
		name = "";
	}

	public Animal(String name, int rX, int rY, String filePath, int speed, int trackNo) {
		this.name = name;
		this.x = rX;
		this.y = rY;
		this.setFilePath(filePath);
		this.speed = speed;
		this.trackNumber = trackNo;
	}

	public String getId() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [x=" + x + ", y=" + y + ", id=" + name + "]";
	}

}
