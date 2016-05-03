package modelo;

public class Carta{
	private Palo palo;
	private int numero;
	
	public Carta(int nro, Palo palo){
		super();
		numero = nro;
		this.palo=palo;
	}
	// constructor de copias
	public Carta(Carta original){
		super();
		numero = original.getNumero();
		palo = original.getPalo();
	}
	
	public Carta copy(){
		return new Carta(this);
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
