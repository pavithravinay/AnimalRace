import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Chicken extends Bird {

	private int x;
	private int y;
	private static int counter;

	public Chicken(String name, int id, double age, String type, String breed, String readyForAdoption,
			String medicalCondition, String notes, int x, int y) {
		super(name, id, age, type, breed, readyForAdoption, medicalCondition, notes);
		counter++;
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

	public int getCounter() {
		return counter;
	}

	public void draw(Graphics g, JComponent comp) {
		int x = getX();
		int y = getY();
		File file = new File("Images/chicken.jpg");
		BufferedImage image = null;

		try {
			image = ImageIO.read(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

		ImageIcon chick = new ImageIcon(image);

		chick.paintIcon(comp, g, x, y);

	}

}
