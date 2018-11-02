package dtms.transaction;

/**
 * 事务对象
 * 
 * */
public class DTransaction {

	/**
	 * 事务号
	 * */
	private Long transactionNo;
	
	/**
	 * 事务名称
	 * */
	private String transactionName;
	
	/**
	 * 事务发起者
	 * */
	private DTransactionRequester requester;
	
	/**
	 * 事务状态
	 * @see TransactionStatus
	 * */
	private int status;
	
	/**
	 * 提交对象
	 * @see Confirm
	 * */
	private Confirm confirm;
	
	/**
	 * 回滚对象
	 * @see Rollback
	 * */
	private Cancel cancel;
	
	/**
	 * 父类事务
	 * */
	private DTransaction parent;

	public Long getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(Long transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public DTransactionRequester getRequester() {
		return requester;
	}

	public void setRequester(DTransactionRequester requester) {
		this.requester = requester;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Confirm getConfirm() {
		return confirm;
	}

	public void setConfirm(Confirm confirm) {
		this.confirm = confirm;
	}

	public DTransaction getParent() {
		return parent;
	}

	public void setParent(DTransaction parent) {
		this.parent = parent;
	}

	public Cancel getCancel() {
		return cancel;
	}

	public void setCancel(Cancel cancel) {
		this.cancel = cancel;
	}
	
}
