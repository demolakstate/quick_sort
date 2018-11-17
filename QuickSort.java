// A Quick Sort program

public class QuickSort {

	public static void main(String[] args) {
	//int A[] = {5, 3, 1, 9, 8, 2, 4, 7, 1};
	int A[] = {5, 3, 9};

	System.out.print("Initial Array ");
	for (int x : A)
	System.out.print( x + " ");
	System.out.println();

	QuickSort q = new QuickSort();
	
	q.qSort(A, 0, A.length);

	System.out.println();
	System.out.print("Sorted Array ");
	for (int x : A)
	System.out.print( x + " ");


} // end main method

	public int partition(int[] a, int lo, int hi) {
	
	//int lo = 0;
	//int hi = a.length;

	int pivot = a[lo];

	System.out.println("pivot " + pivot);
	int i = lo;
	int j = hi - 1;

	while (i < j) {
	
	System.out.println("i " + i + " j " + j);

	 while (a[i] <= pivot) {
		i++;
	} 

	while (a[j] > pivot) {

	j--;

	}// end while loop for j

	//System.out.println("i " + i + " j " + j);

	if (i < j) {
	// swap values
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;

	for (int x : a)
	System.out.print( x + " ");

} // end if

} // end while loop

	// swap j with pivot
	System.out.println(" while loop exit");
	System.out.println("a[j] " + a[j]);
	int temp = a[lo];
	a[lo] = a[j];
	a[j] = temp;
	System.out.println(" after partitioning ");
	for (int x : a)
	System.out.print( x + " ");

	return j;




} // end method partition


public void qSort(int[] a, int lo, int hi) {

	if (lo < hi) {
	System.out.println("lo " + lo + " hi " + hi);

	int i = partition(a, lo, hi);
	qSort(a, lo, i);
	qSort(a, i + 1, hi);

	} // end if

	//return a;

	


} // end method qSort


} // end class QuickSort