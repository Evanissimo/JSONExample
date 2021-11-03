package JsonTime;

public class King {

	String Name;
	String Country;
	String House;
	String Reign;
	
	public King(String Name, String Country, String House, String reign) {
		this.Name= Name;
		this.Country = Country;
		this.House = House;
		this.Reign = reign;
	}
	public String toString()
	{
		return String.format(Name + " " +Country+" " + House+" " +Reign);
	}
}
