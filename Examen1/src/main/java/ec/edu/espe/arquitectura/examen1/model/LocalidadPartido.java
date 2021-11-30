/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author yazbe
 */
@Data
@Entity
@Table(name = "localidad_partido")
public class LocalidadPartido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocalidadPartidoPK localidadPartidoPK;
    @Column(name = "disponibilidad")
    private Integer disponibilidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    
    @JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartidoFutbol partidoFutbol;

    public LocalidadPartido() {
    }

    public LocalidadPartido(LocalidadPartidoPK localidadPartidoPK) {
        this.localidadPartidoPK = localidadPartidoPK;
    }

    public LocalidadPartido(String codigoLocalidad, String codigo) {
        this.localidadPartidoPK = new LocalidadPartidoPK(codigoLocalidad, codigo);
    }

    public LocalidadPartidoPK getLocalidadPartidoPK() {
        return localidadPartidoPK;
    }

    public void setLocalidadPartidoPK(LocalidadPartidoPK localidadPartidoPK) {
        this.localidadPartidoPK = localidadPartidoPK;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public PartidoFutbol getPartidoFutbol() {
        return partidoFutbol;
    }

    public void setPartidoFutbol(PartidoFutbol partidoFutbol) {
        this.partidoFutbol = partidoFutbol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localidadPartidoPK != null ? localidadPartidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalidadPartido)) {
            return false;
        }
        LocalidadPartido other = (LocalidadPartido) object;
        if ((this.localidadPartidoPK == null && other.localidadPartidoPK != null) || (this.localidadPartidoPK != null && !this.localidadPartidoPK.equals(other.localidadPartidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.examen1.model.LocalidadPartido[ localidadPartidoPK=" + localidadPartidoPK + " ]";
    }
    
}
