/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1cliente.controller;

import ec.edu.espe.arquitectura.examen1cliente.service.PartidoService;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
