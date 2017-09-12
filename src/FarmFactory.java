/* Singleton Pattern implementation */

public class FarmFactory extends AbstractFactory {

	private static FarmFactory farmFactory;

	private FarmFactory() {

	}

	public static synchronized FarmFactory getInstance() {
		if (farmFactory == null) {
			farmFactory = new FarmFactory();
		}
		return farmFactory;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public IFarm getFarm(String farm) {

		if (farm == null) {
			return null;
		}

		if (farm.equalsIgnoreCase("farm")) {
			return new HumanSocietyCenter();
		}
		return null;
	}

	@Override
	public IRacer getRacer(String racerType) {

		return null;
	}

}
