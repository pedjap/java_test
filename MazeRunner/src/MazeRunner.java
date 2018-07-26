import java.util.*;
import java.lang.*;


public class MazeRunner{
	
	static String textInput = new String();
	static String inputPit = new String();
	static Scanner consoleInput = new Scanner(System.in);
	static int moves = 0;

	static Maze myMap = new Maze();

	public static void main(String[] args){
		
		
		System.out.println("Welcome to MaZe RuNnEr!\nHere is your current position:");	
		myMap.printMap();

		while(true){	
			// check to see if user typed correct letters, reapeat until he do
			while(true){
				if(textInput.equals("R") || textInput.equals("L") || textInput.equals("D") || textInput.equals("U")){
					break;
				}else{
					System.out.print("Where would you like to move?(R, L, U, D)");
					// get user input
					textInput = consoleInput.next();
					// if not uppercase converts it ot uppercase
					textInput = textInput.toUpperCase();
				}
			}

			// loop to check if you can move to new position and move if possible
			switch(textInput){
				case "R":{
					if(myMap.isThereAPit("R")){
						navigatePit();
						moves++;
					}else if(myMap.canIMoveRight()){
						System.out.println("You moved Right");
						myMap.moveRight();
						moves++;
					}else{
						System.out.println("Sorry, you've hit a wall.");
					}
					break;
				}
				case "L":{
					if(myMap.isThereAPit("L")){
						navigatePit();
						moves++;
					}else if(myMap.canIMoveLeft()){
						System.out.println("You moved Left");
						myMap.moveLeft();
						moves++;
					}else{
						System.out.println("Sorry, you've hit a wall.");
					}
					break;
				}
				case "D":{
					if(myMap.isThereAPit("D")){
						navigatePit();
						moves++;
					}else if(myMap.canIMoveDown()){
						System.out.println("You moved Down");
						myMap.moveDown();
						moves++;
					}else{
						System.out.println("Sorry, you've hit a wall.");
					}
					break;
				}
				case "U":{
					if(myMap.isThereAPit("U")){
						navigatePit();
						moves++;
					}else if(myMap.canIMoveUp()){
						System.out.println("You moved Up");
						myMap.moveUp();
						moves++;
					}else{
						System.out.println("Sorry, you've hit a wall.");
					}
					break;
				}
				default:{
					break;
				}
					
			}

			myMap.printMap();

			// check how many moves are left for player to esacape the maze
			if(moves == 50){
				System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes!");
			}else if(moves == 75){
				System.out.println("Alert! You have made 75 moves, you only have 25 move left to escape");
			}else if(moves == 90){
				System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
			}else if(moves == 100){
				System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
				System.out.println("Sorry, but you didn't escape in time- you lose!");
				break;
			}

			// reset textInput so we dont get infinite loop
			textInput = " ";
			// check if player wins
			if(myMap.didIWin()){
				System.out.println("Congratulations, you made it out alive!");
				System.out.println("and you did it in " + moves + " moves!");
				break;
			}

		}
			
			// close input stream
			consoleInput.close();
	}

	// navigation method for jumping over pits
	public static void navigatePit(){
		System.out.print("Watch out! There is a pit ahead, jump it?");
		inputPit = consoleInput.next();
		inputPit = inputPit.toUpperCase();
		
		if(inputPit.equals("Y")){
			myMap.jumpOverPit(textInput);
		}
	}
}

/* Author: Predrag Petkovic */