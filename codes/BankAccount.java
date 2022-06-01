package codes;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class BankAccount {
    private String name;        // cannot change once set
    private String accNum;      // cannot be changed
    private Float balance;
    private List<String> transactions = new LinkedList<>();
    private Integer startDate;
    private Integer endDate;
    private Boolean isOpen = false;
    private Integer amt;
    //private Integer deposit;


    // constructor
    public BankAccount() {
        System.out.println("Accessing account");
        UUID id = UUID.randomUUID();
        String idAsString = id.toString();
        setAccNum(idAsString.substring(0, 8));
        System.out.println(idAsString.substring(0, 8));

    }
    public BankAccount(String name) {
        this.balance = (float) 0;
        isOpen = true;
    }

    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance =  (float) 0;
        System.out.printf("New account created for %s\n", name);
    }

    // getter & setter
    public String getName() {
        //System.out.printf("New account created for %s\n", name);
        return name;
    } /*
    public void setName(String name) {
        this.name = name;
    } */

    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public Float getBalance() {
        balance += amt;
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

    // methods

    public void deposit(Integer amt) {
        if (amt > 0 && !isOpen) {
            setBalance(balance + amt);
            transactions.add("deposit " + amt +" at " + (System.currentTimeMillis()/1000));
        } else {
            System.err.println("IllegalArgumentException");
        }
    }
    
    public void withdraw(Integer amt) {
        if (amt > 0 && isOpen) {
            balance += amt;
            transactions.add("withdraw " + amt +" at " + (System.currentTimeMillis()/1000));
        } else {
            System.err.println("IllegalArgumentException");
        }
    
    }  
}
