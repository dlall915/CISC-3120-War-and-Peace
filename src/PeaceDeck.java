import java.util.Random;

public class PeaceDeck extends Deck {
	private PeaceCard[] peaceCards = new PeaceCard[52];
	
	PeaceDeck() {
		int y = 0;
		for (Suit suit : Suit.values())
			for (Value value : Value.values()) {
				peaceCards[y] = new PeaceCard(suit, value);
				y++;
			}
	}
	
	public PeaceCard draw() {
		if (numCards > 0) {
			Random random = new Random();
			int randomNum;
		
			randomNum = random.nextInt(52);
			if (peaceCards[randomNum] != null)
			{
				PeaceCard tempCard = peaceCards[randomNum];
				peaceCards[randomNum] = null;
				numCards--;
				return tempCard;
			}
			
			return draw();		//infinite loop after 52 draws
		}
		
		return null;
	}
}