/**
 * 
 * @author GotchaMan
 * Date : 4/1/15
 * Driver / test to create rooms with windows and walls with colors and floors
 */

public class RoomTest
{

	public static void main(String[] args) 
	{
		Room myRoom = new Room();
		
		Room yourRoom = new Room();
		yourRoom.setWallColor("Purple");
		yourRoom.setWindows(0);
		yourRoom.setFloors("tiles");
		
		Room ourRoom = new Room( "White", 3 , "Carpet");
		
		System.out.println(myRoom );
		System.out.println("\n");
		System.out.println(yourRoom );
		System.out.println("\n");
		System.out.println(ourRoom );
		
	}// end main
}// end class
