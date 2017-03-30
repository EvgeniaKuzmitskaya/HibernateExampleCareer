package Career;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Evgenia on 29.03.2017.
 */
@Entity
@Table(name = "work", schema = "development", catalog = "")
public class WorkEntity {
    private int idWork;
    private Date recruitWork;
    private Date sackWork;

    @Id
    @Column(name = "id_work", nullable = false)
    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    @Basic
    @Column(name = "recruit_work", nullable = false)
    public Date getRecruitWork() {
        return recruitWork;
    }

    public void setRecruitWork(Date recruitWork) {
        this.recruitWork = recruitWork;
    }

    @Basic
    @Column(name = "sack_work", nullable = false)
    public Date getSackWork() {
        return sackWork;
    }

    public void setSackWork(Date sackWork) {
        this.sackWork = sackWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkEntity that = (WorkEntity) o;

        if (idWork != that.idWork) return false;
        if (recruitWork != null ? !recruitWork.equals(that.recruitWork) : that.recruitWork != null) return false;
        if (sackWork != null ? !sackWork.equals(that.sackWork) : that.sackWork != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWork;
        result = 31 * result + (recruitWork != null ? recruitWork.hashCode() : 0);
        result = 31 * result + (sackWork != null ? sackWork.hashCode() : 0);
        return result;
    }
}
