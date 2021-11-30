/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.service;

import ec.edu.espe.arquitectura.examen1.dao.PartidoRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Slf4j
public class PartidoService {
    private final PartidoRepository partidoRepo;

    public PartidoService(PartidoRepository partidoRepo) {
        this.partidoRepo = partidoRepo;
    }
    
    public List<PartidoFutbol> listarPartidosDisponibles(){
        List<PartidoFutbol> partidos;
        partidos = this.partidoRepo.findByFechaAfterOrderByFechaDesc(LocalDateTime.now());
        return partidos;
    } 
    
}
