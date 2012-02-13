package project01.biblioteka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Bogus
 */
@Entity
public class Grupa implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nazwa;

    @OneToMany(mappedBy = "grupa")
    private List<Pracownik> pracownicy = new ArrayList<Pracownik>();
    
    public void assignPracownik(Pracownik newPracownik)
    {
        if (newPracownik.getGrupa() == null)
        {
            newPracownik.setGrupa(this);
            this.pracownicy.add(newPracownik);
            
            return;
        }
        
        newPracownik.getGrupa().getPracownicy().remove(newPracownik);
        newPracownik.setGrupa(this);
        this.pracownicy.add(newPracownik);
        
    }
    
    public Grupa(String nazwa)
    {
        this.nazwa = nazwa;
    }

    public String getNazwa()
    {
        return nazwa;
    }
    
    

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public List<Pracownik> getPracownicy()
    {
        return pracownicy;
    }

    public void setPracownicy(List<Pracownik> pracownicy)
    {
        this.pracownicy = pracownicy;
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
        if (!(object instanceof Grupa))
        {
            return false;
        }
        Grupa other = (Grupa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "project01.biblioteka.Grupa[ id=" + id + " ]";
    }
}
