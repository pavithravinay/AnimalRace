import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SongRacerDecorator extends RacerDecorator {

	public SongRacerDecorator(IRacer decoratedRacer) {
		super(decoratedRacer);

	}

	@Override
	public void displayAllAnimals() {
		decoratedRacer.displayAllAnimals();
		playSong(decoratedRacer);

	}

	public void playSong(IRacer iRacer) {
		String soundName = "ILikeToMoveIt.wav";
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
