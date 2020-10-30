package commonprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterSectionOfTwoArray {

	public static void main(String[] args) {
		
		int[] nums1= {1,2,2,1};
		int[] nums2 = {2,2};
		int[] result= result=findInerSectionOfArr(nums1,nums2);
		Arrays.stream(result).boxed().forEach(e->System.out.println(e));

	}

	private static int[] findInerSectionOfArr(int[] nums1, int[] nums2) {
		Map<Integer,Integer> a=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
            a.put(nums1[i],a.getOrDefault(nums1[i],0)+1);
        
        for(int j=0;j<nums2.length;j++)
        {
            if(a.containsKey(nums2[j]))
                set.add(nums2[j]);
        }
        
        int[] arr=new int[set.size()];
        int m=0;
        for( int l:set)
           arr[m++] =l;
        
        return arr;
	}

}
