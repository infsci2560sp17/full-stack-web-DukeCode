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
public class StrategyHelp {

    private static final long serialVersionUID = 1L;

    public enum StrategyHelpType {
        Overall,
        Deposit,
        Cash,
        Stock,
        PreciousMetal,
        RealEstate,
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected StrategyHelpType strategyHelpType;
    protected String question;


    public StrategyHelp() {
        this.id = Long.MAX_VALUE;
        this.strategyHelpType = strategyHelpType.Overall;
        this.question = null;
    }

    public StrategyHelp(long id, StrategyHelpType strategyHelpType, String question) {
        this.id = id;
        this.strategyHelpType = strategyHelpType;
        this.question = question;
    }

    @Override
    public String toString() {
        return String.format("[ id=%d, strategyHelpType='%s', question='%s']", this.id, this.strategyHelpType, this.question);
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
     * @return the strategyHelpType
     */
    public StrategyHelpType getStrategyHelpType() {
        return strategyHelpType;
    }

    /**
     * @param strategyHelpType the strategyHelpType to set
     */
    public void setStrategyHelpType(StrategyHelpType strategyHelpType) {
        this.strategyHelpType = strategyHelpType;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
}
