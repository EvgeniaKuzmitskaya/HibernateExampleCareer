package Career;

import javax.persistence.*;

/**
 * Created by Evgenia on 29.03.2017.
 */
@Entity
@Table(name = "status", schema = "development", catalog = "")
public class StatusEntity {
    private int idStatus;
    private String aducationStatus;
    private String familyStatus;
    private int childrenStatus;

    @Id
    @Column(name = "id_status", nullable = false)
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    @Basic
    @Column(name = "aducation_status", nullable = false, length = 45)
    public String getAducationStatus() {
        return aducationStatus;
    }

    public void setAducationStatus(String aducationStatus) {
        this.aducationStatus = aducationStatus;
    }

    @Basic
    @Column(name = "family_status", nullable = false, length = 45)
    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    @Basic
    @Column(name = "children_status", nullable = false)
    public int getChildrenStatus() {
        return childrenStatus;
    }

    public void setChildrenStatus(int childrenStatus) {
        this.childrenStatus = childrenStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusEntity that = (StatusEntity) o;

        if (idStatus != that.idStatus) return false;
        if (childrenStatus != that.childrenStatus) return false;
        if (aducationStatus != null ? !aducationStatus.equals(that.aducationStatus) : that.aducationStatus != null)
            return false;
        if (familyStatus != null ? !familyStatus.equals(that.familyStatus) : that.familyStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStatus;
        result = 31 * result + (aducationStatus != null ? aducationStatus.hashCode() : 0);
        result = 31 * result + (familyStatus != null ? familyStatus.hashCode() : 0);
        result = 31 * result + childrenStatus;
        return result;
    }
}
