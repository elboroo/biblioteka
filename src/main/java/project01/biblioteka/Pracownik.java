package project01.biblioteka;

import java.io.Serializable;
import javax.persistence.*;
import project01.biblioteka.Grupa;

/**
 *
 * @author Bogus
 */
@Entity
public class Pracownik implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "GRUPA_ID")
    private Grupa grupa;

    public void assingGrupa(Grupa newGrupa)
    {
        if (this.grupa != null)
        {
            this.grupa.getPracownicy().remove(this);
        }

        this.grupa = newGrupa;
        newGrupa.getPracownicy().add(this);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Grupa getGrupa()
    {
        return grupa;
    }

    public void setGrupa(Grupa grupa)
    {
        this.grupa = grupa;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pracownik))
        {
            return false;
        }
        Pracownik other = (Pracownik) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "project01.biblioteka.Pracownik[ id=" + id + " ]";
    }
}
