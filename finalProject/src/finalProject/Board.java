package finalProject;

import java.util.Collections;

public class Board 
{
	static Card [][]board = new Card [6][4];
	
	public static int column;
	{
	printBoard();
	}
	public static void printBoard()
	{
		Collections.shuffle(Card.cardDeck);
		System.out.println("You have ten seconds to find two cards with the same values, and their coordinates. Okay, here are the cards:");
		
		System.out.println("	A			B			C			D");
		
		for (Card v:Card.cardDeck);
	
		{
		for(int i =0;i<6;i++)
		{
			for(int j =0;j<4;j++)
			{
				board [i] [j] = Card.cardDeck.get(0);
				Card.cardDeck.remove(0);
			}
		}
		for(int i =0;i<6;i++)
		{
			for(int j =0;j<4;j++)
			{
				System.out.print(board[i] [j].getRank()+" of "+board[i] [j].getSuit()+"\t");
			}
			System.out.println();
		}
		}
		
		{
			try {
				  Thread.sleep(10000);
				} catch (InterruptedException ie) {
		}
	}
}
}
