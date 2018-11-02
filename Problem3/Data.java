package dataStructures;

public class Data {
	
//	Node head;
	int size;
	Object[] list;
	
	public Data(){
//		this.head = null;
		this.size = 0;
		list = new Object[1];
	}
	
	public void add(int a){
		if (list.length == size){
			doubleSize();
			add(a);
		} else{
			for (int i=size; i>0; i--){
				list[i] = list[i-1];
			}
			list[0] = a;
			size++;
		}
	}
	
	public int remove(){
		int remove = (int) list[size-1];
		list[size-1] = null;
		size--;
		if (size <= list.length / 2){
			halfSize();
		}
		return remove;
	}
	
	public int getValue(int i){
		if (i < size){
			return (int)list[size - 1 - i];
		} else{
			return -1;
		}
		
	}
	
	public int Problem3(int value){
		for (int i=0; i<list.length; i++){
			System.out.println("COMPARE " + value + " AND " + list[i]);
			if ((int)list[i] == value){
				return i;
			}
		}
		
		return -1;
	}
	
	private void doubleSize(){
		Object[] doubleList = new Object[list.length * 2];
		for (int i=0; i<size; i++){
			doubleList[i] = list[i];
		}
		list = doubleList;
	}
	
	private void halfSize(){
		Object[] halfList = new Object[list.length/2];
		for (int i=0; i<size; i++){
			halfList[i] = list[i];
		}
		list = halfList;
	}
	
	public String toString(){
		String output = "[";
		
		if (list[0] == null){
			output += "null]";
		} else{
			output += list[0];
			for (int i=1; i<list.length; i++){
				if (list[i] == null){
					output += ", null";
				} else{
					output += ", " + list[i];
				}
			}
			output += "]";
		}
		System.out.println("SIZE: " + size);
		return output;
	}
	
}
