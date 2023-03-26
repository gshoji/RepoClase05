package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class subdescuento1Test {

	@Test
	void testValorfinal() 
	{
		Descuento desc=new subdescuento1();
		desc.setValor(70);
		Assertions.assertEquals(desc.valorfinal(270),200);
		
	}

}
