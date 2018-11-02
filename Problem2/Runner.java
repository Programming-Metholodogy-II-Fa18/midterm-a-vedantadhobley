package dataStructures;

public class Runner {

	public static void main(String[] args) {

		Data problem2 = new Data();
		
		problem2.add(1);
		problem2.add(9);
		problem2.add(4);
		problem2.add(5);
		problem2.add(10);
		problem2.add(0);
		
		System.out.println("getValue(0): " + problem2.getValue(0));
		System.out.println("getValue(3): " + problem2.getValue(3));
	}

}
