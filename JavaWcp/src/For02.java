
public class For02 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		// for (型 変数名：配列やコレクションの変数) {
		// 拡張for文:
		// 配列の要素を順番にnumberに代入し、要素分繰り返す
		for (int number : array) {
			// ブロック（繰り返し処理）
			// ブロック：numberを出力
			System.out.println("For02 = " + number);
		}
	}

}
