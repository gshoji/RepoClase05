package Clases;

public abstract class Descuento {
	double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract double valorfinal(double valorini);

}
