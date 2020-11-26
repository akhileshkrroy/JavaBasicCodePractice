package stringrelatedprograms;

public class RomanToInt {

	public static void main(String[] args) {
		String s="LVIII";
		int res = 0;
        int value = 0;
        int max = 0;
        for(int i = s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            switch(c) {
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
            if(value < max) {
                res -= value;
            }else {
                res += value;
                max = value;
            }
        }
   System.out.println(res);
	}

}
