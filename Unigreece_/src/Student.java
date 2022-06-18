import java.util.ArrayList;

public class Student {
	//Η συγκεκρημενη κλαση αναπαρηστα εναν μαθητη.
	
	private String schoolType;
	private String field;
	private ArrayList<Course> courses;
	private ArrayList<Double> scores=new ArrayList<Double>();
	
	public Student()
	{
		courses=new ArrayList<Course>();
	}
	
	public String getSchoolType()
	{
		return schoolType;
	}
	
	public void setSchoolType(String type)
	{
		this.schoolType=type;
	}
	
	public String getField()
	{
		return field;
	}
	
	public void setField(String field)
	{
		this.field=field;
	}
	
	public Course getCourse(int index)
	{
		return courses.get(index);
	}
	
	public void addCourse(Course c)
	{
		courses.add(c);
	}
	
	public void addScore(double s)
	{
		scores.add(s);
	}
	
	public double calculateAverageScore(double s1,double s2,double s3,double s4)
	{
		double sum=0.0;
		double gin1=0.0;
		double gin2=0.0;
		double sumGin=0.0;
		double finalSum=0.0;
		sum=s1+s2+s3+s4;
		sum*=2;
		gin1=s1*getCourse(0).getSynt();
		gin2=s2*getCourse(1).getSynt();
		sumGin=gin1+gin2;
		finalSum=sum+sumGin;
		finalSum*=100;
		return finalSum;
		
	}

}
