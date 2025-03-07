package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	class ConversionsTest {
	
		    Conversions conv = new Conversions();
		
		    @Test
		    void testEuroToDollar() {
		        assertEquals(12.0, conv.euroToDollar(10)); // Should be 11.0, so this fails
		    }
		
		    @Test
		    void testDollarToEuro() {
		        assertEquals(8.0, conv.dollarToEuro(10)); // Should be 9.0, so this fails
		    }
		
		    @Test
		    void testStringToInteger() {
		        assertEquals(456, conv.stringToInteger("123")); // Should be 123, so this fails
		    }
		
		    @Test
		    void testIntegerToString() {
		        assertEquals("456", conv.integerToString(123)); // Should be "123", so this fails
		    }
		
		    @Test
		    void testSwitchCase() {
		        assertEquals("Hello World", conv.switchCase("Hello World")); // Should be "hELLO wORLD", so this fails
		    }
	}
