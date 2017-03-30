package Career;

import javax.persistence.*;

/**
 * Created by Evgenia on 29.03.2017.
 */
@Entity
@Table(name = "form", schema = "development", catalog = "")
public class FormEntity {
    private int idForm;
    private String nameForm;
    private String surnameForm;
    private String pfntronicName;

    @Id
    @Column(name = "id_form", nullable = false)
    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    @Basic
    @Column(name = "name_form", nullable = false, length = 50)
    public String getNameForm() {
        return nameForm;
    }

    public void setNameForm(String nameForm) {
        this.nameForm = nameForm;
    }

    @Basic
    @Column(name = "surname_form", nullable = false, length = 75)
    public String getSurnameForm() {
        return surnameForm;
    }

    public void setSurnameForm(String surnameForm) {
        this.surnameForm = surnameForm;
    }

    @Basic
    @Column(name = "pfntronic_name", nullable = false, length = 85)
    public String getPfntronicName() {
        return pfntronicName;
    }

    public void setPfntronicName(String pfntronicName) {
        this.pfntronicName = pfntronicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormEntity that = (FormEntity) o;

        if (idForm != that.idForm) return false;
        if (nameForm != null ? !nameForm.equals(that.nameForm) : that.nameForm != null) return false;
        if (surnameForm != null ? !surnameForm.equals(that.surnameForm) : that.surnameForm != null) return false;
        if (pfntronicName != null ? !pfntronicName.equals(that.pfntronicName) : that.pfntronicName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idForm;
        result = 31 * result + (nameForm != null ? nameForm.hashCode() : 0);
        result = 31 * result + (surnameForm != null ? surnameForm.hashCode() : 0);
        result = 31 * result + (pfntronicName != null ? pfntronicName.hashCode() : 0);
        return result;
    }
}
