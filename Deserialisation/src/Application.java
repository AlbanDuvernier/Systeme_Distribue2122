import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    public static <exception> void main(String[] args) throws JAXBException {
        try{
            JAXBContext jc =JAXBContext.newInstance(Personne.class);
            Unmarshaller um =jc.createUnmarshaller();
            Personne p =(Personne)um.unmarshal(new File("resultat.xml"));
            System.out.println(p.getNom());

        } catch (Exception ex){
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
