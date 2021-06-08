package claenJava;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero a = new Hero();
//		a.name = "minato";
//		System.out.println(a);
//		List<Hero> list = new ArrayList();
//		list.add(a);
//		System.out.println(list.size());
//		a = new Hero();
//		a.name = "minato";
//		list.remove(a);
//		System.out.println(list.size());
		
		Pocket<String> p = new Pocket();
		p.put("1112");
		String s = p.get();
		System.out.println(s);
	}

}
