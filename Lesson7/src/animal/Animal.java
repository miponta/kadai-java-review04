package animal;

public class Animal {
	//フィールド

	private String name;//名前
	private int years;//年齢



	//引数ありのコンストラクタ
	public Animal(String name,int years) {
		this.name = name;
		this.years = years;
	}

	//sayメソッドの定義
	public void say() {
		System.out.println(name + "です。" + years + "歳です。");
	}

}
