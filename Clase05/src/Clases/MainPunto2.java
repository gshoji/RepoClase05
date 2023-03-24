package Clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainPunto2 {

	public static void main(String[] args) {
		String vec[]=new String[50];
		String ruta="C:\\Users\\gasto\\OneDrive\\Escritorio\\RepoClase05\\Archivos\\items.txt";
		List<Producto> Listaprod=new ArrayList<>();
		List<ItemCarrito> listaitem=new ArrayList<>();
		Producto prod=new Producto();
		
		
			try {
				for (String linea : Files.readAllLines(Paths.get(ruta)))
				{
					vec=linea.split(",");
				}
				int p=0;
				for(int i=0;i<vec.length;i++)
				{
					prod.setId(Integer.parseInt(vec[p]));
					prod.setPrecio(Double.parseDouble(vec[p+1]));
					prod.setDescripcion(vec[p+2]);
					p=p+3;
					Listaprod.add(prod);
				}
		
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(Producto pro : Listaprod)
			{
				ItemCarrito item=new ItemCarrito(pro,pro.getId());
				listaitem.add(item);
			}
			Carrito micarrito=new Carrito();
			for(ItemCarrito it : listaitem)
			{
				micarrito.agregar(it);
			}
			micarrito.precio();
		
		


	}

}
