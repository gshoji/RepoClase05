package Clases;

import java.util.ArrayList;
import java.util.List;

public class ItemCarrito {
	
	int cantidad;
	Producto prod;
	double tot;
	
	public ItemCarrito(Producto p, int canti)
	{
		this.prod=p;
		this.cantidad=canti;
	}
	public double calcular()
	{
		return tot=prod.getPrecio()*cantidad;
	}
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}


}
