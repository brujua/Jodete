package modelo;

public class Card{
	private Palo palo;
	private int numero;
	
	public Card(int nro, Palo palo){
		super();
		numero = nro;
		this.palo=palo;
	}
	// constructor de copias
	public Card(Card original){
		super();
		numero = original.getNumero();
		palo = original.getPalo();
	}
	
	public Card copy(){
		return new Card(this);
	}

	public Palo getPalo() {
		return palo;
	}
	
	public String getPaloStr(){
		return palo.toString();
		
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return numero+" de "+ palo.toString();
	}
		
	
}