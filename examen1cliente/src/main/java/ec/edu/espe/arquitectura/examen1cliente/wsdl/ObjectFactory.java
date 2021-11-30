//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 09:50:18 PM COT 
//


package ec.edu.espe.arquitectura.examen1cliente.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.arquitectura.examen1cliente.wsdl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.arquitectura.examen1cliente.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerPartidosDisponiblesRequest }
     * 
     */
    public ObtenerPartidosDisponiblesRequest createObtenerPartidosDisponiblesRequest() {
        return new ObtenerPartidosDisponiblesRequest();
    }

    /**
     * Create an instance of {@link ObtenerPartidosDisponiblesResponse }
     * 
     */
    public ObtenerPartidosDisponiblesResponse createObtenerPartidosDisponiblesResponse() {
        return new ObtenerPartidosDisponiblesResponse();
    }

    /**
     * Create an instance of {@link Partido }
     * 
     */
    public Partido createPartido() {
        return new Partido();
    }

    /**
     * Create an instance of {@link ListarLocalidadesDisponiblesRequest }
     * 
     */
    public ListarLocalidadesDisponiblesRequest createListarLocalidadesDisponiblesRequest() {
        return new ListarLocalidadesDisponiblesRequest();
    }

    /**
     * Create an instance of {@link ListarLocalidadesResponse }
     * 
     */
    public ListarLocalidadesResponse createListarLocalidadesResponse() {
        return new ListarLocalidadesResponse();
    }

    /**
     * Create an instance of {@link Localidad }
     * 
     */
    public Localidad createLocalidad() {
        return new Localidad();
    }

    /**
     * Create an instance of {@link ComprarBoletoRequest }
     * 
     */
    public ComprarBoletoRequest createComprarBoletoRequest() {
        return new ComprarBoletoRequest();
    }

    /**
     * Create an instance of {@link ComprarBoletoResponse }
     * 
     */
    public ComprarBoletoResponse createComprarBoletoResponse() {
        return new ComprarBoletoResponse();
    }

}
