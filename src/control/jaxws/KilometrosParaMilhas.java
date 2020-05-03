
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "kilometrosParaMilhas", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kilometrosParaMilhas", namespace = "http://control/")
public class KilometrosParaMilhas {

    @XmlElement(name = "kilometros", namespace = "")
    private float kilometros;

    /**
     * 
     * @return
     *     returns float
     */
    public float getKilometros() {
        return this.kilometros;
    }

    /**
     * 
     * @param kilometros
     *     the value for the kilometros property
     */
    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }

}
