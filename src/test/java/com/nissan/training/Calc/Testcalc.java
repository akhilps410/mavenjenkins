package com.nissan.training.Calc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nissan.training.Calc.Calc;

public class Testcalc {

	@Test
	public void testadd() {
		Calc c =new Calc();
		assertEquals(9, c.add(4,5));
		
		
		
	}

	@Test
	public void testsub() {
		Calc c =new Calc();
		assertEquals(1, c.sub(5,4));
		
		}	
	
}
