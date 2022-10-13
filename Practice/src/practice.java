import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice {
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4,0}, 
						  {5,6,7,8,1}, 
						  {3,2,4,1,4}, 
						  {4,3,5,1,6}};
		String a = 1 + 1 + "";
		System.out.println(a);
	}
	
	static int solution(int[][] matrix, int a, int b) {
	    List<Integer> possible_results = new ArrayList<Integer>();
	    int min_x, max_x, min_y, max_y;
	    for (int x = 0; x < matrix.length; x++) {
	        for (int y = 0; y < matrix[x].length; y++) {
	            if (x - a >= 0 && x + a < matrix.length && y - b >= 0 && y + b < matrix[x].length) {
	                min_x = x - a;
	                max_x = x + a;
	                min_y = y - b;
	                max_y = y + b;
	                int sum = 0;
	                for (int i = min_x; i <= max_x; i++) {
	                    for (int j = min_y; j <= max_y; j++) {
	                        sum += matrix[i][j];
	                    }
	                }
	                possible_results.add(sum);
	            }
	            if (x - b >= 0 && x + b < matrix.length && y - a >= 0 && y + a < matrix[x].length) {
	                min_x = x - a;
	                max_x = x + a;
	                min_y = y - b;
	                max_y = y + b;
	                int sum = 0;
	                for (int i = min_x; i <= max_x; i++) {
	                    for (int j = min_y; j <= max_y; j++) {
	                        sum += matrix[i][j];
	                    }
	                }
	                possible_results.add(sum);
	            }
	        }
	    }
	    Collections.sort(possible_results);
	    System.out.println(possible_results.toString());
	    return 1;

	}

}
