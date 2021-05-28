package game;

import fixtures.Room;

public class RoomManager {
	
	private Room startingRoom;

	private Room[] rooms;
	
	public RoomManager (int roomCount) {
		super();
		rooms = new Room[roomCount];
		
	}

	//create the rooms and info inside the rooms as well as set the index each room is at
	public void init() {
		Room entryway = new Room("The Entryway","A small entryway", "The area as soon as you"
				+"enter my apartment is spacious and the various rooms are visible from where you are standing."
				+"\nIt appears to be the typical open floor plan that so many of these Millenials have grown to love."
				+" Directly in front of you is the Dinning Room.");
		this.rooms[0] = entryway;
		this.startingRoom = entryway;
	
		Room dinning  = new Room("The Dinning Room", "A small table to eat on.", "Lots of info...");
		this.rooms[1] = dinning;
		
		Room kitchen = new Room("The Kitchen", "A sink with some counterspace.", "Lots of info...");
		this.rooms[2] = kitchen;
		
		Room living = new Room("The Living Room", "Big ass TV with some couches.", "Lots of info...");
		this.rooms[3] = living;
		
		Room bed = new Room("The Bedroom", "Where the magic happens.","Lots of info...");
		this.rooms[4] = bed;
		
		Room bath = new Room("The Bathroom", "A sink, toilet and shower.","Lots of info...");
		this.rooms[5] = bath;
		
		//set the starting point and navigation through the rooms given the index in the Room class
		entryway.setExits(dinning, 0);
		
		dinning.setExits(kitchen, 0);
		dinning.setExits(entryway, 1);
		dinning.setExits(living, 2);
		dinning.setExits(bed, 3);
		
		kitchen.setExits(dinning, 1);
		
		living.setExits(dinning, 3);
		
		bed.setExits(dinning, 2);
		bed.setExits(bath, 0);
		
		bath.setExits(bed, 1);
		
	}
	
		public Room getStartingRoom() {
			return this.startingRoom;
		}
				
		public void setStartingRoom(Room startingRoom) {
			this.startingRoom = startingRoom;
		}
				
		public Room getRooms(int index) {
			return rooms[index];
		}
				
		public void setRooms(Room[] rooms) {
			this.rooms = rooms;
		}
}