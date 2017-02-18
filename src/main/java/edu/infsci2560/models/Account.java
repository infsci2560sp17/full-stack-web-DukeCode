/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
public class Account {

    private static final long serialVersionUID = 1L;

    public enum AccountType {
        Unknown,
        Deposit,
        Check,
        Cash,
        Loan,
        Stock,
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected double amount;
    protected String provider;
    protected AccountType accountType;

    public Account() {
        this.id = Long.MAX_VALUE;
        this.amount = 0;
        this.provider = null;
        this.accountType = AccountType.Unknown;
    }

    public Account(long id, double amount, String provider, AccountType accountType) {
        this.id = id;
        this.amount = amount;
        this.provider = provider;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return String.format("[ id=%d, amount=%.2%f, provider='%s', accountType='%s']", this.id, this.amount, this.provider, this.accountType);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }
    
    /**
     * @return the accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
