
public class Student
{
	//Obejct variables
	private String name;
	private int age;
	private boolean isFemale;
	private int datamatikerTeam;

	
	//Constructor
	public Student(String tmpName, int tmpAge, boolean tmpIsFemale, int tmpDatamatikerTeam)
	{
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
		this.datamatikerTeam = tmpDatamatikerTeam;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public boolean getGender()
	{
		return this.isFemale;
	}
	public int getDatamatikerteam()
	{
		return this.datamatikerTeam;
	}
}