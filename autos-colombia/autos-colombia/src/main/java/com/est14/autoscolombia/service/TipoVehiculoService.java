package com.est14.autoscolombia.service;

import com.est14.autoscolombia.Repository.entities.TipoVehiculo;

public interface TipoVehiculoService {

    TipoVehiculo getTipoVehiculo(Integer id);
    void saveTipoVehiculo(TipoVehiculo tipoVehiculo);
}
