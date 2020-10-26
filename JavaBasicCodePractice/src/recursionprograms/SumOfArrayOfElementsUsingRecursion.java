package recursionprograms;

public class SumOfArrayOfElementsUsingRecursion {

	public static void main(String []args){
        int[] A = {4, 2,10,21, 3,44,34,56,77};
        
        divisble(A,A.length);
       
      
    }
    static void divisble(int[] A,int n)
    {

        if(n>0)//give n>0 else array index out of bound
        {
            if(A[n-1]%2==0||A[n-1]%3==0||A[n-1]%5==0)
            System.out.println(A[n-1]);
            divisble(A,n-1); //add this line within if n>0 else stack overflow
        }

	}

}
