package commonprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDiffPairInDistinctIntArray {

	public static void main(String[] args) {
		
		int[] nums1= {4,2,1,3};
		List<List<Integer>> lsList=findArrayPairs(nums1);
		
		for(List<Integer> ls:lsList)
		{
			System.out.println(ls);
			
		}

	}

	private static List<List<Integer>> findArrayPairs(int[] arr) {
		Arrays.sort(arr);
        int min=Math.abs(arr[1]-arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]-arr[i-1]);
        }
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min) {
                List<Integer> A=new ArrayList<>();
                A.add(arr[i]);
                A.add(arr[i+1]);
                ans.add(A);
            }
        }
        
        
        return ans;
	}

}
