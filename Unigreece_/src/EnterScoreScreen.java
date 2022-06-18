import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EnterScoreScreen extends Gui{
	//Η συγκεκρημενη κλαση αναπαρηστα την οθονη που ο χρηστης εισαγει τους βαθμους του
	//και γινεται ο υπολογισμος των μοριων.
	
	private JTextField textfield1=new JTextField();
	private JTextField textfield2=new JTextField();
	private JTextField textfield3=new JTextField();
	private JTextField textfield4=new JTextField();
	private JLabel prompt=new JLabel("Εισαγετε τους βαθμους σας");
	private JLabel lesson1=new JLabel("Μαθημα 1ο");
	private JLabel lesson2=new JLabel("Μαθημα 2ο");
	private JLabel lesson3=new JLabel("Μαθημα 3ο");
	private JLabel lesson4=new JLabel("Μαθημα 4ο");
	private JButton button=new JButton("Calculate");
	private Student student=new Student();
	protected Toolkit toolkit =Toolkit.getDefaultToolkit();
	protected double width = toolkit.getScreenSize().getWidth();
	protected double height = toolkit.getScreenSize().getHeight();
	
	public EnterScoreScreen(Student s)
	{
		frame.setSize((int)width,(int)height);
		if(s.getSchoolType()=="gel")
		{
			student.setSchoolType("gel");
			if(s.getField()=="thewitikh")
			{
				student.setField("thewitikh");
				student.addCourse(new Course("Αρχαια",0.0,1.3));
				student.addCourse(new Course("Ιστορία",0.0,0.7));
				student.addCourse(new Course("Λατινικά",0.0,0.0));
				student.addCourse(new Course("Εκθεση",0.0,0.0));
				lesson1.setText("Αρχαία");
				lesson2.setText("Ιστορία");
				lesson3.setText("Λατινικά");
				lesson4.setText("Εκθεση");
			}
			if(s.getField()=="thetikh")
			{
				student.setField("thetikh");
				student.addCourse(new Course("Μαθηματικά",0.0,1.3));
				student.addCourse(new Course("Φυσική",0.0,0.7));
				student.addCourse(new Course("Χημεία",0.0,0.0));
				student.addCourse(new Course("Εκθεση",0.0,0.0));
				lesson1.setText("Μαθηματικά");
				lesson2.setText("Φυσική");
				lesson3.setText("Χημεία");
				lesson4.setText("Εκθεση");
			}
			if(s.getField()=="ygeias")
			{
				student.setField("ygeias");
				student.addCourse(new Course("Φυσική",0.0,1.3));
				student.addCourse(new Course("Βιολογια",0.0,0.7));
				student.addCourse(new Course("Χημεια",0.0,0.0));
				student.addCourse(new Course("Εκθεση",0.0,0.0));
				lesson1.setText("Φυσική");
				lesson2.setText("Βιολογία");
				lesson3.setText("Χημεία");
				lesson4.setText("Εκθεση");
			}
			if(s.getField()=="oikonomika")
			{
				student.setField("oikonomika");
				student.addCourse(new Course("Μαθηματικά",0.0,1.3));
				student.addCourse(new Course("ΑΟΘ",0.0,0.7));
				student.addCourse(new Course("ΑΕΠΠ",0.0,0.0));
				student.addCourse(new Course("Εκθεση",0.0,0.0));
				lesson1.setText("Μαθηματικά");
				lesson2.setText("ΑΟΘ");
				lesson3.setText("ΑΕΠΠ");
				lesson4.setText("Εκθεση");
			}
		}
		//Να κανω για το επαλ
		/*else if(s.getSchoolType()=="epal")
		{
			if(s.getField()=="Γεωπονίας, Τροφίμων και Περιβάλλοντος")
			{
				student.setField("Γεωπονίας, Τροφίμων και Περιβάλλοντος");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Διοίκησης και Οικονομίας")
			{
				student.setField("Διοίκησης και Οικονομίας");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Δομικών Έργων, Δομημένου Περιβάλλοντος και Αρχιτεκτονικού Σχεδιασμού")
			{
				student.setField("Δομικών Έργων, Δομημένου Περιβάλλοντος και Αρχιτεκτονικού Σχεδιασμού");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Εφαρμοσμένων Τεχνών")
			{
				student.setField("Εφαρμοσμένων Τεχνών");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",tegetText(),0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Ηλεκτρολογίας, Ηλεκτρονικής και Αυτοματισμού")
			{
				student.setField("Ηλεκτρολογίας, Ηλεκτρονικής και Αυτοματισμού");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",1.3));
				student.addCourse(new Course("Νέα Ελληνικά",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.0));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Μηχανολογίας")
			{
				student.setField("Μηχανολογίας");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Ναυτιλιακών Επαγγελμάτων")
			{
				student.setField("Ναυτιλιακών Επαγγελμάτων");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Πληροφορικής")
			{
				student.setField("Πληροφορικής");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			if(s.getField()=="Υγείας - Πρόνοιας - Ευεξίας")
			{
				student.setField("Υγείας - Πρόνοιας - Ευεξίας");
				student.addCourse(new Course("Μαθηματικά (Άλγεβρα)",0.0));
				student.addCourse(new Course("Νέα Ελληνικά",1.3));
				student.addCourse(new Course("Μάθημα Ειδικότητας 1",0.7));
				student.addCourse(new Course("Μάθημα Ειδικότητας 2",0.0));
				lesson1.setText("Μαθηματικά (Άλγεβρα)");
				lesson2.setText("Νέα Ελληνικά");
				lesson3.setText("Μάθημα Ειδικότητας 1");
				lesson4.setText("Μάθημα Ειδικότητας 2");
			}
			
		}*/
		prompt.setBounds(650,30,300,50);
		prompt.setFont(font2);
		
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
		button.setBounds(720,370,100,25);
		button.setFocusable(false);
		
		lesson1.setBounds(590,150,75,25);
		lesson2.setBounds(590,200,75,25);
		lesson3.setBounds(590,250,75,25);
		lesson4.setBounds(590,300,75,25);
		
		textfield1.setBounds(680,150,200,25);
		textfield2.setBounds(680,200,200,25);
		textfield3.setBounds(680,250,200,25);
		textfield4.setBounds(680,300,200,25);
		
		panel.add(prompt);
		panel.add(button);
		panel.add(lesson1);
		panel.add(lesson2);
		panel.add(lesson3);
		panel.add(lesson4);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(textfield3);
		panel.add(textfield4);
		panel.setLayout(null);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button)
			{
				double s1=Double.parseDouble(textfield1.getText());
				double s2=Double.parseDouble(textfield2.getText());
				double s3=Double.parseDouble(textfield3.getText());
				double s4=Double.parseDouble(textfield4.getText());
				
				double avg=student.calculateAverageScore(s1,s2,s3,s4);

				
				frame.dispose();
				PrintUniversityScreen printUni=new PrintUniversityScreen(avg,student);
			}
			
		}
		
	}

}
