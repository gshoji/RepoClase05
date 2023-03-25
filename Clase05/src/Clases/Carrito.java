package Clases;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	double total;
		
	List<ItemCarrito> elcarrito=new ArrayList<>();
	public void Carrito() {}
	
	public void agregar(ItemCarrito item)
	{
		elcarrito.add(item);
	}
	public double precio()
	{
		for(ItemCarrito it : elcarrito)
		{
			total+=it.calcular();
		}
		System.out.println("El total del carrito es: "+total);
		return total;
	}

}
