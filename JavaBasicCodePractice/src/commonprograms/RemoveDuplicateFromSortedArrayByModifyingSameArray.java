package commonprograms;

public class RemoveDuplicateFromSortedArrayByModifyingSameArray {

	public static void main(String[] args) {
		//Notice that this Array is sorted so we are able to use this approach
		int [] nums= {1,1,1,1,2,2,2};		
		int j=0;
	       for(int i=1;i<nums.length;i++)
	       {
	           if(nums[i]!=nums[j])
	           {   j++;
	               nums[j]=nums[i];
	               
	           }

	       }
	        System.out.println("Non Duplicate Array Element Count ::"+(j+1));

	}

}
