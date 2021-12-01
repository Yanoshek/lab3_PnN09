package tb.soft;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {
	JMenu menu = new JMenu("Menu");
	JMenuItem menuItem1 = new JMenuItem("Item 1");
	JMenuItem menuItem2 = new JMenuItem("Item 2");

	MenuBar() {
		setupMenu();
	}

	public void setupMenu() {
		add(menu);
		menu.add(menuItem1);	
		menu.add(menuItem2);	
	}

	
}
