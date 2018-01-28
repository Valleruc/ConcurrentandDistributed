import java.util.concurrent.RecursiveAction;

public class quickSort extends RecursiveAction {
	
	int[] array;
	int start;
	int end;
	
	public quickSort(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;		
	}
	
	@Override
	protected void compute() {
		if ((end - start + 1) <= 16) {
			insertionSort();
		}
		
		else if (start < end) {
			int partitioned = partition(array, start, end);
			invokeAll(new quickSort(array, start, (partitioned - 1)),
					  new quickSort(array, (partitioned + 1), end));
		}
	}
	
	public int partition(int[] A, int startIndex, int endIndex) {
		int pivot = A[endIndex];
		int i = startIndex - 1;
		
		for(int j = startIndex; j < endIndex; j++) {
			if(A[j] <= pivot) {
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		int temp = A[i+1];
		A[i+1] = A[endIndex];
		A[endIndex] = temp;
		
		return (i+1);
	}
	
	public void insertionSort() {
		for(int j = 1; j < array.length; j++) {
			for(int i = j; i > 0; i--) {
				if(array[i] < array[i-1]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
				else break;	
			}
		}
	}
	
	public int[] getSortedArray() {
		return array;
	}
	
	/*
	 * For testing purposes
	 */
	public void printArray() {
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		System.out.println(" ");
	}
}




