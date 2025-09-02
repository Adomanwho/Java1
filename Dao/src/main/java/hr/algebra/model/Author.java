/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dnlbe
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Author implements Comparable<Author>{
    
    @XmlAttribute
    private String jmbag;
    @XmlElement(name = "firstname")
    private String firstName;
    @XmlElement(name = "lastname")
    private String lastName;

    public Author() {
    }
    
    public Author(String jmbag, String firstName, String lastName) {
        this.jmbag = jmbag;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return jmbag + " - " + firstName + " " + lastName;
    }

    @Override
    public int compareTo(Author o) {
        return jmbag.compareTo(o.jmbag);
    }
    
}
