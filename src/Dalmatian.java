import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Dalmatian extends Dog {

	private static int counter;

	public Dalmatian(String name, int id, double age, String type, String breed, String readyForAdoption,
			String medicalCondition, String notes, int x, int y) {
		super(name, id, age, type, breed, readyForAdoption, medicalCondition, notes, x, y);
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public String toString() {
		return super.toString();
	}

	@Override
	public void draw(Graphics g, JComponent comp) {
		int x = getX();
		int y = getY();
		File file = new File("Images/dalmatian.jpg");
		BufferedImage image = null;

		try {
			image = ImageIO.read(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

		ImageIcon poodle = new ImageIcon(image);

		poodle.paintIcon(comp, g, x, y);

	}

	@Override
	public ArrayList<Dog> addDog(Dog dog) {
		dogList.add(dog);
		counter++;
		return dogList;
	}

}
