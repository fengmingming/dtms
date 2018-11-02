package dtms.transaction;

public enum TransactionStatus {

	NEW(1, "newTransaction"),
	CONFIRMING(2, "confirming"),
	CANCELING(3, "canceling"),
	CONFIRM(4, "confirm"),
	CANCEL(5, "cancel"),
	EXCEPTION(6, "exception");
	
	private int status;
	private String name;
	
	TransactionStatus(int status,String name) {
		this.status = status;
		this.name = name;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public String getName() {
		return this.name;
	}
	
}
