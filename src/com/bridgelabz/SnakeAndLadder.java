package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - Player rolls a dice to and checks whether option is no-play, ladder or snake 
 */
public class SnakeAndLadder {
	public static void main(String[] args) {
		int Player_Position = 0;
		int ladder = 1;
		int snake = 2;
		int noPlay = 3;
		System.out.println("Welcome to the Snake and Ladder Game");
		/**
		 * Using Math.random() function to generate random between 1 to 6
		 */
		int Dice = (int) (Math.random() * 6 + 1);
		System.out.println("The Player's Position after rolling the die is : " + Dice);

		/**
		 * Using Math.random() function to generate random between 1 to 3 for user to get options
		 */
		int playerCheck = (int) Math.floor(Math.random() * 3 + 1);

		switch (playerCheck) {
		case 1:
			Player_Position = Player_Position + Dice;
			System.out.println("The player position is :" + Player_Position);
			break;
		case 2:
			Player_Position = Player_Position - Dice;
			System.out.println("The player position is :" + Player_Position);
			break;
		case 3:
			Player_Position = 0;
			System.out.println("There is no play and the player position is :" + Player_Position);
		}
	}
}