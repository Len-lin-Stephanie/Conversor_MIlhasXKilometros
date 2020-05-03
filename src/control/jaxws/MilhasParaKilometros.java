
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "milhasParaKilometros", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "milhasParaKilometros", namespace = "http://control/")
public class MilhasParaKilometros {

    @XmlElement(name = "milhas", namespace = "")
    private float milhas;

    /**
     * 
     * @return
     *     returns float
     */
    public float getMilhas() {
        return this.milhas;
    }

    /**
     * 
     * @param milhas
     *     the value for the milhas property
     */
    public void setMilhas(float milhas) {
        this.milhas = milhas;
    }

}
