package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class MazoCartasEspañol {
	
	private static final int POS_DECK_TOP = 0;
	
	private ArrayList<Carta> mazo;
	
	public MazoCartasEspañol(){
		mazo = new ArrayList<>();
		for(Palo palo:Palo.values()){
			for(int i=1;i<=12;i++){
				mazo.add(new Carta(i, palo));
			}
		}
		mezclar();
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
	
	public static void main(String[] args) {
		MazoCartasEspañol mazo = new MazoCartasEspañol();
		System.out.println("Hooola");
		System.out.println(mazo.toString());
	}
}
