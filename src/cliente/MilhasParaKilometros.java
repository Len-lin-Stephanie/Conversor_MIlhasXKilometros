
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de milhasParaKilometros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="milhasParaKilometros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "milhasParaKilometros", propOrder = {
    "milhas"
})
public class MilhasParaKilometros {

    protected float milhas;

    /**
     * Obtém o valor da propriedade milhas.
     * 
     */
    public float getMilhas() {
        return milhas;
    }

    /**
     * Define o valor da propriedade milhas.
     * 
     */
    public void setMilhas(float value) {
        this.milhas = value;
    }

}
