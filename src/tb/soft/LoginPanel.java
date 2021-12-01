package tb.soft;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.TreeMap;

public class LoginPanel extends JPanel {
	JLabel userLabel = new JLabel("User");
	JLabel passwordLabel = new JLabel("Password");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField ();
	JButton loginButton = new JButton("Login");
	JButton clearButton = new JButton("Clear");
	TreeMap<String, char[]> loginData;
	LoginPanel() {
		defineExampleData();
		setLayout(null);
		defineLocations();
		addComponents();
		addActionListeners();
	}
	
	public void defineLocations() {
		
		userLabel.setBounds(100, 100, 100, 30);
		passwordLabel.setBounds(100, 170, 100, 30);
		userTextField.setBounds(200, 100, 150, 30);
		passwordField.setBounds(200, 170, 150, 30);
		loginButton.setBounds(100, 250, 100, 30);
		clearButton.setBounds(250, 250, 100, 30);
	}
	public void defineExampleData() {
		loginData = Utils.createExampleLoginData();
	}
	
	public void addComponents() {
		System.out.println("yes");
		add(userLabel);
		add(passwordLabel);
		add(userTextField);
		add(passwordField);
		add(loginButton);
		add(clearButton);
	}
	public void addActionListeners() {
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String login = userTextField.getText();
				char[] password = passwordField.getPassword();
				if(checkIfUserExists(login, password)) {
					setBackground(new Color(76,180,32));
				} else {
					setBackground(new Color(208,5,33));
				}
			}
		});
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userTextField.setText("");
				passwordField.setText("");
				setBackground(null);
				
			}
		});
	}
	private boolean checkIfUserExists(String login, char[] password) {
		return Arrays.equals(loginData.get(login), password);
	}
}
