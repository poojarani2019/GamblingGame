package GambleGame;

import java.util.Scanner;

public class Game {
	
	public Player getPlayerInfo() {
		
		String playerName;
		int playerAge;
		String userResponse;
		boolean isValid = false;
		
		Scanner scanner = new Scanner(System.in);
		Player player = new Player(); //player object declared 
		
		System.out.print("Please enter Player Name   ");
		userResponse = scanner.nextLine();  // scanner scans the input value
		System.out.print("Player name is : " + userResponse);
		player.setName(userResponse);  // player object sets player name using setName function
		while (true) {
			if(isValid) break;    // condition to break out of while loop 
			
			System.out.print("\nPlease enter Player age   ");
			userResponse = scanner.nextLine();
			
			try {
				player.setAge(Integer.parseInt(userResponse));  // player object sets player Age using setAge function
				System.out.print("Player age is : " + userResponse);
				isValid = true;
				System.out.print("\nAll set now please guess the number between 1 and 100");
				
				
			}
			
			catch(Exception e){
				
				System.out.print("Please Enter a valid age number");
			}
					
			
		}
		
		
		return player;   // player object returned 
		
	}
	

}
