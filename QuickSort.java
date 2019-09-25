public class QuickSort implements SortingAlgorithm {

	public void sort(int [] a){
		sort(a, 0, a.length - 1);
	}

	public void sort(int [] a, int low, int high){

		if (low < high){
			int index = part(a, low, high);


			sort(a, low, index - 1);
			sort(a, index + 1, high);
		}
	}

	public int part(int [] a, int low, int high){

		int pivot = a[high];
		int i = (low - 1);

		for(int j = low; j < high; j++){
			if (a[j] < pivot){
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}
}