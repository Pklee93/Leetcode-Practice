import java.util.Collections;

public class Solution {

	public double findMedianSortedArrays(int[] num1, int[] num2) {
		int length = num1.length + num2.length;
		int[] combine = new int[length];
		int index = 0;
		for (int i = 0; i < num1.length; i++) {
			combine[index++] = num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			combine[index++] = num2[i];
		}
		sort(combine, 0, length - 1);
		
		if (length % 2 == 0) {
			int targetIndex = (length / 2) - 1;
			double answer = ((double)combine[targetIndex] + (double)combine[targetIndex + 1]) / 2;
			return answer;
		} else {
			int targetIndex = length / 2;
			double answer = combine[targetIndex];
			return answer;
		}
	}
	
	private void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
	
	private void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

}
