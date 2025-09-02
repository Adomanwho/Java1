/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 * @author dnlbe
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"title", "blogType", "publishedDate", "authors"})
public class Blog {

    public static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_DATE;
    
    @XmlElementWrapper
    @XmlElement(name = "author")
    private Set<Author> authors;
    private String title;
    @XmlElement(name = "blogtype")
    private BlogType blogType;  
    
    @XmlJavaTypeAdapter(PublishedDateAdapter.class)
    @XmlElement(name = "publisheddate")
    private LocalDate publishedDate;
    
    public Blog() {
    }
    
    public Blog(Set<Author> authors, String title, BlogType blogType, LocalDate publishedDate) {
        this.authors = authors;
        this.title = title;
        this.blogType = blogType;
        this.publishedDate = publishedDate;
    }
    
    public Set<Author> getAuthors() {
        return authors; //bilo bi bolje returnat kopiju al ok
    }

    @Override
    public String toString() {
        return title;
    }
    
}
