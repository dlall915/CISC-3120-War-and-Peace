public class Card {
	protected Suit cardSuit;	//private values aren't inherited
	protected Value cardValue;
	
	Card() {	}
	
	Card(Suit s, Value v) {
		cardSuit = s;
		cardValue = v;
	}
	
	Card(Value v, Suit s) {
		this(s, v);
	}
	
	public String toString() {
		return (cardValue + " of " + cardSuit);
	}
	
	public Boolean winner(Card opponent) {						//Boolean wrapper to return null
		int compareValue = compareValues(this, opponent);		//compareTo returns the difference, (this - opponent)
		
		if (compareValue > 0) return true;
		
		else if (compareValue < 0) return false;
		
		else return null;
	}
	
	protected static int compareValues (Card c1, Card c2) {
		if (c1.cardValue.compareTo(c2.cardValue) > 0) return 1;
		else if (c1.cardValue.compareTo(c2.cardValue) < 0) return -1;
		return (compareSuits(c1, c2));
	}
	
	protected static int compareSuits (Card c1, Card c2) {
		if (c1.cardSuit.compareTo(c2.cardSuit) > 0) return 1;
		else if (c1.cardSuit.compareTo(c2.cardSuit) < 0) return -1;
		return 0;
	}
}