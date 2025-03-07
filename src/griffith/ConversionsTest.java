package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

		    Conversions conv = new Conversions();
		
		    @Test
		    void testEuroToDollar() {
		        assertEquals(11.0, conv.euroToDollar(10));
		    }
		
		    @Test
		    void testDollarToEuro() {
		        assertEquals(9.0, conv.dollarToEuro(10));
		    }
		
		    @Test
		    void testStringToInteger() {
		        assertEquals(123, conv.stringToInteger("123"));
		    }
		
		    @Test
		    void testIntegerToString() {
		        assertEquals("123", conv.integerToString(123));
		    }
		
		    @Test
		    void testSwitchCase() {
		        assertEquals("hELLO wORLD", conv.switchCase("Hello World"));
		    }
}
