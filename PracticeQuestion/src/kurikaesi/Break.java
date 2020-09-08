package kurikaesi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Break {

	public static void main(String[] args) throws IOException {
		//Sample9
//		System.out.println("何番目でループを終了しますか(1-10)");
//		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
//		String string = bReader.readLine();
//		int res = Integer.parseInt(string);
//
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+ "番目の処理です。");
//			if(i == res )
//				break;
//		}
		//Sample10
		System.out.println("成績を入力してください（１～５）");
		BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));
		String string = brReader.readLine();
		int res = Integer.parseInt(string);

		switch (res) {
		//case のあとは値が入る。今回はresで入力された数字が入る。
		//↓　1が入力された場合は case 1 に行く
		case 1:
		case 2:
			System.out.println("もう少し頑張りましょう");
			break;
		case 3:
		case 4 :
			System.out.println("この調子で頑張りましょう");
			break;
		case 5 :
			System.out.println("大変優秀です");
			break;
			//p129 switchの条件にどれも当てはまらなかった場合のゴール
			default:
				System.out.println("1-5までの成績を入力してください。");
		}

	}

}
