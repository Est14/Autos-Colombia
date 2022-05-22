package com.est14.autoscolombia.Repository.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name = "administrador")
@Entity
public class Adminitrador implements Serializable {

    @Id
    @Column(name = "dni")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nombre;
    private String apellido;
    private String password;
    private String estado;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;


    @OneToMany(mappedBy = "adminitrador")
    private List<EntradaSalida> entradaSalidaList;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
