/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author yazbe
 */
@Embeddable
public class LocalidadPartidoPK implements Serializable {

    
    @Column(name = "codigo_localidad")
    private String codigoLocalidad;
    
    @Column(name = "codigo")
    private String codigo;

    public LocalidadPartidoPK() {
    }

    public LocalidadPartidoPK(String codigoLocalidad, String codigo) {
        this.codigoLocalidad = codigoLocalidad;
        this.codigo = codigo;
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoLocalidad != null ? codigoLocalidad.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalidadPartidoPK)) {
            return false;
        }
        LocalidadPartidoPK other = (LocalidadPartidoPK) object;
        if ((this.codigoLocalidad == null && other.codigoLocalidad != null) || (this.codigoLocalidad != null && !this.codigoLocalidad.equals(other.codigoLocalidad))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.examen1.model.LocalidadPartidoPK[ codigoLocalidad=" + codigoLocalidad + ", codigo=" + codigo + " ]";
    }
    
}
