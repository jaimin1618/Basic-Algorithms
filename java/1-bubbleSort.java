import java.util.*;

public class Program {

	static void print(int v[]) {
		final int N = v.length;
		for(int el: v) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

	static void bubbleSort(int v[]) {
		final int N = v.length;

		for(int i = 0; i < n - 1; ++i) {

			boolean swapped = false;
			for(int j = 0; j < n - i - 1; ++j) {
				if(v[j] > v[j + 1]) { 
					// swapping
					int t = v[j];
					v[j] = v[j + 1];
					v[j + 1] = t;
					swapped = true;
				}
			}

			if(!swapped) 
				break;
		}

	}

	public static void main(String[] args) {
		int[] v = {3, 1, 5, 2, 4};
		print(v);
		bubbleSort(v);
		print(v);
	}
}