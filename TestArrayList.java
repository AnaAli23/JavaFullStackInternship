package CollectionsPrograms;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("Elements in list: ");
		for(Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		System.out.println("------------------------------------\nList : "+ arrayList);
		
	}

}
