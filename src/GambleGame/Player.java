package GambleGame;

public class Player {
	
	private String name;   //declared private and is encapsulated
	private int age;		//declared private and is encapsulated
	
	
	 //getters and setters declared for name and age
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public void setAge(int age)
	{
		this.age = age;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	public int getAge()
	{
		return age;
		
	}
	
	

}
