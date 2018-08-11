package vn.myclass.core.persestence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment", schema = "toeiconline", catalog = "")
public class CommentEntity {
    private long commentid;
    private String content;
    private Timestamp createddate;

    @Id
    @Column(name = "commentid", nullable = false)
    public long getCommentid() {
        return commentid;
    }

    public void setCommentid(long commentid) {
        this.commentid = commentid;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "createddate", nullable = true)
    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (commentid != that.commentid) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createddate != null ? !createddate.equals(that.createddate) : that.createddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (commentid ^ (commentid >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createddate != null ? createddate.hashCode() : 0);
        return result;
    }
}
