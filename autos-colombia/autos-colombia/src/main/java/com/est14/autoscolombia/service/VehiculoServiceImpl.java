package com.est14.autoscolombia.service;

import com.est14.autoscolombia.Repository.dao.VehiculoDAO;
import com.est14.autoscolombia.Repository.entities.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoDAO vehiculoDAO;

    @Override
    public List<Vehiculo> listVehiculos() {
        return vehiculoDAO.findAll();
    }

    @Override
    public Optional<Vehiculo> getVehiculo(String placa) {
        return vehiculoDAO.findById(placa);
    }

    @Override
    public void saveVehiculo(Vehiculo vehiculo) {
        vehiculoDAO.save(vehiculo);
    }
}
