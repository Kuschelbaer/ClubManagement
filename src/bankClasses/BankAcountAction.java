package bankClasses;

import java.util.Date;

public class BankAcountAction {

	Date actionDate;
	Double actionSum;
	String actionUsage;
	public BankAcountAction(Date actionDate, Double actionSum, String actionUsage) {
		super();
		this.actionDate = actionDate;
		this.actionSum = actionSum;
		this.actionUsage = actionUsage;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public Double getActionSum() {
		return actionSum;
	}
	public String getActionUsage() {
		return actionUsage;
	}
}
