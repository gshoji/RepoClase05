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


}
