package recursionprograms;

import java.util.Arrays;

public class SumofNumbersFromStringUsingRegrexAndRecursion {

	public static void main(String[] args) {
		
		String str="Akhilesh123Roy450!!%";
        String[] strArr=str.split("[^0-9]");
//        String[] strArr=str.split("[a-zA-Z]");
        System.out.println(Arrays.toString(strArr));
        int sum=0;
        for(int i=0;i<strArr.length;i++)
        {
        	if(!strArr[i].isEmpty())
        	sum=sum+Integer.parseInt(strArr[i]);
        	
        }
        System.out.println("without Recursion :: "+sum);
        
        System.out.println("sum of digits of numbsers in string :: "+sumWithRecursion(strArr, strArr.length));

	}

	static int sumWithRecursion(String[] arr, int n) {
		int temp=0;
		if (n == 0) {
			return 0;
			}
		else {
			if (!arr[n-1].isEmpty())
				temp= Integer.parseInt(arr[n-1]);
		}
		return temp + sumWithRecursion(arr, n - 1);
	}

}
