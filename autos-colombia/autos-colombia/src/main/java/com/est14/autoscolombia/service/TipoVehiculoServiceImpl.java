package com.est14.autoscolombia.service;

import com.est14.autoscolombia.Repository.dao.TipoVehiculoDAO;
import com.est14.autoscolombia.Repository.entities.TipoVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoDAO tipoVehiculoDAO;


    @Override
    public TipoVehiculo getTipoVehiculo(Integer id) {
        return tipoVehiculoDAO.findById(id).orElse(null);
    }

    @Override
    public void saveTipoVehiculo(TipoVehiculo tipoVehiculo) {
        tipoVehiculoDAO.save(tipoVehiculo);
    }
}
