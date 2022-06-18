import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TypeSelectScreen extends Gui{
	//Η συγκεκρημενη κλαση αναπαρηστα την οθονη που επιλεγει ο χρηστης
	//σε ποιο τυπο λυκειου ανηκει,ωστε να του εμφανιστουν οι καταλληλες επιλογες
	
	private JButton button1 = new JButton("ΓΕΛ");
	private JButton button2 = new JButton("ΕΠΑΛ");
	private JLabel prompt = new JLabel("Επιλεξε τυπο λυκειου");
	private String type;
	protected Toolkit toolkit =Toolkit.getDefaultToolkit();
	protected double width = toolkit.getScreenSize().getWidth();
	protected double height = toolkit.getScreenSize().getHeight();
	
	public TypeSelectScreen() {
		super();
		frame.setSize((int)width,(int)height);
		ButtonListener listener=new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		button1.setBounds(720,120,100,25);
		button1.setFocusable(false);
		button2.setBounds(720,170,100,25);
		button2.setFocusable(false);
		
		prompt.setBounds(670,30,300,50);
		prompt.setFont(font2);
		
		panel.add(logo);
		panel.add(prompt);
		panel.add(button1);
		panel.add(button2);
		panel.setLayout(new BorderLayout());
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button1)
			{
				Student s=new Student();
				s.setSchoolType("gel");
				frame.dispose();
				ChooseFieldScreen chooseField=new ChooseFieldScreen(s);
			}
			else if(e.getSource()==button2)
			{
				Student s=new Student();
				s.setSchoolType("epal");
				frame.dispose();
				ChooseFieldScreen chooseField=new ChooseFieldScreen(s);
			}
		}
	}

}