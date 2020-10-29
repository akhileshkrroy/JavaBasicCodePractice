package commonprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacterInArrayOfStrings {

	public static void main(String[] args) {
		String[] strArr={"bella","label","roller"};
		List<String> result=findCommonChar(strArr);
		result.forEach(e->System.out.println(e));
	}

	private static List<String> findCommonChar(String[] A) {
		
		
		List<String> list = new ArrayList<>();
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        List<Character> removeChars = new ArrayList<>();
    
        
        for(char c : A[0].toCharArray()){
            a.put(c,a.getOrDefault(c, 0)+1);
        }
        
        for(int i = 1; i < A.length; i++){
            for(char c : A[i].toCharArray()){
                if(a.containsKey(c)){
                    b.put(c,b.getOrDefault(c, 0)+1);
                } 
            }
            for(Map.Entry<Character, Integer> entry1 : a.entrySet()){
                char keyA = entry1.getKey();
                int valA = entry1.getValue();
                if(b.containsKey(keyA)){
                    int valB = b.get(keyA);
                    a.put(keyA, Math.min(valA, valB));
                }else
                    removeChars.add(keyA);
            }
            for(char c : removeChars){
                a.remove(c);
            }
            b.clear();
        }
        for(Map.Entry<Character, Integer> entry : a.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            for(int i = 0; i < val; i++){
                list.add(String.valueOf(key));
            }
        }
        return list;
	}

}
