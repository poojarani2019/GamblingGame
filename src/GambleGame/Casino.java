package GambleGame;

import java.util.Random;
import java.util.Scanner;

public class Casino {
	
	int playerInput;
	int computerInput;
	Random rand = new Random();  // random number generator
	Player player = new Player();

	public String PlayGame(Player player){
			this.player= player;			// player object initialised 
			playerInput = promptUserForTheirGuess();	// function which returns player input as integer value
			computerInput = computerValue(playerInput);  // function the returns computer value
			System.out.print("\nComputer number is  " + computerInput);
			return determineWinner();   // function that determines winner
			
	}
	
	private String determineWinner() {
		//checks if the difference between player input and computer input is less than equal to 10
		if(Math.abs(playerInput - computerInput)<=10)
			return player.getName();   //if true returns player name as winer
		
		else return "computer";      //if not true returns computer as winnner name
	}

	private int promptUserForTheirGuess() {
		System.out.print("\nPlease enter your guess  ");
		Scanner scanner = new Scanner(System.in);
		int userResponse;
			while (true) {	
				userResponse = Integer.parseInt(scanner.nextLine());
			//if input between 1 and 10 then break from loop else ask user to input value again
			if(userResponse>0 && userResponse<=100) {
			break;
			}
			
			else {
				System.out.print("please enter number between 1-100  ");
			}
			}
		
		System.out.print("Your guess is  "+ userResponse);
		return userResponse;
		
	}
			
			
	
	private int computerValue(int guessValue) {
		
		int computerInput;
		while (true) {	
			
			if(guessValue>=20 && guessValue<=100) {
				//range defined as rand.nextInt((min-max))+min
				//since allowed range  = abs(10) computer input range = abs(20) gives 50% probility
				computerInput = rand.nextInt((guessValue+20)-(guessValue-20))+(guessValue-20);
			break;
			}
			
			else if(guessValue<20 && guessValue>0) {
				
				//min value is 1,lower range is equal to guess value and higher range is +20 over the input value 
				computerInput = rand.nextInt((guessValue+20))+1;
				break;
			}
						
		}
		return computerInput;
		
	}
	

}
