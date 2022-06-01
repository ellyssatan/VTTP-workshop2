package codes;

public class AnsFixedDepositAccount extends AnsBankAccount{
    private float interest = 0;
    private int duration = 0;

    public AnsFixedDepositAccount(String name, float initialBal) {
        // call parents class default constructor
        //super must be first line in constructor
        //super(name, initialBal);

    }
    public AnsFixedDepositAccount(String name, Float balance, Float interest) {
        // call parent's class default constructor
        super(name, initialBal);
        this.interest = interest;

    }
    
    public AnsFixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
        super(name, initialBal, initialBal);
        this.duration = duration;

    }

    @Override
    public Float getBalance() {
        // parents' balance
        return (float) (super.getBalance() * .1);
    }
}
