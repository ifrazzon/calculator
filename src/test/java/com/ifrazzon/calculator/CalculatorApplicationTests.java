package com.ifrazzon.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	public void testSum(){
		Assert.assertEquals(5, calculator.sum(2,3));
	}

	@Test
	public void contextLoads() {
	}

}
