package stringrelatedprograms;



import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DuplicatePrint {


	public static void main(String[] args) {
		
		String s="I am a am play cricket cricket";
		String c="adddeyyttti";
		
//		findDuplicateWord(s);
//		findDuplicateChar(c);
		findDuplicateWordUsingKeySetLoop(s);
		
		

	}


	private static void findDuplicateChar(String c) {
		
		HashMap<Character,Integer> dupl=new HashMap<Character ,Integer>();
		char[] w=c.toCharArray();
		for (int i=0;i<w.length;i++) {
			if(!dupl.keySet().contains(w[i]))
			{dupl.put(w[i], 1);}
			else
			{
				dupl.put(w[i],(dupl.get(w[i]))+1 );
				
			}
			
		
		}
		//we can use this onliner coder
//		for (int m=0;m<w.length;m++) {
//			dupl.put(w[m],dupl.getOrDefault(w[m],0)+1 );
//		}
		
		Iterator<Character> k=dupl.keySet().iterator();
		while(k.hasNext())
		{
			char tempkey=k.next();
			
			if(dupl.get(tempkey)>1)
			{
				System.out.println("duplicate key::"+ tempkey+ " Value::"+dupl.get(tempkey));
			}
		}
		
		
	}

	private static void findDuplicateWord(String s) {
		HashMap<String,Integer> dupl=new HashMap<String ,Integer>();
		String[] w=s.split(" ");
		for (int i=0;i<w.length;i++) {
			if(!dupl.keySet().contains(w[i]))
			{dupl.put(w[i], 1);}
			else
			{
				dupl.put(w[i],(dupl.get(w[i]))+1 );
				
			}
			
		
		}
		
		Iterator<String> k=dupl.keySet().iterator();
		while(k.hasNext())
		{
			String tempkey=k.next();
			
			if(dupl.get(tempkey)>1)
			{
				System.out.println("duplicate key::"+ tempkey+ " Value::"+dupl.get(tempkey));
			}
		}
		
		
	}
	
	private static void findDuplicateWordUsingKeySetLoop(String s) {
		HashMap<String,Integer> dupl=new HashMap<String ,Integer>();
		String[] w=s.split(" ");
		for (String st:w) {
			dupl.put(st, (dupl.getOrDefault(st,0)+1));
		
		}
		
	
		for(String st1:dupl.keySet())
		{
			
			if(dupl.get(st1)>1)
			{
				System.out.println("duplicate key::"+ st1+ " Value::"+dupl.get(st1));
			}
		}
		
		
	}
	
	

}

