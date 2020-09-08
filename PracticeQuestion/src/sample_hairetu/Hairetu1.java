package sample_hairetu;

public class Hairetu1 {
public static void main(String[] args) {
	int[] test = new int[5];
	test[0] = 80;
	test[1] = 90;
	test[2] = 70;
	test[3] = 60;
	test[4] = 50;
//		i=0にしているのは配列のインデックスが０からのため
	for(int i =0; i<5 ; i++) {
		//(i+1)にする理由はi=0で初期化しているため
		System.out.println((i+1)+"番目のひとの点数は"+test[i]+"です");

	}
}
}
