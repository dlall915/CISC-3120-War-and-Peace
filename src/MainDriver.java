//9-17-14
//David Lall, Johnathan Adams

class MainDriver {
	public static void main (String[] args) {
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		
		Card player1 = new Card();
		Card player2 = new Card();
		
		int playerOneWins = 0, playerTwoWins = 0;
		
		System.out.println("War\n");
		
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