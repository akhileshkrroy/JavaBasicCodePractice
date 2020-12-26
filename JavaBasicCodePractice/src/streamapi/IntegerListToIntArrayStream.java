package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerListToIntArrayStream {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
        ls.add(2);
         ls.add(3);
          ls.add(9);
           ls.add(1);
//           int[] array = ls.stream().mapToInt(i->i).toArray();
           int[] array = ls.stream().mapToInt(Integer::intValue).toArray();
           System.out.println(Arrays.toString(array));

	}

}
