package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	code oe = new code();

	//@Test
	//public void doubleChar() {
		//assertEquals("TThhee", oe.doubleChar("The"));
		//assertEquals("AAAAbbbb", oe.doubleChar("AAbb"));
		//assertEquals("HHii--TThheerree", oe.doubleChar("Hi-There"));
	@Test
	public void calculus() {
		assertEquals(6, oe.calculus(2,4,"addition"));
		assertEquals(6, oe.calculus(2,4,"add"));
		assertEquals(6, oe.calculus(2,4,"+"));
		assertEquals(6, oe.calculus(2,4,"Addition"));
		assertEquals(-2, oe.calculus(2,4,"substraction"));
		assertEquals(-2, oe.calculus(2,4,"-"));
		assertEquals(-2, oe.calculus(2,4,"Substraction"));
		assertEquals(2, oe.calculus(8,4,"divide"));
		assertEquals(1, oe.calculus(4,4,"/"));
		assertEquals(3, oe.calculus(12,4,"division"));
		assertEquals(4, oe.calculus(16,4,"Division"));
		assertEquals(8, oe.calculus(2,4,"multiply"));
		assertEquals(4, oe.calculus(1,4,"*"));
		assertEquals(64, oe.calculus(16,4,"multiplication"));
		assertEquals(16, oe.calculus(4,4,"Multiplication"));
		
	}

}
