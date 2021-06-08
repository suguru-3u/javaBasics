package claenJava;

public class Acount {
	private String acountNo;
	private int zandaka;
	private AccountType accountType;
	
	public Acount(String aNo,AccountType aType) {
		
	}
	
	public enum AccountType{
		FUTUU,TOUZA,TEIKI;
	}
}
