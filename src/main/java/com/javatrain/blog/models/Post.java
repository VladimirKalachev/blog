package com.javatrain.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;            // post id
    private String title;       // post title
    private String announce;    // post summary
    private String fullText;    // post content
    private int views;          // post views counter
    
     public Post() {
    }

    public Post(String title, String announce, String full_text) {
        this.title = title;
        this.announce = announce;
        this.fullText = full_text;
    }

    public Long getId() {

         return id;
    }

    public void setId(Long id) {

         this.id = id;
    }

    public String getTitle() {

         return title;
    }

    public void setTitle(String title) {

         this.title = title;
    }

    public String getAnnounce() {

         return announce;
    }

    public void setAnnounce(String announce) {

         this.announce = announce;
    }

    public String getFullText() {

         return fullText;
    }

    public void setFullText(String full_text) {

         this.fullText = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {

         this.views = views;
    }
   
}
