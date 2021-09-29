import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Date implements Serializable {
    private int jours;
    private int mois;
    private int annee;
    public Date() {
        super();
    }
    public Date(int jours, int mois, int annee) {
        super();
        this.jours = jours;
        this.mois = mois;
        this.annee = annee;
    }
    public int getJours() {
        return jours;
    }
    public void setJours(int jours) {
        this.jours = jours;
    }
    public int getMois() {
        return mois;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }


}

