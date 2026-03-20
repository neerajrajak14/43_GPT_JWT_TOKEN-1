package com.psa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.psa.model.Calculator;

@SpringBootTest
public class CalculatorTest {
	
	@Test
  public void testAdd() {
	  int expectedValue = 50;
	  Calculator c = new Calculator();
	  int actualValue = c.add(10, 40);
	  
	  Assertions.assertEquals(expectedValue, actualValue);
		
  }	
  
	@Test
	  public void testMul() {
		  int expectedValue = 20;
		  Calculator c = new Calculator();
		  int actualValue = c.mul(10, 2);
		  
		  Assertions.assertEquals(expectedValue, actualValue);
			
	  }	
	  

	
	
}
