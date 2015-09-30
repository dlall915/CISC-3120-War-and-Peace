class PeaceCard extends Card {	
	PeaceCard() {	}
	
	PeaceCard(Suit s, Value v) {
		cardSuit = s;
		cardValue = v;
	}
	
	public Boolean winner(PeaceCard opponent) {
		int compareValue = compareValues(this, opponent);		//compareTo returns the difference, (this - opponent)
		
		if (compareValue < 0) return true;
		
		else if (compareValue > 0) return false;
		
		else return null;
	}
}