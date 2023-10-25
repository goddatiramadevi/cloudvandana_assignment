package corejava.strings;


	public class RomanToInteger {
	    public static void main(String[] args) {
	        String romanNumeral = "IX"; // Replace with your Roman numeral input
	        int result = romanToInteger(romanNumeral);
	        System.out.println("Integer representation of " + romanNumeral + " is: " + result);
	    }

	    public static int romanToInteger(String s) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char currentChar = s.charAt(i);
	            int value = 0;

	            switch (currentChar) {
	                case 'I':
	                    value = 1;
	                    break;
	                case 'V':
	                    value = 5;
	                    break;
	                case 'X':
	                    value = 10;
	                    break;
	                case 'L':
	                    value = 50;
	                    break;
	                case 'C':
	                    value = 100;
	                    break;
	                case 'D':
	                    value = 500;
	                    break;
	                case 'M':
	                    value = 1000;
	                    break;
	            }

	            // Check if the current value is smaller or equal to the previous value
	            if (value >= prevValue) {
	                result += value;
	            } else {
	                result -= value;
	            }

	            // Update the previous value
	            prevValue = value;
	        }

	        return result;
	    }
	}

