package claenJava;

public class Hero {
	private String name;
	private int hp;
	
	public Hero(String string, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = string;
		this.hp = i;
	}

	public String toString() {
		return "勇者(名前 = " + this.name + "/HP = " + this.hp + ")";
	}
}
