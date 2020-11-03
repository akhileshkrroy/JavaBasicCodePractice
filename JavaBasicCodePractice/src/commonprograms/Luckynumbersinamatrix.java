package commonprograms;

import java.util.ArrayList;
import java.util.List;

public class Luckynumbersinamatrix {

	public static void main(String[] args) {
		int[][] matrix= {{3,7,8},{9,11,13},{15,16,17}};
		List<Integer> ls=findLuckyNum(matrix);
		ls.forEach(e->System.out.println(e));

	}

	private static List<Integer> findLuckyNum(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE ,index = -1;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            for(int k = 0; k < matrix.length; k++){
                if(matrix[k][index] > max) 
                    max = matrix[k][index];
            }
            if(min == max) 
                ans.add(min);
        }
        
        return ans;
	}

}
