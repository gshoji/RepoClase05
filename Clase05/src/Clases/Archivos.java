package Clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Archivos {
	
	String ruta;
	String lectura;
	String vec[]=new String[50];
	
	public Archivos(String rt)
	{
		this.ruta=rt;
	}
	
	public void LeerArchivos() 
	{
		try {
			for (String linea : Files.readAllLines(Paths.get(ruta)))
			{
				vec=linea.split(",");
			}
			for(int i=0;i<vec.length;i++)
			{
				
			}
	
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String[] getVector()
	{
		return vec;
	}

	
	
	

}
