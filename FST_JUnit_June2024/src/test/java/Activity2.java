import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    void notEnoughFunds() {

        BankAccount account = new BankAccount(9);
        
        assertThrows(NotEnoughFundException.class, () -> account.withdraw(10));
    }
    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);

        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}
