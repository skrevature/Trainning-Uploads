package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	private static RoomManager manager = new RoomManager(6);
	
	static boolean running = true;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to my home! Feel free to explore!"
				+ "\nTo travel enter \"Go\" followed by the direction you wish to proceed."
				+ "\nIf you wish to stop the tour, enter \"Quit\"");
		Player player = new Player();
		player.setCurrentRoom(manager.getStartingRoom());
		
		while(running) {
		manager.init();
		printRoom(player);
		String[] input = collectInput();
		parse(input, player);
		
		if (!running) {
			System.out.println("Thanks for visiting my home!");	
		}	
	}		
	}
	
	private static void printRoom(Player player) {
		player.setCurrentRoom(manager.getStartingRoom());
		System.out.println("\n---------- CURRENT ROOM ----------");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Description: " + player.getCurrentRoom().getShort());
		System.out.println("Long Description: " + player.getCurrentRoom().getLong());
		System.out.println("---------- OPTIONS ----------");
		System.out.println("North: The Dinning Room");
//		if(Rooms[0]) {
//			System.out.println("North:" + manager.getRooms());
//		}
//		else if (Rooms[1]) {
//			System.out.println("North:" + kitchen(name));
//			System.out.println("South:" + entryway(name));
//			System.out.println("East:" + living(name));
//			System.out.println("West:" + bed(name));
//		}
//		else if (Rooms[2]) {
//			System.out.println("South:" + dinning(name));
//		}
//		else if (Rooms[3]) {
//			System.out.println("West:" + dinning(name));
//		}
//		else if (Rooms[4]) {
//			System.out.println("North:" + bath(name))
//			System.out.println("East:" + dinning(name));
//		}
//		else if(Rooms[5]) {
//			System.out.println("South:" + bed(name));
//		}
	}
	
	private static String[] collectInput() {
		Scanner input = new Scanner(System.in);
		String direction = input.nextLine();
		String[] phrase = direction.split(" ");
		return phrase;	
	}

	private static void parse(String[] command, Player player) {
		String action = command[0].toUpperCase().intern();
		String direction = null;
	
		if (command.length >= 1) {
			direction = command[1].toUpperCase().intern();
		}
		if (action == "GO") {
			Room move = player.getCurrentRoom().getExits(direction);
			player.setCurrentRoom(move);
		}
		else if (action == "QUIT")
			running = false;
		}
	}	
