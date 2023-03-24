package Clases;

public class subdescuento1 extends Descuento {
	
	public double valorfinal(double valorini)
	{
		return valorini-this.getValor();
	}

}
