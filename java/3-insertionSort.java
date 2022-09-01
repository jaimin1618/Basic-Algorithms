import java.util.Scanner;

public class Program {
	static void print(int[] v) {
		for(int el: v) 
			System.out.print(el + " ");
		System.out.println();
	}

	static void insertionSort(int[] v) {
		final int N = v.length;
		
		int j, key;
		for(int i = 1; i < N; ++i) {
			key = v[i];
			j = i - 1;

			while(j >= 0 && v[j] > key) {
				v[j + 1] = v[j];
				--j;
			}

			v[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] t = {3, 1, 2, 5, 4};
		print(t);
		insertionSort(t);
		print(t);
	}
}