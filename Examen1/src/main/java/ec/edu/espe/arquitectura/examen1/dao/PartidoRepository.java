/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.dao;

import ec.edu.espe.arquitectura.examen1.model.LocalidadPartido;
import ec.edu.espe.arquitectura.examen1.model.LocalidadPartidoPK;
import ec.edu.espe.arquitectura.examen1.model.PartidoFutbol;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yazbe
 */
public interface PartidoRepository extends JpaRepository<PartidoFutbol, String> {
    List<PartidoFutbol> findByFechaAfterOrderByFechaDesc(LocalDateTime inicio);

}
