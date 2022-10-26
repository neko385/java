
public class IfStatement2 {
	public static void main(String[] args) {
		/* 
		 * 乱数を発生させるコードは「 Math.random() 」と記述する
		 * ここで発生する乱数は0以上１未満の小数値です。そのためそれを
		 * １００倍し、「　100 * Math.random() 」とする。
		 */
		int num = (int) (100 * Math.random()) + 1;
		System.out.println("現在の値：" + num);
		if(num <= 40) {
			System.out.println("数値は40以下です。");
		}
		System.out.println("処理終了！");
	}

}
