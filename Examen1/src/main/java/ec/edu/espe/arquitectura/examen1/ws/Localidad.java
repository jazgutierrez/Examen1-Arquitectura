//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:19:16 PM COT 
//


package ec.edu.espe.arquitectura.examen1.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
/**
 * <p>Clase Java para localidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_localidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localidad", propOrder = {
    "codigoLocalidad",
    "disponibilidad",
    "precio"
})
public class Localidad {

    @XmlElement(name = "codigo_localidad", required = true)
    protected String codigoLocalidad;
    @XmlElement(required = true)
    protected Integer disponibilidad;
    @XmlElement(required = true)
    protected BigDecimal precio;

    /**
     * Obtiene el valor de la propiedad codigoLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    /**
     * Define el valor de la propiedad codigoLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocalidad(String value) {
        this.codigoLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisponibilidad(Integer value) {
        this.disponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecio(BigDecimal value) {
        this.precio = value;
    }

}
