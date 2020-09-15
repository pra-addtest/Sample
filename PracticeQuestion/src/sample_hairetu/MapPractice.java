package sample_hairetu;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>() {
			{
				//    キー　　　値（バリュー）　今回はキーと値共にString型
				put("ドラゴン", "dragon");
				put("勇者", "brave hero");
				put("魔王", "dark king");
			}

		};

		//map変数から「キー」を取り出す。keySet()メソッド
		for (String string : map.keySet()) {
			System.out.println(string + ":" + map.get(string));
		}
		//mapから「値（バリュー）を取り出す方法」
		for (String val : map.values()) {
			System.out.println(val);
		}
		//map変数から「キー」と「バリュー」の両方を取り出す。
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		//map変数から指定した「キー」と一致した値がある場合はtrueを返す。
		//map変数から指定した「値（バリュー）」と一致した値がある場合はtrueを返す。

		System.out.println(map.containsKey("ドラゴン"));
		System.out.println(map.containsValue("brave hero"));

		//map変数に格納されている要素数を調べる。＊今回は３個と表示される。
		if (!map.isEmpty()) {
			System.out.println("要素数は" + map.size() + "個です。");

		}
		//map変数から要素を削除する。＊「キー」がドラゴンの要素を削除
		map.remove("ドラゴン");
		System.out.println(map);
		//map変数の要素をすべて削除
		map.clear();
		System.out.println(map);

	}
}
