package executavel;

public class Carro {
	protected int velocidade ;
	protected int distancia;
	
	public Carro(int velocidade,int distancia) {
		setVelocidade(velocidade);
		setDistancia(distancia);
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
}

