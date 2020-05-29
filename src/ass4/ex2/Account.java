package ass4.ex2;

public class Account {

    private double balance;

    public double deposit(double amount) throws InvalidInputException{
        if (amount > 0)
            balance += amount;
        else
            throw new InvalidInputException();
        return balance;
    }
}
