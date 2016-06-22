package jUnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import FormatNumber.FormatNumberUtil;

public class FormatNumbersTest {
	
	@Test
	public void getFormattedCurrencyTest2() {
		String s = FormatNumberUtil.getFormattedCurrency(0, 2);
		System.out.println(s);
		assertEquals(s, "$0.00");
	}	
	@Test
	public void getFormattedCurrencyTest1() {		
		assertEquals(FormatNumberUtil.getFormattedCurrency(2.5, 2), "$2.50");
		
	}		
	@Test
	public void getFormattedCurrencyTest3() {
		assertEquals(FormatNumberUtil.getFormattedCurrency(1234567.1234, 2), "$1,234,567.12");
	}
	@Test
	public void getFormattedCurrencyTest4() {
		assertEquals(FormatNumberUtil.getFormattedCurrency(1234567.1234), "$1,234,567.12");
	}
	
	@Test
	public void getFormattedDecimalTest1() {	
		String s = FormatNumberUtil.getFormattedDecimal(0, 2);
		System.out.println(s);
		assertEquals(s, "0.00");		
	}
	@Test
	public void getFormattedDecimalTest2() {	
		String s = FormatNumberUtil.getFormattedDecimal(2.5, 2);
		System.out.println(s);
		assertEquals(s, "2.50");		
	}
	@Test
	public void getFormattedDecimalTest3() {	
		String s = FormatNumberUtil.getFormattedDecimal(1234567.1234, 3);
		System.out.println(s);
		assertEquals(s, "1,234,567.123");		
	}
	
	@Test
	public void getFormattedPercentTest1() {	
		String s = FormatNumberUtil.getFormattedPercent(0, 2);
		System.out.println(s);
		assertEquals(s, "0.00%");		
	}
	@Test
	public void getFormattedPercentTest2() {	
		String s = FormatNumberUtil.getFormattedPercent(1.5, 2);
		System.out.println(s);
		assertEquals(s, "1.50%");		
	}
	@Test
	public void getFormattedPercentTest3() {	
		String s = FormatNumberUtil.getFormattedPercent(.23456, 2);
		System.out.println(s);
		assertEquals(s, "23.46%");		
	}
	@Test
	public void getFormattedPercentTest4() {	
		String s = FormatNumberUtil.getFormattedPercent(12345.67891, 2);
		System.out.println(s);
		assertEquals(s, "1,234,567.89%");		
	}





}
