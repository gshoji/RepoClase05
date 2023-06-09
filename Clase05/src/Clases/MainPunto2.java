package Clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainPunto2 {

	public static void main(String[] args) {
		String vec[]=new String[50];
		String ruta="C:\\Users\\gasto\\Documents\\GitHub\\RepoClase05\\Archivos\\items.txt";
		List<Producto> Listaprod=new ArrayList<>();
		List<ItemCarrito> listaitem=new ArrayList<>();
		
		
		
			try {
				for (String linea : Files.readString(Paths.get(ruta)))
				{
					vec=linea.split(",");
				}
				int p=0;
				//divide la cantidad de datos en grupos de 3 para saber la cantidad de items
				int cant=vec.length/3;
			
				for(int i=0;i<cant;i++)
				{
					Producto prod=new Producto();
					prod.setId(Integer.parseInt(vec[p]));
					prod.setPrecio(Double.parseDouble(vec[p+1]));
					prod.setDescripcion(vec[p+2]);
					Listaprod.add(prod);
					p=p+3;
				}
			
		
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//agrego los items a la lista
			for(Producto pro : Listaprod)
			{
			    ItemCarrito item=new ItemCarrito(pro,pro.getId());
			    listaitem.add(item);
			}
			
			//agrego la lista de items al carrito
			Carrito micarrito=new Carrito();
			for(ItemCarrito it : listaitem)
			{
				micarrito.agregar(it);
			}
			System.out.println("El total del carrito es: "+micarrito.precio());
			
		
		


	}

}
