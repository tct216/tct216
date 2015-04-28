
public class DayDriver
{
	
	
	
	public static void main (String [] args)
	{
		Day day = new Day("Monday");
		System.out.println("Current Day; " + day);
		System.out.println("Next day: " + day.nextDay());
		System.out.println("Previous day: " + day.previousDay());
		System.out.println("Next 4 days: " + day.calculateDay(4));
	
	}

}
