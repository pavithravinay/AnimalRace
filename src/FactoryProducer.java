
public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType) {

		if (factoryType.equalsIgnoreCase("IRacer")) {
			return RacerFactory.getInstance();
			/*
			 * return new RacerFactory(); - this is not allowed as RacerFactory
			 * is a singleton class.
			 */
		} else if (factoryType.equalsIgnoreCase("IFarm")) {
			return FarmFactory.getInstance();
			/*
			 * return new FarmFactory(); - this is not allowed as FarmFactory is
			 * a singleton class.
			 */
		}
		return null;
	}

}
