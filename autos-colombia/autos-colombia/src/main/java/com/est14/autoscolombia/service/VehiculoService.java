package com.est14.autoscolombia.service;


import com.est14.autoscolombia.Repository.entities.Vehiculo;
import java.util.List;
import java.util.Optional;

public interface VehiculoService {

    List<Vehiculo> listVehiculos();
    Optional<Vehiculo> getVehiculo(String placa);
    void saveVehiculo(Vehiculo vehiculo);
}
