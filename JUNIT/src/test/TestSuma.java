package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Sumar;

public class TestSuma {
	
	Sumar suma=new Sumar();

	@Before
	public void setUp() throws Exception {
		
		suma.setNum1(10);
		suma.setNum2(4);
	}

	@Test
	public void test() {
		
		assertEquals(14,suma.suma());
    
	}

}
