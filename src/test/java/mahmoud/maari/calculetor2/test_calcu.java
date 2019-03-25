package mahmoud.maari.calculetor2;


import static org.junit.Assert.assertEquals;

import org.junit.*;
public class test_calcu {
	
	
	@Test
	public void test_cal() {
		double n1=10,n2=5,r=0;
		Calcouletor cal = new Calcouletor(n1, "+", n2);
		double expected=15;
		double actual =cal.add(n1, n2);
		assertEquals(expected, actual,0);
		
	}
	@Test
	public void test_cal1() {
		double n1=10,n2=5,r=0;
		Calcouletor cal = new Calcouletor(n1, "-", n2);
		double expected=5;
		double actual =cal.sub(n1, n2);
		assertEquals(expected, actual,0);
		
	}
	@Test
	public void test_cal2() {
		double n1=10,n2=5,r=0;
		Calcouletor cal = new Calcouletor(n1, "*", n2);
		double expected=50;
		double actual =cal.malt(n1, n2);
		assertEquals(expected, actual,0);
		
	}
	@Test
	public void test_cal3() {
		double n1=10,n2=2,r=0;
		Calcouletor cal = new Calcouletor(n1, "*", n2);
		double expected=5;
		double actual =cal.deva(n1, n2);
		assertEquals(expected, actual,0);
		
	}

}
