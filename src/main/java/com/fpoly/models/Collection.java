package com.fpoly.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "collections")
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    private String description;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Frame> frameList;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Comment> commentList;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Like> likeList;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private UserApplication user;

    public Collection() {
    }

    public Collection(int id, Date date, String description, List<Frame> frameList, List<Comment> commentList, List<Like> likeList, UserApplication user) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.frameList = frameList;
        this.commentList = commentList;
        this.likeList = likeList;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Frame> getFrameList() {
        return frameList;
    }

    public void setFrameList(List<Frame> frameList) {
        this.frameList = frameList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }

    public UserApplication getUser() {
        return user;
    }

    public void setUser(UserApplication user) {
        this.user = user;
    }
}
