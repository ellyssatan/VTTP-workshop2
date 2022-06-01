package codes;

public class FixedDepositAccount extends BankAccount {
    private Float interest;
    private Integer months;


    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    @Override
    public void deposit(Integer amt) {
        System.out.printf("Deposited %d\n", amt);
    }

    @Override
    public void withdraw(Integer amt) {
        System.out.printf("Withdrew %d\n", amt);
    }

    public Float getBalance() {
        System.out.printf("Balance is: %d\n", interest + getBalance());
        return interest;
    }
}
