/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1cliente.controller;

import ec.edu.espe.arquitectura.examen1cliente.dto.PartidoRQ;
import ec.edu.espe.arquitectura.examen1cliente.service.PartidoService;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ComprarBoletoRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ComprarBoletoResponse;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ListarLocalidadesDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ListarLocalidadesResponse;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;


@Slf4j
@RestController
@RequestMapping("/api/partido")
public class PartidoController {
    private PartidoService service;
    
    @GetMapping(value = "disponible")
    public ResponseEntity listarPartidoDisponible(){
        ObtenerPartidosDisponiblesRequest request = new ObtenerPartidosDisponiblesRequest();
        ObtenerPartidosDisponiblesResponse response=this.service.listarPartidosDisponibles(request);
        if(response.getPartido().size()>0){
        return ResponseEntity.ok(response);     
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping(value = "localidad/{codigo}")
    public ResponseEntity listarLocalidadDisponible(@PathVariable("codigo") String codigo){
        ListarLocalidadesDisponiblesRequest request = new ListarLocalidadesDisponiblesRequest();
        request.setCodigo(codigo);
        ListarLocalidadesResponse response=this.service.listarLocalidadesDisponibles(request);
        if(response.getLocalidad().size()>0){
        return ResponseEntity.ok(response);     
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    
    @PostMapping(value = "")
    public ResponseEntity comprarBoleto(PartidoRQ partidoRQ){
        ComprarBoletoRequest request = new ComprarBoletoRequest();
        request.setCodigoPartido(partidoRQ.getCodigoPartido());
        request.setCodigoLocalidad(partidoRQ.getCodigoLocalidad());
        ComprarBoletoResponse response=this.service.comprarBoleto(request);
       
        return ResponseEntity.ok(response);     
        
    }
    
}
