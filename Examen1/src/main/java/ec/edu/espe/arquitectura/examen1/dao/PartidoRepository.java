/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.dao;

import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author yazbe
 */
public interface PartidoRepository {
    List<PartidoFutbol> findByFechaAfterOrderByFechaDesc(LocalDateTime inicio);

}
