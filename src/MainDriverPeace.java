class MainDriverPeace {
	public static void main (String[] args) {
		PeaceDeck deck1 = new PeaceDeck();
		PeaceDeck deck2 = new PeaceDeck();
		
		PeaceCard player1 = new PeaceCard();
		PeaceCard player2 = new PeaceCard();
		
		int playerOneWins = 0, playerTwoWins = 0;
		
		System.out.println("Peace\n");
		
		for (int i = 0; i < 52; i++) {
			player1 = deck1.draw();
			player2 = deck2.draw();
			if ((player1 == null) || (player2 == null)) {
				System.out.println("Out of cards.\n");
				break;
			}
			System.out.println(player1.toString() + " vs. " + player2.toString());
		
			if (player1.winner(player2) == null)
				System.out.println("Tie!\n");
			
			else if (player1.winner(player2) == true) {
				System.out.println("Player 1 wins!\n");
				playerOneWins++;
			}
			
			else {
				System.out.println("Player 2 wins!\n");
				playerTwoWins++;
			}
		}
		
		System.out.println("Player 1 wins: " + playerOneWins + "\n");
		System.out.println("Player 2 wins: " + playerTwoWins);
	}
}