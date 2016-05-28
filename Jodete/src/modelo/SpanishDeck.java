package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpanishDeck {
	
private static final int POS_DECK_TOP = 0;
	
	private ArrayList<Card> deck;
	
	public SpanishDeck(){
		deck = new ArrayList<>();
		for(Palo palo:Palo.values()){
			for(int i=1;i<=12;i++){
				deck.add(new Card(i, palo));
			}
		}
		mezclar();
	}
	
	public void reInit(Card[] newDeck){
		if(newDeck == null|| newDeck.length==0)
			throw new NullPointerException();
		deck = new ArrayList<Card>(Arrays.asList(newDeck));
	}
	
	public void mezclar(){
		Collections.shuffle(deck);
	}
	public boolean isEmpty(){
		return deck.isEmpty();
	}
	
	
	public Card dealCard () throws EmptyDeckException{
		if(isEmpty())
			throw new EmptyDeckException();
		return deck.remove(POS_DECK_TOP).copy();
	}
	
	public int cardsLeft(){
		return deck.size();
	}
	

	@Override
	public String toString(){
		StringBuilder strB = new StringBuilder();
		for(Card carta:deck){
			strB.append(carta.toString()+System.getProperty("line.separator"));
		}
		return strB.toString();
	}
	
	/*public static void main(String[] args) {
		MazoCartasEspañol mazo = new MazoCartasEspañol();
		System.out.println("Hooola");
		System.out.println(mazo.toString());
		try {
			System.out.println(mazo.dealCard().toString());
		} catch (EmptyDeckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
