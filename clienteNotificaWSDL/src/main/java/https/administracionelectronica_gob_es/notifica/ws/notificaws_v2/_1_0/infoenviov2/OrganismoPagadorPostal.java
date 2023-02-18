//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.02.18 a las 07:34:35 AM CET 
//


package https.administracionelectronica_gob_es.notifica.ws.notificaws_v2._1_0.infoenviov2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para OrganismoPagadorPostal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrganismoPagadorPostal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="codigoDIR3Postal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numContratoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codClienteFacturacionPostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaVigenciaPostal" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganismoPagadorPostal", propOrder = {

})
public class OrganismoPagadorPostal {

    @XmlElement(required = true)
    protected String codigoDIR3Postal;
    @XmlElement(required = true)
    protected String numContratoPostal;
    @XmlElement(required = true)
    protected String codClienteFacturacionPostal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVigenciaPostal;

    /**
     * Obtiene el valor de la propiedad codigoDIR3Postal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDIR3Postal() {
        return codigoDIR3Postal;
    }

    /**
     * Define el valor de la propiedad codigoDIR3Postal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDIR3Postal(String value) {
        this.codigoDIR3Postal = value;
    }

    /**
     * Obtiene el valor de la propiedad numContratoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumContratoPostal() {
        return numContratoPostal;
    }

    /**
     * Define el valor de la propiedad numContratoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumContratoPostal(String value) {
        this.numContratoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad codClienteFacturacionPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClienteFacturacionPostal() {
        return codClienteFacturacionPostal;
    }

    /**
     * Define el valor de la propiedad codClienteFacturacionPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClienteFacturacionPostal(String value) {
        this.codClienteFacturacionPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigenciaPostal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVigenciaPostal() {
        return fechaVigenciaPostal;
    }

    /**
     * Define el valor de la propiedad fechaVigenciaPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVigenciaPostal(XMLGregorianCalendar value) {
        this.fechaVigenciaPostal = value;
    }

}
