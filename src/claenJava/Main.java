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
//	    String str = "文字列１,String Two,あいう";
//	    String[] strs = str.split(",");
//	    System.out.println(String.format("分割前の文字列:%s",str));
//	    for(int i = 0 ; i <strs.length;i++) {
//	    	 System.out.println(String.format("分割後 %d 個目の文字列 -> %s", i+1, strs[i]));
		
		
//		Book book1 = new Book("Java入門","2011-10-07","aaa");
//		Book book2 = new Book("Java入門","2011-10-07","aaa");
//		Book book3 = new Book("Java入門","2011-10-07","aaa");
//		
//		
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
//		ArrayList<Book> books = new ArrayList<>();
//		
//		
//		
//		Book book1 = new Book();
//		book1.setTitle("Java入門");
//		
//		try {
//		    book1.setPublishDate(f.parse("2031/10/07"));
//		    } catch (ParseException e) {
//		    e.printStackTrace();
//		    }
//		
//		book1.setComment("すっきりわかる");
//		books.add(book1);
//		
//		Book book2 = new Book();
//		book2.setTitle("python入門");
//		
//		try {
//		    book2.setPublishDate(f.parse("2019/6/11"));
//		    } catch (ParseException e) {
//		    e.printStackTrace();
//		    }
//		book2.setComment("カレーが食べたくなる");
//		books.add(book2);
//		
//		Book book3 = new Book();
//		book3.setTitle("c言語入門");
//		
//		try {
//		    book3.setPublishDate(f.parse("2018/6/21"));
//		    } catch (ParseException e) {
//		    e.printStackTrace();
//		    }
//		book3.setComment("ポインタも自由自在");
//		books.add(book3);
//		
//		Collections.sort(books);
//		
//	    for(Book a : books) {
//	    	System.out.println(a.getTitle());
//	    }
		
//		String str = "English日本語aBc";
//		System.out.println(String.format("切り出し前の文字列 ： %s", str));
//		System.out.println("英小文字を大文字に変換 -> " + str.toUpperCase());
//		System.out.println("英大文字を小文字に変換 -> " + str.toLowerCase());
		
//		String str = "ab漢字cDディーＥＦGＨＩＪzZ!$&";
//	    System.out.println(str);
//	    StringBuilder sb = new StringBuilder();
//	    for(int i = 0; i < str.length(); i ++) {
//	    	char c = str.charAt(i);
//	    	if('a' <= c && c <= 'z') {
//	    		c = (char)(c - 'a' + 'a');
//	    	}else if ( 'A' <= c && c <= 'Z') {
//	            c = (char)(c - 'A' + 'Ａ');
//	        }
//	        sb.append(c);
//	      }
//	      System.out.println(sb);
//	      
//	      
//	      String str2 = "ａｂ漢字ｃＤディーefＧＨＩJｚＺ!$&";
//	      System.out.println("変換前：" + str2);
//	      StringBuilder sb2 = new StringBuilder();
//	      for (int i = 0; i < str.length(); i++ ) {
//	        char c = str2.charAt(i);
//	        if ( 'ａ' <= c && c <= 'ｚ') {
//	          c = (char)(c - 'ａ' + 'a' );
//	        } else if ( 'Ａ' <= c && c <= 'Ｚ') {
//	          c = (char)(c -  'Ａ' + 'A' );
//	        }
//	        sb2.append(c);
//	      }
//	      System.out.println("変換後：" + sb2.toString());
	    
	}
}
