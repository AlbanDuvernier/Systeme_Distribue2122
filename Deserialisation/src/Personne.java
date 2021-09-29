import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "etudiant")
public class Personne implements Serializable {
    //tous les attributs doivent etre de type private
    //la classe est doté forcement d'un constructeur sans parametre
    //des getters et setters

    private String nom;
    private String prenom;
    private Date date;
    public Personne() {
        super();
    }
    public Personne(String nom, String prenom, Date date) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }
    @XmlAttribute
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


}