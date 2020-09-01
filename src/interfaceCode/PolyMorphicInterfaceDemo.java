package interfaceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PolyMorphicInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		arr.add(5);
		arr.add(10);
		arr.remove(5);
		// arr.ensureCapacity(15);
		arr.isEmpty();
		for (int a : arr) {
			System.out.println(a);
		}
		LinkedList<Integer> arr1 = new LinkedList<>();
//
//		RetailItems item1 = new DvdMovie();
//		List<Integer> list = new LinkedList<Integer>();
//		list.add(5);
//		list.add(10);
//
//		// RetailItems item2 = new DvdMovie();
//		System.out.println(item1.price() + "");
//		if (item1 instanceof DvdMovie) {
//			System.out.println(((DvdMovie) item1).movieName()); // error here!!
//		}
	}

}

interface RetailItems {
	int price();
}

class CompactDisc implements RetailItems {

	public int price() {
		return 50;
	}
}

class DvdMovie implements RetailItems {
	public int price() {
		return 70;
	}

	public String movieName() {
		return "spiderman";
	}
}