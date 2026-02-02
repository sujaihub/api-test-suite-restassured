package com.qatransition.maven_eclipse_demo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import calculator.Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

	public class CalculatorTest {
		private Calculator calc;
		@Test
		public void testAddition() {
		    int result = calc.add(2, 3);
		    assertEquals(5, result);
		}

		@Test
		public void testSubtraction() {
		    int result = calc.subtract(10, 4);
		    assertEquals(6, result);
		}

		@Test
		public void testMultiplication() {
		    int result = calc.multiply(5, 3);
		    assertEquals(15, result);
		}

		@Test
		@DisplayName("Division should return correct result")
		public void testDivision() {
		    double result = calc.divide(10.0, 2.0);
		    assertEquals(5.0, result);
		}

	    @Test
	    @DisplayName("Check if number is positive")
	    public void testPositiveNumber() {
	        int num = 10;
	        assertTrue(num > 0);
	    }

	    @Test
	    @DisplayName("String should not be null")
	    public void testStringNotNull() {
	        String text = "Hello";
	        assertNotNull(text);
	    
	    }
	    @BeforeEach
	    public void setUp() {
	        calc = new Calculator();
	        System.out.println("Running test...");
	    
	    }

	    @AfterEach
	    public void tearDown() {
	        System.out.println("Test completed");
	    }
	}

 

