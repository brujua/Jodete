package modelo;

import java.util.ArrayList;

public class Game {
	private static final int MAX_CARDS_CEM = 40;
	private static final int MAX_PLAYERS = 6;
	private static final String MSJ_ERR_MAX_PLAYERS = "Se ha alcanzado la máxima cantidad de jugadores";
	
	
	private SpanishDeck deck;
	private JodCardCementery cardCementery;
	private Card facedCard;
	private ArrayList<Player> players;
	private int jugadorEnTurno; 
	
	public Game(){
		super();
		deck = new SpanishDeck();
		cardCementery = new JodCardCementery(MAX_CARDS_CEM);
		players = new ArrayList<>(MAX_PLAYERS);
		
	}
	
	public void addPlayer(Player player) throws MaxPlayersException{
		if(players.size()>= MAX_PLAYERS)
			throw new MaxPlayersException(MSJ_ERR_MAX_PLAYERS);
		players.add(player);
	}
	
	
	public static void main(String[] args) {
		System.out.println("PRUEBA 2");

	}


}
