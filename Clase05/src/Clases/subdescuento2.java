package Clases;

public class subdescuento2 extends Descuento {
	
	public double valorfinal(double valorini)
	{
		return valorini-((valorini*this.getValor())/100);
	}

}
