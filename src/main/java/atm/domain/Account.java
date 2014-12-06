package atm.domain;

public class Account {

	private String accountId;
	private Double balance;

	Account(String id) {
		this.accountId = id;
		this.balance = 0.0;
	}

	public Double getBalance() {
		return new Double(balance);
	}

	public void setBalance(Double balance) {
		this.balance = new Double(balance);
	}

	public String getAccountId() {
		return accountId;
	}

}

