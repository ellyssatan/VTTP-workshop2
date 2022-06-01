package codes;

import java.util.List;

public class BankAccount {
    private String name;        // cannot change once set
    private String accNum;      // cannot be changed
    private Float balance;
    private List<String> transactions;
    private Integer startDate;
    private Integer endDate;
    private Boolean isOpen = false;
    //private Integer deposit;


    // constructor
    public BankAccount() {
        System.out.println("Accessing account");
    }
    public BankAccount(String name) {
        this.balance =  (float) 0;
    }

    public BankAccount(String name, float balance) {
        balance =  (float) 0;
    }

    // getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public Float getBalance() {
        return balance;
    }
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public Integer getStartDate() {
        return startDate;
    }
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }
    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    
    
}
