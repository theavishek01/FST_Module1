public class BankAccount {
    private Integer balance;

    // Create a constructor
    public BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}