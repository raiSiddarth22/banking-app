package com.learning.banking.entity;

import jakarta.persistence.*;
import lombok.*;

// using lombok annotations for getters and setters

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// configuring table
@Table(name="accounts")
// making this class as entity

@Entity

public class Account {

//    fields
    // to make id PRIMARY KEY in our database
    @Id
    // to configure primary key generation strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="account_holder_name")
    private String accountHolderName;
    private double balance;

    public Account(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
