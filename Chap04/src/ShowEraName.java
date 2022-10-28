
public class ShowEraName {
	public static void main(String[] args) {
		int year = (int) (100 * Math.random()) +1901;
		/* if(条件1) {
		 *  条件に合致した時に行う処理
		 * }
		 * else if(条件2) {
		 *  条件2に合致した時に行う処理
		 * }
		 * else {
		 *  それ以外の時に行う処理
		 * }
		 * 複数の条件を記述し、それぞれの条件に合致した時に異なる処理を実行する。
		 * それ以外の時にも、別の処理を実行できる。
		 * 条件が複数ある場合は条件１から順番に判定していくため、条件を記述する順序を意識する。
		 */
		
		if(year < 1912) {
			System.out.println(year + "年は明治です。");
		}
		else if(year < 1926) {
			System.out.println(year + "年は大正です");
		}
		else if(year < 1989) {
			System.out.println(year + "年は昭和です。");
		}
		else {
			System.out.println(year + "年は平成です。");
		}
	}

}
