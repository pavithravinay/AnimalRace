import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Cat extends Mammal {
	private static int counter;
	private int x;
	private int y;

	public Cat(String name, int id, double age, String type, String breed, String readyForAdoption,
			String medicalCondition, String notes, int x, int y) {
		super(name, id, age, type, breed, readyForAdoption, medicalCondition, notes);
		counter++;
		this.x = x;
		this.y = y;
	}

	public int getCounter() {
		return counter;
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

	public String toString() {
		return super.toString();
	}

	@Override
	public void draw(Graphics g, JComponent comp) {
		int x = getX();
		int y = getY();
		File cat1 = new File("Images/cat.jpg");
		BufferedImage image = null;

		try {
			image = ImageIO.read(cat1);
		} catch (IOException e) {

			e.printStackTrace();
		}

		ImageIcon cat = new ImageIcon(image);
		cat.paintIcon(comp, g, x, y);

	}
}
