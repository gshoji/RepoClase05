package Clases;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)
	{
		
		List<Producto> Listaprod=new ArrayList<>();
		
		//cargo los productos
		Producto jabon =new Producto();
		jabon.setId(1);
		jabon.setPrecio(40);
		jabon.setDescripcion("Jabon en polvo");
		Listaprod.add(jabon);
		
		Producto esponja =new Producto();
		esponja.setId(2);
		esponja.setPrecio(10);
		esponja.setDescripcion("Esponjas");
		Listaprod.add(esponja);
		
		
		Producto chocolate =new Producto();
		chocolate.setId(3);
		chocolate.setPrecio(100);
		chocolate.setDescripcion("Chocolates");
		Listaprod.add(chocolate);
		
		//agrego lo items
		ItemCarrito item1=new ItemCarrito(jabon,1);
		ItemCarrito item2=new ItemCarrito(esponja,3);
		ItemCarrito item3=new ItemCarrito(chocolate,2);
		
		//los cargo al carrito
		Carrito micarrito=new Carrito();
		micarrito.agregar(item1);
		micarrito.agregar(item2);
		micarrito.agregar(item3);
		micarrito.sumar();
	
	

	}

}
