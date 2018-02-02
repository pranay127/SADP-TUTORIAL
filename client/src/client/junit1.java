package client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit1 {

	@Test
	void test1() {
		Calculate t = new Calculate();
		double result = t.evaluate("25+5");
		assertEquals(30.0+"",result+"");
	}
	@Test
	void test2() {
		Calculate t = new Calculate();
		double result = t.evaluate("2+5");
		assertEquals(7.0+"",result+"");
	}
	@Test
	void test3() {
		Calculate t = new Calculate();
		double result = t.evaluate("5+5");
		assertEquals(10.0+"",result+"");
	}
	@Test
	void test4() {
		Calculate t = new Calculate();
		double result = t.evaluate("25-5");
		assertEquals(20.0+"",result+"");
	}
	@Test
	void test5() {
		Calculate t = new Calculate();
		double result = t.evaluate("25*5");
		assertEquals(125.0+"",result+"");
	}
	@Test
	void test6() {
		Calculate t = new Calculate();
		double result = t.evaluate("30/6");
		assertEquals(5.0+"",result+"");
	}
	@Test
	void test7() {
		Calculate t = new Calculate();
		double result = t.evaluate("6-5+5");
		assertEquals(6.0+"",result+"");
	}
	@Test
	void test8() {
		Calculate t = new Calculate();
		double result = t.evaluate("5+25/5");
		assertEquals(10.0+"",result+"");
	}
	@Test
	void test9() {
		Calculate t = new Calculate();
		double result = t.evaluate("5+5");
		assertEquals(10.0+"",result+"");
	}
	@Test
	void test10() {
		Calculate t = new Calculate();
		double result = t.evaluate("30-5");
		assertEquals(25.0+"",result+"");
	}
	@Test
	void test11() {
		Calculate t = new Calculate();
		double result = t.evaluate("30-4+5");
		assertEquals(31.0+"",result+"");
	}
	@Test
	void test12() {
		Calculate t = new Calculate();
		double result = t.evaluate("12*5+5");
		assertEquals(65.0+"",result+"");
	}
	@Test
	void test13() {
		Calculate t = new Calculate();
		double result = t.evaluate("13+5");
		assertEquals(18.0+"",result+"");
	}
	@Test
	void test14() {
		Calculate t = new Calculate();
		double result = t.evaluate("18/3");
		assertEquals(6.0+"",result+"");
	}
	@Test
	void test15() {
		Calculate t = new Calculate();
		double result = t.evaluate("23*2+5");
		assertEquals(51.0+"",result+"");
	}
	@Test
	void test16() {
		Calculate t = new Calculate();
		double result = t.evaluate("25+5");
		assertEquals(30.0+"",result+"");
	}
	@Test
	void test17() {
		Calculate t = new Calculate();
		double result = t.evaluate("5+7");
		assertEquals(12.0+"",result+"");
	}
	@Test
	void test18() {
		Calculate t = new Calculate();
		double result = t.evaluate("35+5-10");
		assertEquals(30.0+"",result+"");
	}
	@Test
	void test19() {
		Calculate t = new Calculate();
		double result = t.evaluate("81+190/10");
		assertEquals(100.0+"",result+"");
	}
	@Test
	void test20() {
		Calculate t = new Calculate();
		double result = t.evaluate("36/4+1");
		assertEquals(10.0+"",result+"");
	}
	@Test
	void test21() {
		Calculate t = new Calculate();
		double result = t.evaluate("21/7+5");
		assertEquals(8.0+"",result+"");
	}
	@Test
	void test22() {
		Calculate t = new Calculate();
		double result = t.evaluate("23+5");
		assertEquals(28.0+"",result+"");
	}
	@Test
	void test23() {
		Calculate t = new Calculate();
		double result = t.evaluate("35+5");
		assertEquals(40.0+"",result+"");
	}
	@Test
	void test24() {
		Calculate t = new Calculate();
		double result = t.evaluate("18+5*4");
		assertEquals(38.0+"",result+"");
	}
	@Test
	void test25() {
		Calculate t = new Calculate();
		double result = t.evaluate("25+5-5+10");
		assertEquals(35.0+"",result+"");
	}

}
