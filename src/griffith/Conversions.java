package griffith;

public class Conversions {

		    public double euroToDollar(double euro) {
		        return euro * 1.1; // Approx. exchange rate
		    }
		
		    public double dollarToEuro(double dollar) {
		        return dollar * 0.9; // Approx. exchange rate
		    }
		
		    public int stringToInteger(String val) {
		        return Integer.parseInt(val);
		    }
		
		    public String integerToString(int val) {
		        return String.valueOf(val);
		    }

		    
	    public String switchCase(String str) {
	        StringBuilder result = new StringBuilder(); //loop that changes uppercase to lowercase and vice versa
	        	
	        for (char c : str.toCharArray()) {
			            if (Character.isUpperCase(c)) {
			                result.append(Character.toLowerCase(c));
			            } else if (Character.isLowerCase(c)) {
			                result.append(Character.toUpperCase(c));
			            } else {
	                result.append(c);
	            }
	        }
	        	return result.toString();
	    }
}
