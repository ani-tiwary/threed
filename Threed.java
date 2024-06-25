import java.awt.Toolkit;
import javax.swing.JFrame;

public class Threed extends JFrame{
	static JFrame F = new Threed();
	Screen ScreenObject = new Screen();
	
	public Threed()
	{
		add(ScreenObject);
		setUndecorated(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
	}
}