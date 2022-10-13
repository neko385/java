
public class DivisionOperation2 {
	public static void main(String args[]) {
		int num1 = 6;
		int num2 = 5;
		
		double ans = (double) num1 / num2;
		/* 計算結果として小数が格納できるように、ansの変数をdoubleに変更。
		   割り算を行っている右辺の「（double）num1」の記述は、
		   変数の前に(double)と（）付で型を書いている。この書き方で、
		   整数型だったnum1が小数型に変換される。この方法をキャストという。
		 */
		
		System.out.println(ans);
		
	}

}
