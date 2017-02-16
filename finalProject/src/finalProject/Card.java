package finalProject;

import java.util.ArrayList;

public class Card
{
	public String player;
	private String rank;
	private int value;
	private String suit;
	static ArrayList <Card> cardDeck = new <Card>ArrayList();
	public Card(String r, int v, String s)
{
	rank=r;
	value=v;
	suit=s;
}

public static void generateCards()
{
	addHearts();
	addClubs();	
}
	public static void addHearts()
	{
	cardDeck.add(new Card ("  Two  ", 2, "Hearts"));
	cardDeck.add(new Card (" Three ",3 , "Hearts"));
	cardDeck.add(new Card ("  Four ", 4, "Hearts"));
	cardDeck.add(new Card ("  Five ", 5, "Hearts"));
	cardDeck.add(new Card ("  Six  ", 6, "Hearts"));
	cardDeck.add(new Card (" Seven ", 7, "Hearts"));
	cardDeck.add(new Card (" Eight ", 8, "Hearts"));
	cardDeck.add(new Card (" Nine  ", 9, "Hearts"));
	cardDeck.add(new Card ("  Ten  ", 10, "Hearts"));
	cardDeck.add(new Card ("  Jack ", 11, "Hearts"));
	cardDeck.add(new Card ("  Queen", 12, "Hearts"));
	cardDeck.add(new Card ("  King ", 13, "Hearts"));
	}

public static void addClubs()
	{
	cardDeck.add(new Card (" Two   ", 2, "Clubs"));
	cardDeck.add(new Card (" Three ",3 , "Clubs"));
	cardDeck.add(new Card (" Four  ", 4, "Clubs"));
	cardDeck.add(new Card (" Five  ", 5, "Clubs"));
	cardDeck.add(new Card (" Six   ", 6, "Clubs"));
	cardDeck.add(new Card (" Seven ", 7, "Clubs"));
	cardDeck.add(new Card (" Eight ", 8, "Clubs"));
	cardDeck.add(new Card (" Nine  ", 9, "Clubs"));
	cardDeck.add(new Card (" Ten   ", 10,"Clubs"));
	cardDeck.add(new Card (" Jack  ", 11, "Clubs"));
	cardDeck.add(new Card (" Queen ", 12, "Clubs"));
	cardDeck.add(new Card (" King  ", 13, "Clubs"));
}


	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public static ArrayList<Card> getCardDeck() {
		return cardDeck;
	}

	public static void setCardDeck(ArrayList<Card> cardDeck) {
		Card.cardDeck = cardDeck;
	}
	
}
