package Clases;

import java.util.ArrayList;
import java.util.List;

public class ItemCarrito {
	
	int cantidad;
	//List<Producto> Listaprod=new ArrayList<>();
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
/*	public void ItemCarrito(List<Producto> lprod,int cant)
	{
		for(Producto p : lprod)
		{
			this.Listaprod.add(p);
			this.cantidad=cant;
		}

	}*/

}
