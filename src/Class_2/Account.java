package Class_2;

public class Account {
    double balance = 0;

    public double getBalance() {
        return balance;
    }

    //encapsulation protects variables from
    //outsiders who don't understand how this
    //class should be used

    public void setBalance(double balance) {
        if (balance < 0) return;
        this.balance = balance;
    }
}
