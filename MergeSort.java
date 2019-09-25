public class MergeSort implements SortingAlgorithm {

	public void sort(int [] a){
		sort(a, 0, a.length - 1);
	}

	public void sort(int a[], int left, int right){
		if(left < right){
			int mid = (left + right) / 2;
			sort(a, left, mid);
			sort(a, mid + 1, right);

			merge(a, left, mid, right);
		}

	}

	public void merge(int a[], int l, int m, int r){

		int L[] = new int [m - l + 1];
		int R[] = new int [r - m];

		for (int i = 0; i < m - l + 1; i++){
			L[i] = a[l + i];
		}
		for (int j = 0; j < r - m; j++){
			R[j] = a[m + 1+ j];
		}

		int i = 0, j = 0;
		int k = l;

		while (i < m - l + 1 && j < r - m){
			if (L[i] <= R[j]){
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}

			k++;
		}

		while (i < m - l + 1) {
			a[k] = L[i]; 
			i++;
			k++;
		}
	}
}