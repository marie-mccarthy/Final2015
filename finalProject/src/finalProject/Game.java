package finalProject;

import java.util.Scanner;

public class Game 
{
	static int row1;
	static int column1;
	static int row2;
	static int column2;

public static void runGame()
	{
	printGame();
	}
	public static void printGame()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Pick cards with the same value.(Enter the coordinates. Example:(A1))");
		for (Card v:Card.cardDeck);
		Scanner userInput1 = new Scanner(System.in);
		String firstCard= userInput1.nextLine();
		switch (firstCard.substring(0,1))
		{
			case "A":
			case "a":
			row1 = 0;
			break;
			case "B":
				case "b":
			row1 = 1;
			break;
			case "C": 
			case "c":
			row1 = 2;
			break;
			case "D": 
			case "d":		
			row1 = 3;
			break;
		}
		column1 = Integer.parseInt(firstCard.substring(1)) -1;
		
		Scanner userInput2 = new Scanner(System.in);
		String secondCard= userInput2.nextLine();
		switch (secondCard.substring(0,1))
		{
			case "A":
			case "a":
			row2 = 0;
			break;
			case "B":
			case "b":
			row2 = 1;
			break;
			case "C": 
			case "c":
			row2 = 2;
			break;
			case "D": 
			case "d":		
			row2 = 3;
			break;
		}
		column2 = Integer.parseInt(secondCard.substring(1)) -1;
		
		System.out.println(Board.board[row1][column1].getRank()+" of "+Board.board[row1][column1].getSuit()+", is your first card and "+Board.board[row2][column2].getRank()+" of "+Board.board[row2][column2].getSuit()+" is your second card.");
		
		if(Board.board[row1][column1].getValue()>Board.board[row2][column2].getValue())
		{
			System.out.println("You Loose.");
		}
		System.out.print("What is your fist name?");
		Scanner userInput = new Scanner(System.in);
		String first = userInput.nextLine();
		System.out.print("Hi "+first+".");
		
			System.out.println("You Loose.");
		
		
			{
			System.out.println("You Win!");
			}
	}
}
