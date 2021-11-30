/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.dao;

import ec.edu.espe.arquitectura.examen1.model.LocalidadPartidoPK;
import ec.edu.espe.arquitectura.examen1.ws.Localidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yazbe
 */
public interface LocalidadRepository  extends JpaRepository<Localidad, LocalidadPartidoPK> {
    List<Localidad> findByDisponibilidadGreaterThan(Integer numero);
}
