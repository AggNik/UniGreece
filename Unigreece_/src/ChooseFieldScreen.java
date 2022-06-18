import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class ChooseFieldScreen extends Gui{
	//Η συγκεκρημενη κλαση αναπαρηστα την οθονη που επιλεγει ο χρηστης την κατευθυνση του
	
	private JButton gelButton1=new JButton("Θεωρητικη Κατευθυνση");
	private JButton gelButton2=new JButton("Θετικη Κατευθυνση");
	private JButton gelButton3=new JButton("Κατευθυνση Υγειας");
	private JButton gelButton4=new JButton("Οικονομικη Κατευθυνση");
	private JLabel prompt=new JLabel("Επιλεξε κατευθυνση");
	//
	private JButton epalButton1 = new JButton("Γεωπονίας, Τροφίμων και Περιβάλλοντος");
	private JButton epalButton2 = new JButton("Διοίκησης και Οικονομίας");
	private JButton epalButton3 = new JButton("Δομικών Έργων, Δομημένου Περιβάλλοντος και Αρχιτεκτονικού Σχεδιασμού");
	private JButton epalButton4 = new JButton("Εφαρμοσμένων Τεχνών");
	private JButton epalButton5 = new JButton("Ηλεκτρολογίας, Ηλεκτρονικής και Αυτοματισμού");
	private JButton epalButton6 = new JButton("Μηχανολογίας");
	private JButton epalButton7 = new JButton("Ναυτιλιακών Επαγγελμάτων");
	private JButton epalButton8 = new JButton("Πληροφορικής");
	private JButton epalButton9 = new JButton("Υγείας - Πρόνοιας - Ευεξίας");
	private Student student = new Student();
	protected Toolkit toolkit =Toolkit.getDefaultToolkit();
	protected double width = toolkit.getScreenSize().getWidth();
	protected double height = toolkit.getScreenSize().getHeight();
	
	public ChooseFieldScreen(Student s)
	{
		super();
		frame.setSize((int)width,(int)height);
		if(s.getSchoolType()=="gel")
		{
			student.setSchoolType("gel");
			ButtonListener listener = new ButtonListener();
			gelButton1.addActionListener(listener);
			gelButton2.addActionListener(listener);
			gelButton3.addActionListener(listener);
			gelButton4.addActionListener(listener);
			
			gelButton1.setBounds(667,150,200,25);
			gelButton1.setFocusable(false);
			gelButton2.setBounds(667,200,200,25);
			gelButton2.setFocusable(false);
			gelButton3.setBounds(667,250,200,25);
			gelButton3.setFocusable(false);
			gelButton4.setBounds(667,300,200,25);
			gelButton4.setFocusable(false);
			
			prompt.setBounds(675,30,200,50);
			prompt.setFont(font2);
			
			panel.add(logo);
			panel.add(prompt);
			panel.add(gelButton1);
			panel.add(gelButton2);
			panel.add(gelButton3);
			panel.add(gelButton4);
			panel.setLayout(null);
		}
		else if(s.getSchoolType()=="epal")
		{
			student.setSchoolType("epal");
			prompt.setBounds(675,30,200,50);
			prompt.setFont(font2);
			
			ButtonListener listener = new ButtonListener();
			epalButton1.addActionListener(listener);
			epalButton2.addActionListener(listener);
			epalButton3.addActionListener(listener);
			epalButton4.addActionListener(listener);
			epalButton5.addActionListener(listener);
			epalButton6.addActionListener(listener);
			epalButton7.addActionListener(listener);
			epalButton8.addActionListener(listener);
			epalButton9.addActionListener(listener);
		
			epalButton1.setBounds(50,100,400,50);
			epalButton1.setFocusable(false);
			epalButton2.setBounds(550,100,400,50);
			epalButton2.setFocusable(false);
			epalButton3.setBounds(1050,100,400,50);
			epalButton3.setFocusable(false);
	        epalButton4.setBounds(50,300,400,50);
			epalButton4.setFocusable(false);
			epalButton5.setBounds(550,300,400,50);
			epalButton5.setFocusable(false);
			epalButton6.setBounds(1050,300,400,50);
			epalButton6.setFocusable(false);
			epalButton7.setBounds(50,500,400,50);
			epalButton7.setFocusable(false);
			epalButton8.setBounds(550,500,400,50);
			epalButton8.setFocusable(false);
			epalButton9.setBounds(1050,500,400,50);
			epalButton9.setFocusable(false);
			
			panel.add(logo);
			panel.setLayout(null);
			panel.add(epalButton1);
			panel.add(epalButton2);
			panel.add(epalButton3);
			panel.add(epalButton4);
			panel.add(epalButton5);
			panel.add(epalButton6);
			panel.add(epalButton7);
			panel.add(epalButton8);
			panel.add(epalButton9);
			panel.add(prompt);
			
			
		}
		
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==gelButton1)
			{
				student.setField("thewitikh");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);
			}
			else if(e.getSource()==gelButton2)
			{
				student.setField("thetikh");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);
			}
			else if(e.getSource()==gelButton3)
			{
				student.setField("ygeias");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);
			}
			else if(e.getSource()==gelButton4)
			{
				student.setField("oikonomika");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);
			}
			//
			if(e.getSource()==epalButton1)
			{
				student.setField("Γεωπονίας, Τροφίμων και Περιβάλλοντος");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
			if(e.getSource()==epalButton2)
			{
				student.setField("Διοίκησης και Οικονομίας");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
			if(e.getSource()==epalButton3)
			{
				student.setField("Δομικών Έργων, Δομημένου Περιβάλλοντος και Αρχιτεκτονικού Σχεδιασμού");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
			if(e.getSource()==epalButton4)
			{
				student.setField("Εφαρμοσμένων Τεχνών");
				frame.dispose();
				EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
		    if(e.getSource()==epalButton5)
			{
		    	student.setField("Ηλεκτρολογίας, Ηλεκτρονικής και Αυτοματισμού");
		    	frame.dispose();
		    	EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
		    if(e.getSource()==epalButton6)
			{
		    	student.setField("Μηχανολογίας");
		    	frame.dispose();
		    	EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
		    if(e.getSource()==epalButton7)
			{
		    	student.setField("Ναυτιλιακών Επαγγελμάτων");
		    	frame.dispose();
		    	EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
		    if(e.getSource()==epalButton8)
			{
		    	student.setField("Πληροφορικής");
		    	frame.dispose();
		    	EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
		    if(e.getSource()==epalButton9)
			{
		    	student.setField("Υγείας - Πρόνοιας - Ευεξίας");
		    	frame.dispose();
		    	EnterScoreScreen enterScore = new EnterScoreScreen(student);

		    }
			
		}
		
	}

}