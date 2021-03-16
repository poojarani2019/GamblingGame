//NAME : POOJA RANI
//STUDENTID : 201907510
//GAMBLING GAME

package GambleGame;

import java.util.ArrayList;
import java.util.Scanner;

class MainApplication {

	public static void main(String[] args) {
		String userResponse;
		ArrayList<String> summaryData = new ArrayList<String>();
		Game game = new Game();   //game object declared which manages interaction and gathers player infor 
		Casino casino = new Casino();   // casino object declared
		
		System.out.print("Hello new user,Do you want to play the game   ");
		Scanner scanner = new Scanner(System.in);   // scanner object declared
		userResponse = scanner.nextLine();
		
		
	//condition to start the game
		if(userResponse.toLowerCase().equals("yes")) {
		
			Player player = game.getPlayerInfo();	//player object  declared and initialised
			
			for(int x= 1; x<=5; x++) {
			System.out.print("\n"+ "Round " + x);
			String winner = casino.PlayGame(player);	//player object with player info passed to casino class
			summaryData.add(winner);					// value added to array list for final sumary
			System.out.print("\n"+ winner+" wins ");	}
			
			
		}
		else
		{
			
			System.out.print("Have a Great Day");	
		}
			

		System.out.print("\n"+ "Thanks for playing Your performance summary is");
		for(int x= 0; x<5; x++) {
	
			System.out.print("\n"+ "Round "+x + " " +summaryData.get(x)+" wins ");
		
	}
	
	}
}
