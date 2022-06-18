
public class Course {
	//Η συγκεκρημενη κλαση αναπαρηστα ενα μαθημα
	
	private String name;
	private double synt;
	private double score;
	
	public Course(String name,double score,double synt)
	{
		this.name=name;
		this.synt=synt;
		this.score=score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setScore(double s)
	{
		this.score=s;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public double getSynt()
	{
		return synt;
	}

}
