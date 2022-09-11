package Class_2;

public class BankOfQC {
    double amountOwed;
    public double getAccountOwed(){
        return amountOwed;
    }


    //abstracting the business logic into a method
    //and hiding the complexity
    public boolean approved(){
        CreditScore creditScore = new CreditScore();
        return getAccountOwed() <= 400 && creditScore.score() >= 600;
    }
}
