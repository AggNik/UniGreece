import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gui {
	//Η κλαση αυτη ειναι υπερκλαση ολων των κλασεων γραφικης διασυνδεσης.
	//Περιλαμβανει τα βασικα στοιχεια των οθονων.
	
	protected JFrame frame=new JFrame();
	protected JPanel panel=new JPanel();
	protected JPanel titlePanel=new JPanel();
	protected JLabel title=new JLabel("UniGreece");
	protected JLabel prompt=new JLabel("Συμπληρωστε τα στοιχεια σας");
	protected JLabel logo=new JLabel("Soft 10");
	protected Font font1=new Font("Arial",Font.PLAIN,30);
	protected Font font2=new Font("Arial",Font.PLAIN,20);
	
	public Gui()
	{
		frame.setLayout(new BorderLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(titlePanel,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.CENTER);
		
		titlePanel.add(title);
		title.setBounds(50,100,75,25);
		title.setFont(font1);
		
		logo.setBounds(1470,680,70,70);
		logo.setFont(new Font("Arial",Font.BOLD,10));
	}
}
