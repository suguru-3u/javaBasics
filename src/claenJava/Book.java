package claenJava;
import java.util.Date;
import java.util.Objects;


public class Book implements Comparable<Book> ,Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
//	public Book(String a, Date b, String c) {
//		this.title = a;
//		this.publishDate = b;
//		this.comment = c;
//	}


	//	等値
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b  = (Book)o;
		if(!publishDate.equals(b.publishDate)) {
			return false;
		}
		if(!title.equals(b.title)) {
			return false;
		}
		return true;
	}
	
//	Hash系対策
	public int hashCode() {
		return Objects.hash(this.title,this.publishDate,this.comment);
	}
	
//	序列
	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}
	
//	複製
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setTitle(String o) {
		this.title = o ;
	}
	
	public void setPublishDate(Date o) {
		this.publishDate = o;
	}
	
	public void setComment(String o) {
		 this.comment = o;
	}
	
//	a
//	aaa
}


