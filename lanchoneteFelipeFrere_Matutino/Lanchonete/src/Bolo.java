

public class Bolo extends Lanche {
	private String massa;
	private String recheio;
	private String cobertura;
	private final int tempoPadrao = 10;
	
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public float calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}

}
