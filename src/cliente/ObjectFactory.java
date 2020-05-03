
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MilhasParaKilometrosResponse_QNAME = new QName("http://control/", "milhasParaKilometrosResponse");
    private final static QName _MilhasParaKilometros_QNAME = new QName("http://control/", "milhasParaKilometros");
    private final static QName _KilometrosParaMilhasResponse_QNAME = new QName("http://control/", "kilometrosParaMilhasResponse");
    private final static QName _KilometrosParaMilhas_QNAME = new QName("http://control/", "kilometrosParaMilhas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KilometrosParaMilhas }
     * 
     */
    public KilometrosParaMilhas createKilometrosParaMilhas() {
        return new KilometrosParaMilhas();
    }

    /**
     * Create an instance of {@link KilometrosParaMilhasResponse }
     * 
     */
    public KilometrosParaMilhasResponse createKilometrosParaMilhasResponse() {
        return new KilometrosParaMilhasResponse();
    }

    /**
     * Create an instance of {@link MilhasParaKilometros }
     * 
     */
    public MilhasParaKilometros createMilhasParaKilometros() {
        return new MilhasParaKilometros();
    }

    /**
     * Create an instance of {@link MilhasParaKilometrosResponse }
     * 
     */
    public MilhasParaKilometrosResponse createMilhasParaKilometrosResponse() {
        return new MilhasParaKilometrosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MilhasParaKilometrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "milhasParaKilometrosResponse")
    public JAXBElement<MilhasParaKilometrosResponse> createMilhasParaKilometrosResponse(MilhasParaKilometrosResponse value) {
        return new JAXBElement<MilhasParaKilometrosResponse>(_MilhasParaKilometrosResponse_QNAME, MilhasParaKilometrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MilhasParaKilometros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "milhasParaKilometros")
    public JAXBElement<MilhasParaKilometros> createMilhasParaKilometros(MilhasParaKilometros value) {
        return new JAXBElement<MilhasParaKilometros>(_MilhasParaKilometros_QNAME, MilhasParaKilometros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KilometrosParaMilhasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "kilometrosParaMilhasResponse")
    public JAXBElement<KilometrosParaMilhasResponse> createKilometrosParaMilhasResponse(KilometrosParaMilhasResponse value) {
        return new JAXBElement<KilometrosParaMilhasResponse>(_KilometrosParaMilhasResponse_QNAME, KilometrosParaMilhasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KilometrosParaMilhas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "kilometrosParaMilhas")
    public JAXBElement<KilometrosParaMilhas> createKilometrosParaMilhas(KilometrosParaMilhas value) {
        return new JAXBElement<KilometrosParaMilhas>(_KilometrosParaMilhas_QNAME, KilometrosParaMilhas.class, null, value);
    }

}
