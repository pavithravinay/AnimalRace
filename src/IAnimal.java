import java.awt.Graphics;

import javax.swing.JComponent;

public interface IAnimal {

	public void draw(Graphics g, JComponent comp);

	public String getName();
}
