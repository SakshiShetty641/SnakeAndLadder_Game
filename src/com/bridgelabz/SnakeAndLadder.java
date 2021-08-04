package com.bridgelabz;
/**
 * @author Sakshi Shetty
 * Purpose - Player rolls a dice to get number between 1 to 6
 */
public class SnakeAndLadder {
	public static void main(String[] args) {
		int Player1 = 0;
		System.out.println("Welcome to the Snake and Ladder Game");
		/**
		 * Using Math.random() function to generate random between 1 to 6
		 */
		int Dice = (int) (Math.random() * 6 + 1);
		System.out.println("The Player's Position after rolling the die is : " + Dice);
	}
}
