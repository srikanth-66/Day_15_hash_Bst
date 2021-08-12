package Classes;

import java.util.List;

public class UC1 {

	public String[] splitString(String str) {
		String[] split = str.toLowerCase().split(" ");
		return split;
	}

	public static void add(int occurence, Object obj) {
		List<Integer> stringList = (List<Integer>) obj;

		stringList.add(occurence);
	}

	public static void print(Object o, String split) {
		List<Integer> obj = (List<Integer>) o;
		System.out.print("Key no " + split + " => ");
		System.out.println(obj.toString());
	}
}
