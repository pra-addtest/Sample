package kurikaesi;

public class While {

	public static void main(String[] args) {
		//while(条件){
		//文；}
		//for文のSample2と同じ動作する。
//		int i = 1;
//		while (i <=5) {
//			System.out.println(i+ "番目の繰り返し");
//			i++;
//		}
//		System.out.println("繰り返しが終わりました。");

//		//Sample６ do ～ while文
//		do {
//			文；
//		} while (条件);　条件がtrueであれば繰り返す。

//		do {
//			System.out.println(i + "番目の繰り返し");
//			i++;
//		} while (i <=5);
//		System.out.println("繰り返しが終わりました。");


		//Sample7 文のネスト
		//iが０のとき、jは0,1,2です
		//iが１のとき、jは0,1,2です。
		//・・・・・・
		//iが５のとき、jは0,1,2です。となる。
		//iが５回ループして、そのたびにjが３回ループする。
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("iは"+ i + ":jは" + j);
			}
		}

	}



}
