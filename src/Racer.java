import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Racer implements MouseListener, IRacer {

	public Racer() {

	}

	JPanel panel;
	JFrame frame;
	int x = 0;
	int y = 0;
	Container container;
	HashMap<String, Animal> animalsList;
	HashMap<String, Animal> racingAnimalsList = new HashMap<String, Animal>();
	Timer myTimer = null;

	public void displayAllAnimals() {

		animalsList = new HashMap<String, Animal>();

		// Tortoise

		Animal ponyta = new Animal("Ponyta", 50, 0, new File("Images/ponyta.jpg").getAbsolutePath(), 8, 0);
		Animal eevee = new Animal("Eevee", 50, 100, new File("Images/eevee.jpg").getAbsolutePath(), 6, 200);
		Animal tortoise = new Animal("Tortoise", 50, 200, new File("Images/tortoise.jpg").getAbsolutePath(), 3, 400);
		Animal bunny = new Animal("Bunny", 50, 300, new File("Images/bunny.jpg").getAbsolutePath(), 5, 600);

		animalsList.put(tortoise.getName(), tortoise);
		animalsList.put(bunny.getName(), bunny);
		animalsList.put(eevee.getName(), eevee);
		animalsList.put(ponyta.getName(), ponyta);

		initializeRaceTrack(animalsList);
	}

	private void initializeRaceTrack(HashMap<String, Animal> animalList) {

		panel = new JPanel();
		frame = new JFrame();
		container = new Container();

		try {
			for (HashMap.Entry<String, Animal> entry : animalList.entrySet()) {
				Animal animal = entry.getValue();
				File animalFile = new File(animal.getFilePath());
				BufferedImage image = null;
				try {
					image = ImageIO.read(animalFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ImageIcon icon = new ImageIcon(image);
				JLabel label = new JLabel();
				label.setName(animal.getName());

				label.setIcon(icon);
				panel.add(label);
				label.addMouseListener(this);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel.setPreferredSize(new Dimension(200, 200));
		panel.setBackground(Color.BLUE);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = frame.getContentPane();
		container.add(panel, BorderLayout.EAST);
		container.setBackground(Color.white);
		frame.setVisible(true);

	}

	private void startRacing(Animal animal) {

		JPanel racingPanel = new JPanel();
		racingPanel.setLayout(null);
		Insets insets = racingPanel.getInsets();

		Animal animalCheck = racingAnimalsList.get(animal.getName());
		if (animalCheck == null) {
			racingAnimalsList.put(animal.getName(), animal);
		}

		for (HashMap.Entry<String, Animal> entry : racingAnimalsList.entrySet()) {
			Animal a = entry.getValue();
			JLabel label = new JLabel(getImageIcon(a.getFilePath()));
			Dimension size = label.getPreferredSize();
			label.setBounds(x * a.getSpeed(), a.getTrackNumber() + insets.top, size.width, size.height);
			racingPanel.add(label);
		}

		// Repeat race
		if (x >= frame.getWidth()) {
			x = 0;
		}
		x += 10;

		frame.getContentPane().add(racingPanel);
		frame.setVisible(true);

	}

	@Override
	public synchronized void mouseClicked(MouseEvent arg0) {

		JLabel clickedLabel = (JLabel) arg0.getSource();

		Animal raceAnimal = animalsList.get(clickedLabel.getName());

		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				startRacing(raceAnimal);
			}
		};

		if (myTimer != null && myTimer.isRunning()) {
			myTimer.stop();
		}

		x = 0;
		myTimer = new Timer(300, listener);

		myTimer.start();

	}

	private static ImageIcon getImageIcon(String filePathx) {

		File filePath = new File(filePathx);
		BufferedImage image = null;
		try {
			image = ImageIO.read(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon myIcon = new ImageIcon(image);
		return myIcon;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
