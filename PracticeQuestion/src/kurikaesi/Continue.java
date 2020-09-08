package kurikaesi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continue {

	public static void main(String[] args) throws IOException {
		//Sample11
		System.out.println("何番目に処理を飛ばしますか？");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String string = bReader.readLine();
		int res = Integer.parseInt(string);

		for(int i= 1; i<=10 ; i++) {
			if(i==res)
				continue;
			//入力した回数目では、繰り返し内の処理を飛ばす。
			System.out.println(i + "番目の処理です。");
		}

	}

}
