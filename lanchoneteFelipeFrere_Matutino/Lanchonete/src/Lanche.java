public abstract class Lanche {
	private float preco = 10f;
	

	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public float calculaTempo(int distancia) {
		return distancia * 10;
	}	

}
