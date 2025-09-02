/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dnlbe
 */
@XmlRootElement(name = "blogarchive")
@XmlAccessorType(XmlAccessType.FIELD)
public class BlogArchive {
    
    @XmlElementWrapper
    @XmlElement(name = "blog")
    private List<Blog> blogs;

    public BlogArchive() {
    }

    public BlogArchive(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

}
