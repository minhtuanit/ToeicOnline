package vn.myclass.core.persestence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "listenguideline", schema = "toeiconline", catalog = "")
public class ListenguidelineEntity {
    private long listenguidelineid;
    private String title;
    private String image;
    private String content;
    private Timestamp createddate;
    private Timestamp modifieddate;

    @Id
    @Column(name = "listenguidelineid", nullable = false)
    public long getListenguidelineid() {
        return listenguidelineid;
    }

    public void setListenguidelineid(long listenguidelineid) {
        this.listenguidelineid = listenguidelineid;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 512)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "image", nullable = true, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    @Basic
    @Column(name = "modifieddate", nullable = true)
    public Timestamp getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Timestamp modifieddate) {
        this.modifieddate = modifieddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListenguidelineEntity that = (ListenguidelineEntity) o;

        if (listenguidelineid != that.listenguidelineid) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createddate != null ? !createddate.equals(that.createddate) : that.createddate != null) return false;
        if (modifieddate != null ? !modifieddate.equals(that.modifieddate) : that.modifieddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (listenguidelineid ^ (listenguidelineid >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createddate != null ? createddate.hashCode() : 0);
        result = 31 * result + (modifieddate != null ? modifieddate.hashCode() : 0);
        return result;
    }
}
