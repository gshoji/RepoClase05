package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		//List<Producto> Listaprod=new ArrayList<>();
		
		//cargo los productos para el punto 1
		Producto jabon =new Producto();
		jabon.setId(1);
		jabon.setPrecio(40);
		jabon.setDescripcion("Jabon en polvo");
		//Listaprod.add(jabon);
		
		Producto esponja =new Producto();
		esponja.setId(2);
		esponja.setPrecio(10);
		esponja.setDescripcion("Esponjas");
		//Listaprod.add(esponja);
		
		
		Producto chocolate =new Producto();
		chocolate.setId(3);
		chocolate.setPrecio(100);
		chocolate.setDescripcion("Chocolates");
		//Listaprod.add(chocolate);
		
		//agrego lo items
		ItemCarrito item1=new ItemCarrito(jabon,1);
		ItemCarrito item2=new ItemCarrito(esponja,3);
		ItemCarrito item3=new ItemCarrito(chocolate,2);
		
		//los cargo al carrito
		//agrego clase6 opcion 1-descuento fijo, 2-descuento porcentaje, 3 descuento con tope
		Scanner lee =new Scanner(System.in);
		System.out.println("Ingrese una opcion de 1 a 3: ");
		System.out.println("1- Descuento fijo");
		System.out.println("2- Descuento por porcentaje");
		System.out.println("3- Descuento con tope");
		int op=lee.nextInt();
		System.out.println("Ingrese monto o porcentaje de descuento:");
		int descuento=lee.nextInt();
		
		Carrito micarrito=new Carrito();
		micarrito.agregar(item1);
		micarrito.agregar(item2);
		micarrito.agregar(item3);
		double tot=micarrito.precio();
		System.out.println("El total es: "+tot);
	
		if(op==1)
		{
			Descuento desc=new subdescuento1();
			desc.setValor(descuento);
			System.out.println("Valor con descuento: "+desc.valorfinal(tot));
		}
		else if(op==2)
		{
			Descuento desc2=new subdescuento2();
			desc2.setValor(descuento);
			System.out.println("Valor con descuento: "+desc2.valorfinal(tot));
		}
		else if(op==3)
		{
			Descuento desc2=new descuentoPorcentajeConTope();
			desc2.setValor(descuento);
			System.out.println("Valor con descuento: "+desc2.valorfinal(tot));
		}
	

	}

}
