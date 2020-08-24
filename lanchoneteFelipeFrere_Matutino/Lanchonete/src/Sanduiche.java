
public class Sanduiche extends Lanche {

	private float tempoPadrao = 15;
	private String[] ingredientes = new String[10];

	public String[] getIngredientes() {
		return ingredientes;
	}
	


	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public float calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}
	
	
	
}
