/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.transform;

import ec.edu.espe.arquitectura.examen1.model.LocalidadPartido;
import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import ec.edu.espe.arquitectura.examen1.ws.Localidad;
import ec.edu.espe.arquitectura.examen1.ws.Partido;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author yazbe
 */
public class LocalidadTransform {
    public static Localidad localidadBuilder(LocalidadPartido localidadM) {
        Localidad localidad = new Localidad();
        
        localidad.setCodigoLocalidad(localidadM.getLocalidadPartidoPK().getCodigoLocalidad());
        localidad.setDisponibilidad(localidadM.getDisponibilidad());
        localidad.setPrecio(localidadM.getPrecio());
               
        return localidad;
}
}