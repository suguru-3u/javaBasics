package claenJava;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		String str1 = "文字列1";
//		String str2  = "文字列2";
//		String str = str1 + str2;
//		System.out.println("演算子による文字列の連結->"+ str)	;
		
//		String str1 = "文字列1";
//		String str2  = "文字列2";
//		String str = str1.concat(str2);
//		System.out.println("演算子による文字列の連結->"+ str)	;
		
//		String str1 = "文字列1";
//		String str2  = "文字列2";
//		StringBuffer sb = new StringBuffer();
//		sb.append(str1);
//		sb.append(str2);
//		String str = sb.toString();
//		System.out.println("演算子による文字列の連結->"+ str)	;
		
//		String str = "123456789";
//		System.out.println(String.format("取り出した文字列",str));
//		System.out.println("取り出した文字列" + str.substring(0,3));
//		System.out.println("取り出した文字列" + str.substring(0,7));
		
		// 指定した文字より後ろの文字取り出し
//	    String str = "氏名：山田太郎";
//	    int index = str.indexOf(":");
//	    System.out.println("取り出した文字列" + str.substring(index+1));
//		
//	    str = "氏名->山田太郎";
//	    index = str.indexOf("->");
//	    index += "->".length();
//	    System.out.println("取り出した文字列" + str.substring(index));
//	    
	    String str = "文字列１,String Two,あいう";
	    String[] strs = str.split(",");
	    System.out.println(String.format("分割前の文字列:%s",str));
	    for(int i = 0 ; i <strs.length;i++) {
	    	 System.out.println(String.format("分割後 %d 個目の文字列 -> %s", i+1, strs[i]));
	    }
	}
}
