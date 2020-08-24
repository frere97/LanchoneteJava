public class Massa extends Lanche{
	
	private final float tempoPadrao = 30;
	
	private String tipoDeMassa;
	private String Molho;
	



	public void setTipoDeMassa(String tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}

	public void setMolho(String molho) {
		Molho = molho;
	}


	@Override
	public float calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}

	
	
}
	



