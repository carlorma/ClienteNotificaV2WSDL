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
 * <p>Clase Java para Datado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Datado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombreReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nifReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datado", propOrder = {

})
public class Datado {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String origen;
    protected String nombreReceptor;
    protected String nifReceptor;
    protected String descripcionError;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReceptor() {
        return nombreReceptor;
    }

    /**
     * Define el valor de la propiedad nombreReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReceptor(String value) {
        this.nombreReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad nifReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNifReceptor() {
        return nifReceptor;
    }

    /**
     * Define el valor de la propiedad nifReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNifReceptor(String value) {
        this.nifReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

}
