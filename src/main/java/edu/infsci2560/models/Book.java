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
public class Book {

    private static final long serialVersionUID = 1L;

    public enum BookStatus {
        Unknown,
        Available,
        Exchanged,
        NotFinishYet,
        Out,
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected String title;
    protected String author;
    protected String version;
    protected BookStatus bookStatus;

    public Book() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.author = null;
        this.version = null;
        this.bookStatus = BookStatus.Unknown;

    }

    public Book(long id, String title , String author, String version, BookStatus bookStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.version = version;
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return String.format("[ id=%d, title='%s', author='%s', version='%s', bookStatus='%s']", this.id, this.title, this.author, this.version, this.bookStatus);
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
     * @return the bookStatus
     */
    public BookStatus getBookStatus() {
        return bookStatus;
    }

    /**
     * @param bookStatus the bookStatus to set
     */
    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
