import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     *
     * @param name s
     * @param accountCategory s
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }
//
    /**
     *
     * @return s
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
//
    /**
     *
     * @return s
     */
    public double getAccountBalance() {
        return accountBalance;
    }
//
    /**
     *
     * @return s
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @return s
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @return s
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param x s
     */
    public void setAccountBalance(final double x) {
        this.accountBalance = x;
    }

    /**
     *
     * @param accountNumber s
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     *
     * @param accountType s
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }
    /**
     *
     * @param interestEarned s
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
    /**
     *
     * @param interestRate s
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     *
     * @param ownerName s
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }
}
