import java.util.concurrent.RecursiveAction;

public class ConcurrentMerge extends RecursiveAction {
	private int[] A;
	private int[] B;
	private int[] splitA;
	private int[] splitB;
	
	public ConcurrentMerge(int[] A, int[] B, int[] splitA, int[] splitB) {
		this.A = A;
		this.B = B;
		this.splitA = splitA;
		this.splitB = splitB;
	}
	
	/*
	 * compute() should recursively call splitArrayB (aka binary search) to ensure that array B is divided
	 * correctly. Once the array is divided correctly, it can go ahead and merge.
	 * This is where you would use the invokeAll() method from ForkJoinPool
	 */
	@Override
	protected void compute() {
		
	}
	
	/*
	 * You might need to pass an index into this method. Just to keep track of which parts of 
	 * array B have already been divided.
	 */
	void splitArrayB() {
		
	}
	
	/*
	 * Merge A and B into C 
	 * I think this can be called directly from the splitArrayB() method.
	 */
	void mergeAB() {
		
	}
	
}