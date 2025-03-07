package griffith;

public class Conversions {

	    public double euroToDollar(double euro) {
	        return euro * 1.1;
	    }
	
	    public double dollarToEuro(double dollar) {
	        return dollar * 0.9;
	    }
	
	    public int stringToInteger(String val) {
	        return Integer.parseInt(val);
	    }
	
	    public String integerToString(int val) {
	        return String.valueOf(val);
	    }

		    public String switchCase(String str) {   //loop that changes uppercase to lowercase and vice versa
		        StringBuilder result = new StringBuilder(); 
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
