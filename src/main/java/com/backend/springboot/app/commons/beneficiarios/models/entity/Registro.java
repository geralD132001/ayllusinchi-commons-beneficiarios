package com.backend.springboot.app.commons.beneficiarios.models.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tmv_registro")
public class Registro {

    @Id
    @Column(name = "id_registro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @Column(name = "fe_registro")
    private Date fecha;

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
