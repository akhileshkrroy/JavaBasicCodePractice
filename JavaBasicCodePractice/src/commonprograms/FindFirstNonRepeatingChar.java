package commonprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {

	public static void main(String []args){
        String str="Google";
        char ch=getFirstNonRepChar(str.toLowerCase());
        
        System.out.println("first non repeative character:: "+ ch);
     }
     
     private static char getFirstNonRepChar(String st)
     {
         char[] charArr=st.toCharArray();
         char chNonRep='\u0000';
         Map<Character,Integer> map=new LinkedHashMap<>();
         for(char ch:charArr)
         {
             map.put(ch,map.getOrDefault(ch,0)+1);
         }
         
         for(Map.Entry<Character,Integer> entry:map.entrySet())
         {
             if(entry.getValue()==1)
             {
                 chNonRep=entry.getKey();
                 break;
             }
         }
            return chNonRep; 
         }

}
