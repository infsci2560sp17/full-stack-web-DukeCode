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
public class Analysis {

    private static final long serialVersionUID = 1L;

    public enum AnalysisType {
        Unknown,
        Deposit,
        Currency,
        PreciousMetal,
        RealEstate,
        Stock,
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected AnalysisType analysisType;
    protected String analysisContent;

    public Analysis() {
        this.id = Long.MAX_VALUE;
        this.analysisType = AnalysisType.Unknown;
        this.analysisContent = null;
    }

    public Analysis(long id, AnalysisType analysisType, String analysisContent) {
        this.id = id;
        this.analysisType = analysisType;
        this.analysisContent = analysisContent;
    }

    @Override
    public String toString() {
        return String.format("[ id=%d, analysisType='%s', analysisContent='%s']", this.id, this.analysisType, this.analysisContent);
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
     * @return the analysisType
     */
    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    /**
     * @param analysisType the analysisType to set
     */
    public void setProvider(AnalysisType analysisType) {
        this.analysisType = analysisType;
    }
    
    /**
     * @return the analysisContent
     */
    public String getAnalysisContent() {
        return analysisContent;
    }

    /**
     * @param analysisContent the analysisContent to set
     */
    public void setAnalysisContent(String analysisContent) {
        this.analysisContent = analysisContent;
    }
}
