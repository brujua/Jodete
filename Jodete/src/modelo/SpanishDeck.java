package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpanishDeck {
	
	private static final int POS_DECK_TOP = 0;
	
	private ArrayList<Carta> mazo;
	
	public SpanishDeck(){
		mazo = new ArrayList<>();
		for(Palo palo:Palo.values()){
			for(int i=1;i<=12;i++){
				mazo.add(new Carta(i, palo));
			}
		}
		mezclar();
	}
	
	public void reInit(Carta[] newDeck){
		if(newDeck == null|| newDeck.length==0)
			throw new NullPointerException();
		mazo = new ArrayList<Carta>(Arrays.asList(newDeck));
	}
	
	public void mezclar(){
		Collections.shuffle(mazo);
	}
	public boolean isEmpty(){
		return mazo.isEmpty();
	}
	
	
	public Carta dealCard () throws EmptyDeckException{
		if(isEmpty())
			throw new EmptyDeckException();
		return mazo.remove(POS_DECK_TOP).copy();
	}
	
	public int cardsLeft(){
		return mazo.size();
	}
	

	@Override
	public String toString(){
		StringBuilder strB = new StringBuilder();
		for(Carta carta:mazo){
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
