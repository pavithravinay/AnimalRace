/* Singleton Pattern implementation */
public class RacerFactory extends AbstractFactory {

	private static RacerFactory racerFactory;

	private RacerFactory() {

	}

	public static synchronized RacerFactory getInstance() {
		if (racerFactory == null) {
			racerFactory = new RacerFactory();
		}
		return racerFactory;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public IRacer getRacer(String racerType) {

		if (racerType == null) {
			return null;
		}

		if (racerType.equalsIgnoreCase("Plain Racer")) {
			return new Racer();
		} else if (racerType.equalsIgnoreCase("Song Racer")) {
			return new SongRacerDecorator(new Racer());
		} else if (racerType.equalsIgnoreCase("Multicolor Racer")) {
			return new MultiColorRacer();
		}
		return null;
	}

	@Override
	public IFarm getFarm(String farm) {

		return null;
	}

}
