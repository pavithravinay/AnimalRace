
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		/* Make sure to comment one of the code blocks(block1/block2) while executing the other  
		 * For instance, To work with Farm factory, comment code block 1 and uncomment code block 2
		 * To work with Racer factory, comment code block 2 and uncomment code block 1.
		/*
		
		/* Code block 1 -IRacer Factory */
		AbstractFactory racerFactory = FactoryProducer.getFactory("IRacer");
		IRacer racer1 = racerFactory.getRacer("Multicolor Racer");
		racer1.displayAllAnimals();
				
		/* Code block 2 -IFarm Factory */
//		AbstractFactory farmFactory = FactoryProducer.getFactory("IFarm");
//		IFarm farm = farmFactory.getFarm("farm");
//		farm.initializeAnimalList();
//		farm.displayAnimals();

	}
}
