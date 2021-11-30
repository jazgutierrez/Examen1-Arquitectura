/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.service;

import ec.edu.espe.arquitectura.examen1.dao.LocalidadRepository;
import ec.edu.espe.arquitectura.examen1.dao.PartidoRepository;
import ec.edu.espe.arquitectura.examen1.exception.CreateException;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ec.edu.espe.arquitectura.examen1.model.LocalidadPartido;
import ec.edu.espe.arquitectura.examen1.model.LocalidadPartidoPK;
import ec.edu.espe.arquitectura.examen1.ws.Localidad;
import java.util.Optional;

/**
 *
 * @author yazbe
 */
@Service
@Slf4j
public class LocalidadService {
    
    private final LocalidadRepository localidadRepo;
  

    public LocalidadService(LocalidadRepository localidadRepo) {
        this.localidadRepo = localidadRepo;
    }
    
    public List<LocalidadPartido> listarLocalidad(String codigoPartido){
        return this.localidadRepo.findByLocalidadPartidoPKCodigoAndDisponibilidadGreaterThan(codigoPartido, 0);
    }
    
    public LocalidadPartido comprarBoleto(String codPartido, String codLocalidad){
        LocalidadPartidoPK pk= new LocalidadPartidoPK();
        pk.setCodigo(codPartido);
        pk.setCodigoLocalidad(codLocalidad);
        Optional<LocalidadPartido> localidadPartidoOpt=this.localidadRepo.findById(pk);
        if(localidadPartidoOpt.isPresent() && localidadPartidoOpt.get().getDisponibilidad()>0){
            localidadPartidoOpt.get().setDisponibilidad(localidadPartidoOpt.get().getDisponibilidad()-1);
             return localidadPartidoOpt.get();
        }else{
            throw new CreateException("No existe esa localidad");
        }
       
    }
}
