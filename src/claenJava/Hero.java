package claenJava;

public class Hero {
	public String name;
	public int hp;
	
//	public Hero(String string, int i) {
//		// TODO 自動生成されたコンストラクター・スタブ
//		this.name = string;
//		this.hp = i;
//	}

//	文字列返し
	public String toString() {
		return "勇者(名前 = " + this.name + "/HP = " + this.hp + ")";
	}
	
//	等価判定
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;
		Hero r = (Hero)o;
		if(!this.name.trim().equals(r.name.trim())) {
			return false;
		}
		return true;
	}
}
