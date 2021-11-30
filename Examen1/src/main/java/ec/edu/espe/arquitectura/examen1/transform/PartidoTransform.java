/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.transform;
import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import ec.edu.espe.arquitectura.examen1.ws.Partido;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 * @author yazbe
 */
public class PartidoTransform {
    public static Partido partidoBuilder(PartidoFutbol partidoM) throws DatatypeConfigurationException{
        XMLGregorianCalendar fecha = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(partidoM.getFecha().toString());
        
        Partido partido = new Partido();
        
        partido.setCodigo(partidoM.getCodigo());
         partido.setEquipoLocal(partidoM.getEquipoLocal());
          partido.setEquipoVisita(partidoM.getEquipoVisita());
        
         partido.setFecha(fecha);
        partido.setLugar(partido.getLugar());
        return partido;
        
    }
}
