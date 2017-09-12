
public class Context {
	private IRacer racer;

	public Context(IRacer racer) {
		this.racer = racer;
	}

	public synchronized void executeStrategy() {
		racer.displayAllAnimals();
	}

}
