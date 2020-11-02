package com.cardinfo.web.entities;

public class DebitCardInfo {
	private String cardnumber; 
    private String cardexpiry; 
    private String balance;
    private String status;
    // Parameterized Constructor to set Student 
    // name, age, course enrolled in. 
    public DebitCardInfo(String n, String e, String b, String s) 
    { 
        this.cardnumber = n; 
        this.cardexpiry = e; 
        this.balance = b;
        this.status = s;
    } 
    // Setter Methods to set table data to be 
    // displayed 
    public String getNumber() { return cardnumber; } 
    public String getExpiry() { return cardexpiry; } 
    public String getBalance() { return balance; } 
    public String getStatus() { return status; } 

}
