package hello;


	import java.util.Arrays;
	public class zigzag {
	    public static void main(String[] args) {
	        int[] arr = {4, 3, 7, 8, 6, 2, 1};
	        int n = arr.length;

	        // Sort the array
	        Arrays.sort(arr);

	        // Swap adjacent elements pairwise starting from the second element
	        for (int i = 1; i < n - 1; i += 2) {
	            int temp = arr[i];
	            arr[i] = arr[i + 1];
	            arr[i + 1] = temp;
	        }

	        // Print the wave array
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

