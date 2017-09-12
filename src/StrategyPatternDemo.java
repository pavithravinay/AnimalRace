public class StrategyPatternDemo {

	/* Make sure to comment unused strategies */
	public static void main(String[] args) {

		/* Strategy #1 - Plain Racer */
		// Context context1 = new Context(new SongRacerDecorator(new Racer()) );
		// context1.executeStrategy();

		/* Strategy #2 - Reverse Racer with food Panel */
//		 Context context2 = new Context(new SongRacerDecorator(new
//		 ReverseRacerWithFood()));
//		 context2.executeStrategy();

		/* Strategy #3 - MultiColor Racer */
		Context context3 = new Context(new SongRacerDecorator(new MultiColorRacer()));
		context3.executeStrategy();

	}
}