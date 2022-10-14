
public class DivisionOperation1 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 5;
		
		int ans = num1 / num2;
		
		System.out.println(ans);
		// 正解は「1.2」だが変数の方が整数型になっているため、小数は扱えず実行結果が「１」になる
	}

}
