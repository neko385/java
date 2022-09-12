package practice;

public class Car {
	// 燃料(Km/L)
	private double fuelCost;
	// 残量(L)
	private double fuelAmount;
	
	// コンストラクタを作成　→　「燃料」「残量」の引数を「double」型で定義する。
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	// moveメソッド → moveメソッドは、「int」型エオ引数にして定義する。「km＋”km走ります」を出力。
	// 残量から走った分の燃料を計算して引き算する
	public void move(int km) {
		System.out.println(km + " km 走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	// fuelAmountを取得するメソッドを作成 → フィールドの「fuelAmount」をreturnする。
	public double getFuelAmount() {
		return this.fuelAmount;
	}
	

}
