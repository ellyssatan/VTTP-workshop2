package codes;

import java.util.*;

public class AnsBankAccount {
    private String name = "";        // cannot change once set
    private String accNum = UUID.randomUUID().toString().substring(0, 8);  // cannot be changed, random
    private Float balance = 0f; // initiated to 0
    private List<String> transactions = new LinkedList<>();     // must initialise, if not will be null
    private Integer startDate;
    private Integer endDate;
    private Boolean isOpen = false;
    private Integer amt;
    
    // constructors
    public AnsBankAccount() {}
    public AnsBankAccount(String name) {
        this.name = name;
    }

    public AnsBankAccount(String name, float initialBal) {
        this.name = name;
        this.balance = initialBal;
    }
    

    // getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccNum() {
        return accNum;
    }
    /*public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    */
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
    public Boolean getIsOpen() {
        return isOpen;
    }
    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }
    public Integer getAmt() {
        return amt;
    }
    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    







}
