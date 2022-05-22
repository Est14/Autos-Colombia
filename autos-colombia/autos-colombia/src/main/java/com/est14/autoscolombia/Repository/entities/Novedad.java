package com.est14.autoscolombia.Repository.entities;

import javax.persistence.*;
import java.util.Date;

@Table (name = "novedad")
@Entity
public class Novedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String observacion;
    private Date fecha;

    @Column(name = "tipo_novedad")
    private Integer tipoNovedad;

    @Column(name = "vehiculo")
    private String vehiculoID;


    @ManyToOne
    @JoinColumn(name = "tipo_novedad", insertable = false, updatable = false)
    private TipoNovedad tipo;

    @ManyToOne
    @JoinColumn(name = "vehiculo", insertable = false, updatable = false)
    private Vehiculo vehiculo;


    public TipoNovedad getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovedad tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getVehiculoID() {
        return vehiculoID;
    }

    public void setVehiculoID(String vehiculoID) {
        this.vehiculoID = vehiculoID;
    }

    public Integer getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(Integer tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
