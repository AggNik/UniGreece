import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInScreen extends Gui{
	//Στην κλαση αυτη γινεται η εισοδος του χρηστη στο συστημα.
	//Για λογους ευκολιας,η εισοδος γινεται με οτιδηποτε και να εισαγει
	//ο χρηστης στα πεδια των στοιχειων
	
	private JButton submitButton=new JButton("Submit");
	private JTextField usernameField=new JTextField();
	private JPasswordField passwordField=new JPasswordField();
	private JLabel usernameLabel=new JLabel("Username:");
	private JLabel passwordLabel=new JLabel("Password:");
	private JLabel prompt=new JLabel("Συμπληρωστε τα στοιχεια σας");
	protected Toolkit toolkit =Toolkit.getDefaultToolkit();
	protected double width = toolkit.getScreenSize().getWidth();
	protected double height = toolkit.getScreenSize().getHeight();
	
	public LogInScreen()
	{
		super();
		frame.setSize((int)width,(int)height);
		usernameLabel.setBounds(590,150,75,25);
		passwordLabel.setBounds(590,200,75,25);
		
		usernameField.setBounds(680,150,200,25);
		passwordField.setBounds(680,200,200,25);
		
		ButtonListener listener = new ButtonListener();
		submitButton.addActionListener(listener);
		
		submitButton.setBounds(715,300,100,25);
		submitButton.setFocusable(false);
		
		prompt.setBounds(630,30,300,50);
		prompt.setFont(font2);
		
		panel.add(prompt);
		panel.add(usernameLabel);
		panel.add(passwordLabel);
		panel.add(usernameField);
		panel.add(passwordField);
		panel.add(submitButton);
		panel.add(logo);
		panel.setLayout(null);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			 String Username=usernameField.getText();
			 String Password=String.valueOf(passwordField.getPassword());
			 
			if(e.getSource()==submitButton)
			{
				if(Username.length()>0 && Password.length()>0)
				{
					frame.dispose();
					TypeSelectScreen typeSelect = new TypeSelectScreen();
				}
					
			}
		}
	}

}
