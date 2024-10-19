package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;//趣味

	//引数ありのコンストラクタ
	public Human(String name , int years , String hobby) {
		super(name , years);//スーパークラスのコンストラクタ)
		this.hobby = hobby;

	}

	//thinkメソッドの実装
	public void think() {
		System.out.println("私は" + hobby + "について考えています。");
		}

}
