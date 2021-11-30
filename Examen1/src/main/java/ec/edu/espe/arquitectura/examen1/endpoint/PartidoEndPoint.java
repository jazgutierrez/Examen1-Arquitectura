/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.endpoint;

import ec.edu.espe.arquitectura.examen1.model.LocalidadPartido;
import ec.edu.espe.arquitectura.examen1.service.LocalidadService;
import ec.edu.espe.arquitectura.examen1.service.PartidoService;
import ec.edu.espe.arquitectura.examen1.ws.ObtenerPartidosDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1.ws.ObtenerPartidosDisponiblesResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import ec.edu.espe.arquitectura.examen1.transform.LocalidadTransform;
import ec.edu.espe.arquitectura.examen1.transform.PartidoTransform;
import ec.edu.espe.arquitectura.examen1.ws.ComprarBoletoRequest;
import ec.edu.espe.arquitectura.examen1.ws.ComprarBoletoResponse;
import ec.edu.espe.arquitectura.examen1.ws.ListarLocalidadesDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1.ws.ListarLocalidadesResponse;
import ec.edu.espe.arquitectura.examen1.ws.Localidad;
import ec.edu.espe.arquitectura.examen1.ws.Partido;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;


@Slf4j
@Endpoint
public class PartidoEndPoint {
    
    private static final String NAMESPACE_URI = "http://espe.edu.ec/arquitectura/examen1/ws";
    public final PartidoService partidoService;
    public final LocalidadService localidadService;

    @Autowired
    public PartidoEndPoint(PartidoService partidoService, LocalidadService localidadService) {
        this.partidoService = partidoService;
        this.localidadService = localidadService;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerPartidosDisponiblesRequest")
    @ResponsePayload
    public ObtenerPartidosDisponiblesResponse obtenerPartidosDisponibles(@RequestPayload ObtenerPartidosDisponiblesRequest request) throws RuntimeException{
        try {
            List<PartidoFutbol> partidos = this.partidoService.listarPartidosDisponibles();
            List<Partido> partidoRS = new ArrayList<>();
            
            log.info("Partidos obtenidos {} ",
                    partidos.size());
            
            partidos.forEach(c -> {
                
                try {
                    partidoRS.add(PartidoTransform.partidoBuilder(c));
                } catch (DatatypeConfigurationException ex) {
                    throw new RuntimeException();
                }
               
            });

            ObtenerPartidosDisponiblesResponse response=new ObtenerPartidosDisponiblesResponse();
           
            response.setPartido(partidoRS);
            
            return response;
        } catch (Exception e) {
            log.error("{} {}",e.getMessage(), e.getStackTrace());
             throw new RuntimeException();
        }
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "listarLocalidadesDisponiblesRequest")
    @ResponsePayload
    public ListarLocalidadesResponse listarLocalidadesDisponibles(@RequestPayload ListarLocalidadesDisponiblesRequest request) throws RuntimeException{
        try {
            List<LocalidadPartido> partidos = this.localidadService.listarLocalidad(request.getCodigo());
            List<Localidad> localidadRS = new ArrayList<>();
            
            log.info("Partidos obtenidos {} ",
                    partidos.size());
            
            partidos.forEach(c -> {
               
                    localidadRS.add(LocalidadTransform.localidadBuilder(c));
                
               
            });

            ListarLocalidadesResponse response=new ListarLocalidadesResponse();
           
            response.setLocalidad(localidadRS);
            
            return response;
        } catch (Exception e) {
            log.error("{} {}",e.getMessage(), e.getStackTrace());
             throw new RuntimeException();
        }
        
        
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "comprarBoletoRequest")
    @ResponsePayload
    public ComprarBoletoResponse comprarBoleto(@RequestPayload ComprarBoletoRequest request) throws RuntimeException{
        try {
            LocalidadPartido localidad = this.localidadService.comprarBoleto(NAMESPACE_URI, NAMESPACE_URI);
            List<Localidad> localidadRS = new ArrayList<>();
            
            log.info("Boleto comprado, disponibilidad de: {} ",
                    localidad.getDisponibilidad());
            
           

            ComprarBoletoResponse response=new ComprarBoletoResponse();
           
            
            return response;
        } catch (Exception e) {
            log.error("{} {}",e.getMessage(), e.getStackTrace());
             throw new RuntimeException();
        }
        
        
    }
    
}
