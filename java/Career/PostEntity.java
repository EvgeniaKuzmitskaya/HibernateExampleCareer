package Career;

import javax.persistence.*;

/**
 * Created by Evgenia on 29.03.2017.
 */
@Entity
@Table(name = "post", schema = "development", catalog = "")
public class PostEntity {
    private int idPost;
    private String namePost;

    @Id
    @Column(name = "id_post", nullable = false)
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Basic
    @Column(name = "name_post", nullable = false, length = 145)
    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (idPost != that.idPost) return false;
        if (namePost != null ? !namePost.equals(that.namePost) : that.namePost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPost;
        result = 31 * result + (namePost != null ? namePost.hashCode() : 0);
        return result;
    }
}
