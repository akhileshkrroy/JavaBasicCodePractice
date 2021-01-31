package streamapi;

import java.util.Arrays;

public class SortTwoDimentionalArrayStream {

	public static void main(String[] args) {

		int[][] intervals= {{6,4},{7,8},{2,4},{1,8}};
		
		Arrays.sort(intervals,(a1,a2)->Integer.compare(a1[0],a2[0]));
	Arrays.stream(intervals).forEach(e->System.out.println(Arrays.toString(e)));
	
	}

}
