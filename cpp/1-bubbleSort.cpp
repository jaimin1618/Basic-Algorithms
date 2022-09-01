#include<bits/stdc++.h>
using namespace std;

void print(vector<int>& v);

void bubbleSort(vector<int>& v) {
	const int n = (int) v.size();

	for(int i = 0; i < n - 1; ++i) {
		bool swapped = false;
		for(int j = 0; j < n - i - 1; ++j) {
			if(v[j] > v[j + 1]) {
				swap(v[j], v[j + 1]);
				swapped = true;
			}
		}

		if(!swapped)
			break;
	}
}

int main() {
	vector<int> t {3, 1, 5, 2, 4};
	print(t); 
	bubbleSort(t);
	print(t);

	return 0;
}

void print(vector<int>& v) {
	for(auto& el: v) cout << el << ' ';
	cout << '\n';
}