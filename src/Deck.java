import java.util.Random;

public class Deck {
	private Card[] cards = new Card[52]; 	//only allocates memory, not initialized
	int numCards = 52;
	
	Deck() {
		int y = 0;
		for (Suit suit : Suit.values())
			for (Value value : Value.values()) {
				cards[y] = new Card(suit, value);
				y++;
			}
	}
	
	public Card draw() {
		if (numCards > 0) {
			Random random = new Random();
			int randomNum;
		
			randomNum = random.nextInt(52);
			if (cards[randomNum] != null)
			{
				Card tempCard = cards[randomNum];
				cards[randomNum] = null;
				numCards--;
				return tempCard;
			}
			
			return draw();
		}
		
		return null;
	}
}