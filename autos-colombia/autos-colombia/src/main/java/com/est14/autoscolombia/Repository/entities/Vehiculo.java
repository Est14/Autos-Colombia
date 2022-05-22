package com.est14.autoscolombia.Repository.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "vehiculo")
@Entity
public class Vehiculo {

    @Id
    @Column(name = "id_vehiculo")
    private String id;

    private String marca;
    private String modelo;
    @Column(name = "tipo")
    private Integer tipoVehiculo;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "tipo", updatable = false, insertable = false)
    private TipoVehiculo tipo;

    @OneToMany(mappedBy = "vehiculo")
    private List<Novedad> novedades;

    @OneToMany(mappedBy = "vehiculo")
    private List<EntradaSalida> entradaSalidaList;


    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public List<Novedad> getNovedades() {
        return novedades;
    }

    public void setNovedades(List<Novedad> novedades) {
        this.novedades = novedades;
    }

    public List<EntradaSalida> getEntradaSalidaList() {
        return entradaSalidaList;
    }

    public void setEntradaSalidaList(List<EntradaSalida> entradaSalidaList) {
        this.entradaSalidaList = entradaSalidaList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Integer tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
