import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EnterScoreScreen extends Gui{
	//� ������������ ����� ���������� ��� ����� ��� � ������� ������� ���� ������� ���
	//��� ������� � ����������� ��� ������.
	
	private JTextField textfield1=new JTextField();
	private JTextField textfield2=new JTextField();
	private JTextField textfield3=new JTextField();
	private JTextField textfield4=new JTextField();
	private JLabel prompt=new JLabel("�������� ���� ������� ���");
	private JLabel lesson1=new JLabel("������ 1�");
	private JLabel lesson2=new JLabel("������ 2�");
	private JLabel lesson3=new JLabel("������ 3�");
	private JLabel lesson4=new JLabel("������ 4�");
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
				student.addCourse(new Course("������",0.0,1.3));
				student.addCourse(new Course("�������",0.0,0.7));
				student.addCourse(new Course("��������",0.0,0.0));
				student.addCourse(new Course("������",0.0,0.0));
				lesson1.setText("������");
				lesson2.setText("�������");
				lesson3.setText("��������");
				lesson4.setText("������");
			}
			if(s.getField()=="thetikh")
			{
				student.setField("thetikh");
				student.addCourse(new Course("����������",0.0,1.3));
				student.addCourse(new Course("������",0.0,0.7));
				student.addCourse(new Course("������",0.0,0.0));
				student.addCourse(new Course("������",0.0,0.0));
				lesson1.setText("����������");
				lesson2.setText("������");
				lesson3.setText("������");
				lesson4.setText("������");
			}
			if(s.getField()=="ygeias")
			{
				student.setField("ygeias");
				student.addCourse(new Course("������",0.0,1.3));
				student.addCourse(new Course("��������",0.0,0.7));
				student.addCourse(new Course("������",0.0,0.0));
				student.addCourse(new Course("������",0.0,0.0));
				lesson1.setText("������");
				lesson2.setText("��������");
				lesson3.setText("������");
				lesson4.setText("������");
			}
			if(s.getField()=="oikonomika")
			{
				student.setField("oikonomika");
				student.addCourse(new Course("����������",0.0,1.3));
				student.addCourse(new Course("���",0.0,0.7));
				student.addCourse(new Course("����",0.0,0.0));
				student.addCourse(new Course("������",0.0,0.0));
				lesson1.setText("����������");
				lesson2.setText("���");
				lesson3.setText("����");
				lesson4.setText("������");
			}
		}
		//�� ���� ��� �� ����
		/*else if(s.getSchoolType()=="epal")
		{
			if(s.getField()=="���������, �������� ��� �������������")
			{
				student.setField("���������, �������� ��� �������������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="��������� ��� ����������")
			{
				student.setField("��������� ��� ����������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="������� �����, ��������� ������������� ��� �������������� ����������")
			{
				student.setField("������� �����, ��������� ������������� ��� �������������� ����������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="������������ ������")
			{
				student.setField("������������ ������");
				student.addCourse(new Course("���������� (�������)",tegetText(),0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="�������������, ������������ ��� ������������")
			{
				student.setField("�������������, ������������ ��� ������������");
				student.addCourse(new Course("���������� (�������)",1.3));
				student.addCourse(new Course("��� ��������",0.7));
				student.addCourse(new Course("������ ����������� 1",0.0));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="������������")
			{
				student.setField("������������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="����������� ������������")
			{
				student.setField("����������� ������������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="������������")
			{
				student.setField("������������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
			}
			if(s.getField()=="������ - �������� - �������")
			{
				student.setField("������ - �������� - �������");
				student.addCourse(new Course("���������� (�������)",0.0));
				student.addCourse(new Course("��� ��������",1.3));
				student.addCourse(new Course("������ ����������� 1",0.7));
				student.addCourse(new Course("������ ����������� 2",0.0));
				lesson1.setText("���������� (�������)");
				lesson2.setText("��� ��������");
				lesson3.setText("������ ����������� 1");
				lesson4.setText("������ ����������� 2");
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
