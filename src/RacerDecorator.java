
public abstract class RacerDecorator implements IRacer {

	protected IRacer decoratedRacer;

	public RacerDecorator(IRacer decoratedRacer) {
		this.decoratedRacer = decoratedRacer;
	}

	@Override
	public abstract void displayAllAnimals(); 

}
