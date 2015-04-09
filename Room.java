/**
 * 
 * @author GotchaMan
 * Date : 4/1/15
 * Assignment 4 to create rooms with windows and walls with colors and floors
 */

public class Room 
{
	
	// data members and default
	
	private String color = "yellow";
	private String floor = "hardwood";
	private int windows = 1;
	
	
	
	// constructors
	
	public Room()
	{
		
	}
	
	public Room (String theWallColor, int theWindow)
	{
		this.color = theWallColor;
		this.windows = theWindow;
	}
	
	public Room(int theWindows)
	{
		this.windows = theWindows;
	}
	
	public Room(String the_Color)
	{
		this.color = the_Color;
	}

	
	public Room(String wallColor, int theWindows, String theFloors)
	{
		this.color =wallColor;
		this.windows = theWindows;
		this.floor = theFloors;
	}

	
	
	// methods
	public void setWallColor(String theColor)
	{
		this.color = theColor;
	}
	
	public String getColor ()
	{
		return this.color;
	}
	
	public void setWindows (int numWindows)
	{
		this.windows = numWindows;
	}
	
	public int getWindows ()
	{
	return this.windows;	
	}
	
	public void setFloors (String theFloor)
	{
		this.floor = theFloor;
	}
	
	public String getFloors()
	{
		return this.floor;
	}
	public String toString()
	{
		String description = "The wall colors are :" + this.color +  "\nNumber of windows : " + windows +"\nThe floor type is : " + floor ;
		return description;
	}

}//end class
        
 

	