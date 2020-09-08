package sample_hairetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hairetu2 {

	public static void main(String[] args) throws IOException {
		System.out.println("テストの受験者数を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);
		// ↓配列の容量をnum変数にすることで、
//		その数に応じた入れ物を作ることができる
		int[] test = new int[num];

		System.out.println("人数分の点数を入力してください");
//for文のiはインデックス番号の値、
		for(int i=0; i<num ; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp ;
		}
		for(int i =0 ; i<num ; i++) {
			System.out.println((i+1)+"番目の人数は"+test[i]+"です。");

		}
	}

}
