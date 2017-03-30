package Career;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Evgenia on 29.03.2017.
 */
@Entity
@Table(name = "passport", schema = "development", catalog = "")
public class PassportEntity {
    private int idPassport;
    private Date dateOfBirthPassport;
    private String seriesPassport;
    private String numderPassport;
    private String insuarancePassport;
    private String placeOfBirthPassport;

    @Id
    @Column(name = "id_passport", nullable = false)
    public int getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(int idPassport) {
        this.idPassport = idPassport;
    }

    @Basic
    @Column(name = "dateOfBirth_passport", nullable = false)
    public Date getDateOfBirthPassport() {
        return dateOfBirthPassport;
    }

    public void setDateOfBirthPassport(Date dateOfBirthPassport) {
        this.dateOfBirthPassport = dateOfBirthPassport;
    }

    @Basic
    @Column(name = "series_passport", nullable = false, length = 15)
    public String getSeriesPassport() {
        return seriesPassport;
    }

    public void setSeriesPassport(String seriesPassport) {
        this.seriesPassport = seriesPassport;
    }

    @Basic
    @Column(name = "numder_passport", nullable = false, length = 45)
    public String getNumderPassport() {
        return numderPassport;
    }

    public void setNumderPassport(String numderPassport) {
        this.numderPassport = numderPassport;
    }

    @Basic
    @Column(name = "insuarance_passport", nullable = false, length = 45)
    public String getInsuarancePassport() {
        return insuarancePassport;
    }

    public void setInsuarancePassport(String insuarancePassport) {
        this.insuarancePassport = insuarancePassport;
    }

    @Basic
    @Column(name = "placeOfBirth_passport", nullable = false, length = 20)
    public String getPlaceOfBirthPassport() {
        return placeOfBirthPassport;
    }

    public void setPlaceOfBirthPassport(String placeOfBirthPassport) {
        this.placeOfBirthPassport = placeOfBirthPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassportEntity that = (PassportEntity) o;

        if (idPassport != that.idPassport) return false;
        if (dateOfBirthPassport != null ? !dateOfBirthPassport.equals(that.dateOfBirthPassport) : that.dateOfBirthPassport != null)
            return false;
        if (seriesPassport != null ? !seriesPassport.equals(that.seriesPassport) : that.seriesPassport != null)
            return false;
        if (numderPassport != null ? !numderPassport.equals(that.numderPassport) : that.numderPassport != null)
            return false;
        if (insuarancePassport != null ? !insuarancePassport.equals(that.insuarancePassport) : that.insuarancePassport != null)
            return false;
        if (placeOfBirthPassport != null ? !placeOfBirthPassport.equals(that.placeOfBirthPassport) : that.placeOfBirthPassport != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPassport;
        result = 31 * result + (dateOfBirthPassport != null ? dateOfBirthPassport.hashCode() : 0);
        result = 31 * result + (seriesPassport != null ? seriesPassport.hashCode() : 0);
        result = 31 * result + (numderPassport != null ? numderPassport.hashCode() : 0);
        result = 31 * result + (insuarancePassport != null ? insuarancePassport.hashCode() : 0);
        result = 31 * result + (placeOfBirthPassport != null ? placeOfBirthPassport.hashCode() : 0);
        return result;
    }
}
