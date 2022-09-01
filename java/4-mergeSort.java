import java.util.Scanner;

public class Program {

	static void print(int[] v) {
		for(int el: v)
			System.out.print(el + " ");
		System.out.println();
	}

	static void merge(int[] v, int start, int end) {
		int[] t = new int[end - start + 1];
		int i, j, k, mid;
		mid = start + (end - start) / 2;
		i = start;
		j = mid + 1;
		k = 0;

		while (i <= mid && j <= end) {
			if(v[i] < v[j]) {
				t[k] = v[i];
				++i;
			} else {
				t[k] = v[j];
				++j;
			}
			++k;
		}

		while(i <= mid) {
			t[k] = v[i];
			++i; ++k;
		}

		while(j <= end) {
			t[k] = v[j];
			++j; ++k;
		}

		for(i = start; i <= end; ++i) 
			v[i] = t[i - start];
	}

	static void mergeSort(int[] v, int start, int end) {
		if(start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(v, start, mid);
			mergeSort(v, mid + 1, end);
			merge(v, start, end);
		}
	}

	public static void main(String[] args) {
		int[] v = {3, 1, 5, 2, 4};
		print(v);
		mergeSort(v, 0, (int) v.length - 1);
		print(v);
	}
}