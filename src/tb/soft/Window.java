package tb.soft;

import javax.swing.JFrame;

import java.awt.Container;

public class Window extends JFrame {
	Container container = getContentPane();
	
	Window() {
		
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		defineLayout();
		defineContent();
		setVisible(true);
	}

	public void defineLayout() {
		container.setLayout(null);
	}

	public void defineContent() {
		setContentPane(new LoginPanel());
		setJMenuBar(new MenuBar());
		
		
	}
}