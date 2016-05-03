package modelo;

public class Carta {
	public Palo palo;
	int numero;
	
	public Carta(int nro, Palo palo){
		super();
		numero = nro;
		this.palo=palo;
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
