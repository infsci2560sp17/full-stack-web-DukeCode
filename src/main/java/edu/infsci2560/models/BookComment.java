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
public class BookComment {

    private static final long serialVersionUID = 1L;

    public enum BookRate {
        WasteOfTime,
        Bad,
        Average,
        Great,
        FinancialLegend,
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected String title;
    protected String author;
    protected String version;
    protected BookRate bookRate;
    protected String comment;

    public BookComment() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.author = null;
        this.version = null;
        this.bookRate = BookRate.Average;
        this.comment = null;

    }

    public BookComment(long id, String title , String author, String version, BookRate bookRate, String comment) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.version = version;
        this.bookRate = bookRate;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return String.format("[ id=%d, title='%s', author='%s', version='%s', bookRate='%s', comment='%s']", this.id, this.title, this.author, this.version, this.bookRate, this.comment);
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the bookRate
     */
    public BookRate getBookRate() {
        return bookRate;
    }

    /**
     * @param bookRate the bookRate to set
     */
    public void setBookRate(BookRate bookRate) {
        this.bookRate = bookRate;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
