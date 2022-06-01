package codes;

public class Account {
    public static void main(String[] args) {
        BankAccount memberOne = new BankAccount("ben", 0);
        //memberOne.setName("benny");
        memberOne.getName();
        //memberOne.setAccNum(accNum);
        memberOne.deposit(900);
        memberOne.withdraw(900);
        //memberOne.getAccNum();
        //memberOne.getTransactions();
        //memberOne.deposit(900);



        //FixedDepositAccount stan = new FixedDepositAccount();
        //stan.getBalance();


    }
}
