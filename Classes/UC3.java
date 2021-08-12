package Classes;

import java.util.List;

public class UC3 {
	public void slotData(String string, Object listObj) {
		List<String> qobj = (List<String>) listObj;
		qobj.add(string);
	}

	public void showSlotedData(Object o, int key) {
		List<Integer> obj = (List<Integer>) o;

		System.out.print("Key no " + key + " => ");
		System.out.println(obj.toString());
//			obj.forEach(x->System.out.print(x+"->"));
//			System.out.println();
	}

	public void searchKey(Object obj, String searchKey, int key) {
		List<Integer> qobj = (List<Integer>) obj;
		if (qobj.contains(searchKey)) {
			System.out.println("Data is Present at " + key + " no");
		} else {
			System.out.println("Data is not present");
		}
	}

	void remove(String string, int i, Object object) {
		List<String> list=(List<String>) object;
		list.remove(i);
	}

}
