/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yazbe
 */
@Entity
@Table(name = "partido_futbol")
public class PartidoFutbol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "equipo_local")
    private String equipoLocal;
    @Column(name = "equipo_visita")
    private String equipoVisita;
    @Column(name = "fecha")
    private LocalDateTime fecha;
    @Column(name = "lugar")
    private String lugar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partidoFutbol")
    private List<LocalidadPartido> localidadPartidoList;

    public PartidoFutbol() {
    }

    public PartidoFutbol(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(String equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @XmlTransient
    public List<LocalidadPartido> getLocalidadPartidoList() {
        return localidadPartidoList;
    }

    public void setLocalidadPartidoList(List<LocalidadPartido> localidadPartidoList) {
        this.localidadPartidoList = localidadPartidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartidoFutbol)) {
            return false;
        }
        PartidoFutbol other = (PartidoFutbol) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.examen1.model.PartidoFutbol[ codigo=" + codigo + " ]";
    }
    
}
