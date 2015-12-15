package bankClasses;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BankConnector {

	public BankConnector(){
		
	}
	public void SendDirectDebitAuthorisation(BankAcountData bankAcount){
		
	}
	public Double getAcountBalance(BankAcountData bankAcount){
		Random acountBalanceGenerator = new Random();
		Double balance = (double) ((acountBalanceGenerator.nextInt(480)+20)+acountBalanceGenerator.nextInt(100)/100);
		return balance;
	}
	public BankAcountAction[] getAcountActions(BankAcountData bankAcount){
		Random randomGenerator = new Random();
		int numberOfActions = randomGenerator.nextInt(5);
		BankAcountAction[] bankActions = new BankAcountAction[numberOfActions+1];
		for(int i=0;i<=numberOfActions;i++){
			bankActions[i]=CreateRandomBankAcountAction();
		}
		return bankActions;
	}
	private BankAcountAction CreateRandomBankAcountAction(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
		Double actionSum = actionAmount();
		BankAcountAction randomAction = new BankAcountAction(date, actionSum, randomUsage(actionSum));
		return randomAction;
	}
	private String randomUsage(Double amount){
		Random usageNumber = new Random();
		int actionUsage = usageNumber.nextInt(2);
		if(amount<0){
			switch(actionUsage){
			case 0: return "Steuer-nachzahlungen";
			case 1: return "Stromkostenabrechnung";
			default:return "Anwaltskosten";
			}
		}else{
			switch(actionUsage){
			case 0: return "Lohnauszahlung";
			case 1: return "Kindergeld";
			default:return "Gewinnauszahlung";
			}
			
		}
	}
	private Double actionAmount(){
		Random acountBalanceGenerator = new Random();
		Double balance = (double) ((acountBalanceGenerator.nextInt(480)+20)+acountBalanceGenerator.nextInt(100)/100);
		if(acountBalanceGenerator.nextInt(3)>0){
			return balance;
		}
		return balance - balance * 2;
	}
}
