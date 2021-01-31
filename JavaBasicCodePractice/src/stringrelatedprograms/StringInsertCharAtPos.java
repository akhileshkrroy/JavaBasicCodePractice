package stringrelatedprograms;

public class StringInsertCharAtPos {
public static void main(String[] args) {
		
		
		String str="2abc2def1ghij";
		int k=3;
		
		StringBuilder br=new StringBuilder(str);
		int i=str.length();
		while(i-k>0) {
		br.insert(i-k, "-");
		i=i-k;
		}
		
		System.out.println(br.toString());

	}

}
