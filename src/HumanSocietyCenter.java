import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

class HumanSocietyCenter extends JPanel implements IFarm {

	private static final long serialVersionUID = 1L;
	private static JFrame displayAnimalFrame;
	private static JFrame addNewAnimalFrame;
	private static JFrame updatedReportFrame;

	private static int x = 10;
	private static int y = 20;
	private static final int difference = 125;
	private static ArrayList<IAnimal> animalList = new ArrayList<IAnimal>();

	private static JLabel category;
	private static JTextField categoryInfo;
	private static JLabel type;
	private static JTextField typeInfo;
	private static JLabel breed;
	private static JTextField breedInfo;
	private static JLabel name;
	private static JTextField nameInfo;
	private static JLabel age;
	private static JTextField ageInfo;
	private static JLabel adoption;
	private static JTextField adoptionInfo;
	private static JLabel condition;
	private static JTextField conditionInfo;
	private static JLabel notes;
	private static JTextField notesInfo;

	private static Dog dog;
	private static Cat cat;
	private static Chicken chick;
	private static Sparrow sparrow;
	private static Poodle poodle;
	private static Dalmatian dal;

	/* No argument constructor */

	public HumanSocietyCenter() {
		setBackground(Color.white);
	}

	/* Draw method on each animal */

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		 * Notice an object of type Animal is used to iterate through the list -
		 * design principle 1
		 */
		for (IAnimal animal : animalList) {
			animal.draw(g, this);
		}

	}

	/* Generate Status report */

	public static JTable generateStatusReport() {
		int poodleCount = poodle.getCounter();
		int dalmatianCount = dal.getCounter();
		int catCount = cat.getCounter();
		int chickCount = chick.getCounter();
		int sparrowCount = sparrow.getCounter();

		String[] columns = { "Animal Type", "Name", "Count" };
		Object[][] data = { { "Dogs", "Poodle", poodleCount }, { "Dogs", "Dalmatian", dalmatianCount },
				{ "Cats", "Cats", catCount }, { "Birds", "Chicken", chickCount },
				{ "Birds", "Sparrow", sparrowCount } };
		JTable table = new JTable(data, columns);
		return table;

	}

	/* Display all the animals in Human Society Center */
	public void displayAnimals() {

		displayAnimalFrame = new JFrame();
		displayAnimalFrame.setTitle("Human Society Center");
		displayAnimalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayAnimalFrame.setSize(1200, 1500);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		displayAnimalFrame.add(mainPanel);
		mainPanel.add(new HumanSocietyCenter());

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		mainPanel.add(panel2);
		panel2.setLayout(new GridLayout(0, 1));

		String c = cat.toString();
		JLabel label1 = new JLabel("<html>" + c + "+<br></html>");
		panel2.add(label1);

		String d = dog.toString();
		JLabel label3 = new JLabel("<html>" + d + "</html>");
		panel2.add(label3);

		String chickInfo = chick.toString();
		JLabel label5 = new JLabel("<html>" + chickInfo + "</html>");
		panel2.add(label5);

		String sparrowInfo = sparrow.toString();
		JLabel label8 = new JLabel("<html>" + sparrowInfo + "</html>");
		panel2.add(label8);

		String poodleInfo = poodle.toString();
		JLabel label10 = new JLabel("<html>" + poodleInfo + "</html>");
		panel2.add(label10);

		String dalmatianInfo = dal.toString();
		JLabel label12 = new JLabel("<html>" + dalmatianInfo + "</html>");
		panel2.add(label12);

		JPanel panel3 = new JPanel();
		mainPanel.add(panel3);
		panel3.setLayout(new FlowLayout());

		JTable temp = generateStatusReport();
		temp.setPreferredScrollableViewportSize(temp.getPreferredSize());
		temp.setFillsViewportHeight(true);
		JLabel statusReport = new JLabel();
		statusReport.setText("Animal Status Report");
		panel3.add(statusReport);
		panel3.add(new JScrollPane(temp));

		JButton addButton = new JButton();
		addButton.setText("Add New Animal");
		HumanSocietyCenter client = new HumanSocietyCenter();
		addButton.addActionListener(client.new Button1());
		panel3.add(addButton);

		displayAnimalFrame.setVisible(true);
	}

	/* Add a new animal to Human Society center */

	public void addNewAnimal() {

		int xAxis = 10;
		int yAxis = 25;
		int incrementX = 10;
		int incrementY = 35;

		addNewAnimalFrame = new JFrame("Add New Animal");
		addNewAnimalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = addNewAnimalFrame.getContentPane();

		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);

		category = new JLabel("Animal Category(Mammal/Bird):");
		categoryInfo = new JTextField(15);

		contentPane.add(category);
		contentPane.add(categoryInfo);
		layout.putConstraint(SpringLayout.WEST, category, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, category, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, categoryInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, categoryInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		type = new JLabel("Animal Type(Dog/Cat etc..):");
		typeInfo = new JTextField(15);

		contentPane.add(type);
		contentPane.add(typeInfo);
		layout.putConstraint(SpringLayout.WEST, type, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, type, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, typeInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, typeInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		breed = new JLabel("Breed(Poodle/Dalmation/Pug etc..):");
		breedInfo = new JTextField(15);

		contentPane.add(breed);
		contentPane.add(breedInfo);
		layout.putConstraint(SpringLayout.WEST, breed, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, breed, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, breedInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, breedInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		name = new JLabel("Name:");
		nameInfo = new JTextField(15);

		contentPane.add(name);
		contentPane.add(nameInfo);
		layout.putConstraint(SpringLayout.WEST, name, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, name, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, nameInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, nameInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		age = new JLabel("Age:");
		ageInfo = new JTextField(15);

		contentPane.add(age);
		contentPane.add(ageInfo);
		layout.putConstraint(SpringLayout.WEST, age, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, age, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, ageInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, ageInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		adoption = new JLabel("Ready for Adoption(yes/no):");
		adoptionInfo = new JTextField(15);

		contentPane.add(adoption);
		contentPane.add(adoptionInfo);
		layout.putConstraint(SpringLayout.WEST, adoption, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, adoption, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, adoptionInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, adoptionInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		condition = new JLabel("Medical Condition:");
		conditionInfo = new JTextField(15);

		contentPane.add(condition);
		contentPane.add(conditionInfo);
		layout.putConstraint(SpringLayout.WEST, condition, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, condition, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, conditionInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, conditionInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		notes = new JLabel("Notes:");
		notesInfo = new JTextField(15);

		contentPane.add(notes);
		contentPane.add(notesInfo);
		layout.putConstraint(SpringLayout.WEST, notes, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, notes, yAxis, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, notesInfo, xAxis + incrementX, SpringLayout.EAST, category);
		layout.putConstraint(SpringLayout.NORTH, notesInfo, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;

		JButton add = new JButton("Add Animal");

		contentPane.add(add);
		layout.putConstraint(SpringLayout.WEST, add, xAxis, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, add, yAxis, SpringLayout.NORTH, contentPane);
		yAxis += incrementY;
		HumanSocietyCenter client = new HumanSocietyCenter();
		add.addActionListener(client.new Button2());
		addNewAnimalFrame.setSize(500, 700);
		addNewAnimalFrame.setVisible(true);

	}

	public static int readData() {
		// String categoryInput = categoryInfo.getText().toLowerCase();
		String typeInput = typeInfo.getText().toLowerCase();
		String breedInput = breedInfo.getText().toLowerCase();
		String nameInput = nameInfo.getText().toLowerCase();
		String ageInput = ageInfo.getText();
		String adoptionInput = adoptionInfo.getText();
		String conditionInput = conditionInfo.getText();
		String notesInput = notesInfo.getText();

		if (typeInput.isEmpty() || breedInput.isEmpty() || nameInput.isEmpty() || ageInput.isEmpty()
				|| adoptionInput.isEmpty() || conditionInput.isEmpty() || notesInput.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Fields cannot be left blank, please verify your data", "Error", 1);
			return 0;
		}

		switch (typeInput) {
		case "dog":
			switch (breedInput) {
			case "poodle":
				animalList.add(new Poodle(nameInput, (int) Math.random(), Double.parseDouble(ageInput), typeInput,
						breedInput, adoptionInput, conditionInput, notesInput, x, y));
				y += difference;
			case "dalmatian":
				animalList.add(new Dalmatian(nameInput, (int) Math.random(), Double.parseDouble(ageInput), typeInput,
						breedInput, adoptionInput, conditionInput, notesInput, x, y));
				y += difference;

				/* create an instance of the animal which you added */
			default:
				;
				break;
			}
			break;

		case "cat":
			animalList.add(new Cat(nameInput, (int) Math.random(), Double.parseDouble(ageInput), typeInput, breedInput,
					adoptionInput, conditionInput, notesInput, x, y));
			y += difference;
			break;
		case "chicken":
			animalList.add(new Chicken(nameInput, (int) Math.random(), Double.parseDouble(ageInput), typeInput,
					breedInput, adoptionInput, conditionInput, notesInput, x, y));
			y += difference;
			break;
		case "sparrow":
			animalList.add(new Sparrow(nameInput, (int) Math.random(), Double.parseDouble(ageInput), typeInput,
					breedInput, adoptionInput, conditionInput, notesInput, x, y));
			y += difference;
			break;
		default:
			break;
		}
		return 1;
	}

	/* Initial list of animals present in Human Society center */
	public void initializeAnimalList() {

		cat = new Cat("Kitty", 2, 3, "Cat", "Ragdoll", "no", "Needs attention",
				"He doesn't eat food properly, needs extra care!", x, y);
		y += difference;
		dog = new Poodle("Sunny", 1, 2, "Dog", "Poodle", "yes", "good", "He had a minor foot surgery last year!", x, y);
		y += difference;

		chick = new Chicken("Chewy", 3, 1, "Chicken", "Leghorn", "yes", "good",
				"he is very active, he eats 5 times a day.", x, y);
		y += difference;
		sparrow = new Sparrow("Sue", 4, 1, "Sparrow", "Song sparrow", "yes", "good", "he loves to sing!! ", x, y);
		y += difference;
		poodle = new Poodle("Poo", 5, 1, "Dog", "Poodle", "yes", "good",
				"she is just adorable, looking for a loving home.", x, y);
		y += difference;
		dal = new Dalmatian("Dolly", 6, 8, "Dog", "Dalmatian", "yes", "average",
				"he is a little old, needs regular checkups.", x, y);
		y += difference;

		animalList.add(cat);
		animalList.add(dog);
		animalList.add(chick);
		animalList.add(sparrow);
		animalList.add(poodle);
		animalList.add(dal);
	}

	public void displayUpdatedStatusReport() {

		updatedReportFrame = new JFrame();
		updatedReportFrame.setSize(300, 300);
		updatedReportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		updatedReportFrame.setVisible(true);

		Container content = updatedReportFrame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JTable temp = generateStatusReport();
		temp.setPreferredScrollableViewportSize(temp.getPreferredSize());
		temp.setFillsViewportHeight(true);
		JLabel statusReport = new JLabel();
		statusReport.setText("Animal Status Report");
		panel.add(statusReport);
		panel.add(new JScrollPane(temp));
		content.add(panel);

	}

	private class Button1 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			/* Dispose previous frame */
			displayAnimalFrame.dispose();
			addNewAnimal();

		}
	}

	private class Button2 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int result = readData();
			if (result != 0) {
				JOptionPane.showMessageDialog(null, "You have successfully added new animal.", "Successful", 1);
				categoryInfo.setText("");
				typeInfo.setText("");
				breedInfo.setText("");
				nameInfo.setText("");
				ageInfo.setText("");
				adoptionInfo.setText("");
				conditionInfo.setText("");
				notesInfo.setText("");

				/* Dispose previous frame */
				addNewAnimalFrame.dispose();
				displayUpdatedStatusReport();

			}

		}
	}
}