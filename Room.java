package fixtures;

public class Room extends Fixture {

	Room[] getExits;
	
	private Room[] exits = new Room[5];
	
	public Room(String name, String shortDescrip, String longDescrip) {
		super(name, shortDescrip, longDescrip);
		this.exits = new Room[5];
	}
	
	public void setExits(Room exits, int index) {
		this.exits[index] = exits;
	}
	
	public Room getExits(String direction) {
		int index = 0;
		direction = direction.toUpperCase();
		switch(direction) {
		case "NORTH":
			index = 0;
			break;
		case "SOUTH":
			index = 1;
			break;
		case "EAST":
			index = 2;
			break;
		case "WEST":
			index = 3;
			break;
		default:
			System.out.println("Please enter a valid option.");
			break;
		}
		return this.exits[index];
	}
	}