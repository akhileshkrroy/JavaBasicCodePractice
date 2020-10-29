package commonprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class AverageOfStudentsHighFiveScores {

	public static void main(String[] args) {
		int[][] items= {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		int[][] result=highFive(items);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(Arrays.toString(result[i]));
		}
	}

	private static int[][] highFive(int[][] items) {
		
		HashMap<Integer,PriorityQueue<Integer>> h = new HashMap<>();
	    
        List<int[]> result = new ArrayList<>();
        
        for(int i=0;i<items.length;i++){
            PriorityQueue<Integer> pq = h.getOrDefault(items[i][0], new PriorityQueue<Integer>());
            pq.add(items[i][1]);
            if(pq.size()>5){
                pq.remove();
            }
            h.put(items[i][0],pq);
            
        }
        int sum=0;
        for(Map.Entry<Integer,PriorityQueue<Integer>> entry: h.entrySet()){
            for(int num: entry.getValue()){
                sum += num; 
            }
            int temp[] = new int[2];
            temp[0] = entry.getKey();
            temp[1] = sum/5;
            result.add(temp);
            sum=0;
        }
        return result.toArray(new int[result.size()][2]);
		
	}

}
