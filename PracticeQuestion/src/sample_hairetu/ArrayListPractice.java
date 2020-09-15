package sample_hairetu;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("Windows");
				add("Linux");
				add("macOS");
			}
		};

		for (String str : list) {
			System.out.println(str); // 結果：Windows、Linux、macOS
		}
		//get()の中の値は要素数！
		System.out.println("2番目の要素は" + list.get(1));
		// 結果：2番目の要素はLinux
		System.out.println(list.contains("Linux")); // 結果：true

		if (!list.isEmpty()) {
			System.out.println("要素数は" + list.size() + "個です。");
			// 結果：要素数は3個です。
		}
		// 結果：[Linux, macOS]
		list.remove(0);
		System.out.println(list);

		// 結果：[]
		list.clear();
		System.out.println(list);
	}

}
