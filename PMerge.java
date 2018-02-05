public class PMerge{
	public static int parallelMerge(int[] A, int[] B, int[] C, int numThreads) {
		int[] splitA = new int[numThreads];
		int[] splitB = new int[numThreads];
		
		splitA = splitArrayA(A, splitA);
		ConcurrentMerge CM = new ConcurrentMerge(A, B, splitA, splitB);
				
		return 0; // temporary return
	}
	
	/*
	 * This method should take in array A and enter in the
	 * LAST index of each "subarray" into dividedA. For instance:
	 * 
	 * dividedA[0] contains the last index of array A that thread0 would 
	 * process (so it would look at the range:= 0 to dividedA[0] inclusive)
	 */
	static int[] splitArrayA(int[] A, int[] dividedA) {
		
		return dividedA;
	}
	
	
}