package modelo;

public class Game {
	private static final int MAX_CARDS_CEM = 40;
	private SpanishDeck deck;
	private JodCardCementery cardCementery;
	private Card facedCard;
	private Player[] players;
	
	public Game(){
		deck = new SpanishDeck();
		cardCementery = new JodCardCementery(MAX_CARDS_CEM);
	}
	
	public static void main(String[] args) {
		System.out.println("PRUEBA 1");

	}


}
