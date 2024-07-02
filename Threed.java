
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Threed extends JFrame{

	static Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
	static JFrame F = new Threed();
	Screen ScreenObject = new Screen();
	
	public Threed()
	{
		add(ScreenObject);
		setUndecorated(true);
		setSize(ScreenSize);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
	}
}
