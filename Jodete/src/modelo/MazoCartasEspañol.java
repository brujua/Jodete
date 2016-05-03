package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class MazoCartasEspaņol {
	private ArrayList<Carta> mazo;
	
	public MazoCartasEspaņol(){
		mazo = new ArrayList<>();
		for(Palo palo:Palo.values()){
			for(int i=1;i<12;i++){
				mazo.add(new Carta(i, palo));
			}
		}
		mezclar();
	}
	
	public void mezclar(){
		Collections.shuffle(mazo);
	}
	@Override
	public String toString(){
		//TODO  es un asco este toString
		String str = new String();
		for(Carta carta:mazo){
			str= str +""
					+ ""+ carta.toString();
		}
		return str;
	}
	public static void main(String[] args) {
		MazoCartasEspaņol mazo = new MazoCartasEspaņol();
		System.out.println("Hooola");
		System.out.println(mazo.toString());
	}
}
