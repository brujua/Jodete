package modelo;

public interface Player {
	
	public void informChange(int playerNr, Card card);
	public void informPaloChange(int playerNr, Palo palo);
	public void informJodeteShout(int playerNr);
	public void informPasoShout(int playerNr);
}
