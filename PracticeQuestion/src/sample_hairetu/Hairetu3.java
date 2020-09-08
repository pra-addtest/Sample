package sample_hairetu;

public class Hairetu3 {

	public static void main(String[] args) {
		// やさJavaP191 sample4
		//配列の初期化(この場合は要素数が自動的に５になるので注意！)
		int[] test = {60,80,50,36,42};
		//
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"番目の人の点数は" + test[i]+"です");

		}

	}

}
