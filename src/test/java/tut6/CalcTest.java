package tut6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	    int result = Calc.add(1, 2);
        Assert.assertEquals(3, result);
		
	}
	@Test
	void test2() {
	    int result = Calc.subtract(2,1);
        Assert.assertEquals(1, result);
		
	}
	@Test
	void test3() {
	    int result = Calc.time(2,1);
        Assert.assertEquals(1, result);
		
	}

}
