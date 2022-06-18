import java.awt.Toolkit;

import javax.swing.JLabel;

public class PrintUniversityScreen extends Gui{
	//Η συγκεκρημενη κλαση αναπαρηστα την οθονη στην οποια εμφανιζονται τα αποτελεσματα
	//με βαση τα μορια που εισηγαγε ο χρηστης.Επισης στην οθονη αυτη γινεται η αναζητηση
	//στα εξωτερικα αρχεια που ειναι αποθηκευμενες οι σχολες με τα μορια.
	
	private JLabel prompt=new JLabel("Αποτελεσματα");
	protected Toolkit toolkit =Toolkit.getDefaultToolkit();
	protected double width = toolkit.getScreenSize().getWidth();
	protected double height = toolkit.getScreenSize().getHeight();
	
	public PrintUniversityScreen(double avg,Student s)
	{
		frame.setSize((int)width,(int)height);
		prompt.setBounds(705,30,200,50);
		prompt.setFont(font2);
		
		panel.add(prompt);
		panel.setLayout(null);
		panel.add(logo);
	}

}
