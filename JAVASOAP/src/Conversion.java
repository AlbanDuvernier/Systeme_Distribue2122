import javax.jws.WebMethod;
import javax.jws.WebParam;

@javax.jws.WebService(targetNamespace = "http://www.polytechNancy.fr")
public class Conversion  {
    @WebMethod(operationName = "convertir")
    public double conversion(@WebParam(name = "mt")double montant){
        return montant*1.6;
    }

}
