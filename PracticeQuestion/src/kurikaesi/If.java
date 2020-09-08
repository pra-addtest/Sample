package kurikaesi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If {

	public static void main(String[] args) throws IOException {
		//for(初期化の式；　繰り返すかどうか調べる式；　変化のための式３)
//		文；

//やさJava　P１４９
		//Sample1
		for(int i=1; i<=5; i++) {
			System.out.println("繰り返しています。");

		}
		System.out.println("繰り返しが終わりました。");

		//Sample2
		for(int i=1; i<=5; i++) {
			System.out.println(i + "番目の繰り返しです。");
		}
		System.out.println("繰り返しが終わりました。");

			//Sample3
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String atai = bReader.readLine();
		int num = Integer.parseInt(atai);
		int sum = 0;

//		for(int i=1; i<=num ; i++) {
//			System.out.println(num + "回繰り返す");
//		}
		//Sample4
		//出力された回数を変数に格納して、その変数の回数だけ繰り返す処理
		for(int i=1; i<=num ; i++) {
			sum += i;
		}
		System.out.println("１から"+ num + "までの合計は" + sum + "です。");


	}





}
