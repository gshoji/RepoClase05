package Clases;

public class descuentoPorcentajeConTope extends Descuento {
	
	
	public double valorfinal(double valorini)
	{
		if(this.getValor()>51)
		{
			System.out.println("El tope es 50% excedio el limite");
			return valorini-((valorini*50)/100);
		}
		else {
			return valorini-((valorini*this.getValor())/100);
		}

	}


}
