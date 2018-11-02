package sorting;

public class Sorting {

	public static void main(String[] args) {
		
		int[] a = {15,9,60,44,12,1,4};
		
		a = ExamSort(a, a.length);
		
		System.out.print("[" + a[0]);
		for (int i=1; i<a.length; i++){
			System.out.print(", " + a[i]);
		}
		System.out.println("]");

	}
	
	public static int[] ExamSort(int[] a, int size){
		for (int i=0; i<a.length-1; i++){
			for (int j=i; j>=0; j--){
				if (a[j] > a[j+1]){
					int swap = a[j];
					a[j] = a[j+1];
					a[j+1] = swap;
				}
			}
		}
		
		return a;
	}

}
