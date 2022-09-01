import java.util.Scanner;

public class Program {
	static void print(int[] v) {
		for(int el: v) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

	static void selectionSort(int[] v) {
		final int N = v.length;

		for(int i = 0; i < n; ++i) {
			int minIdx = i;

			for(int j = i + 1; j < n; ++j) {
				if(v[j] < v[minIdx]) {
					minIdx = j;
				}
			}

			if(i != minIdx) {
				int t = v[i];
				v[i] = v[minIdx];
				v[minIdx] = t;
			}
		}
	}

	public static void main(String[] args) {
		int[] t = {3, 1, 5, 2, 4};
		print(t);
		selectionSort(t);
		print(t);
	}
}