package vn.myclass.core.persestence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentid;

    @Column(name = "content")
    private String content;

    @Column(name = "createddate")
    private Timestamp createddate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "userid")

    private User user;

    @ManyToOne
    @JoinColumn(name = "listenguidelineid")
    private ListenGuideLine listenGuideLine;

    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ListenGuideLine getListenGuideLine() {
        return listenGuideLine;
    }

    public void setListenGuideLine(ListenGuideLine listenGuideLine) {
        this.listenGuideLine = listenGuideLine;
    }
}
