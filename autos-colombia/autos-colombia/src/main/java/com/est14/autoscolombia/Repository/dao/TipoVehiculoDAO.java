package com.est14.autoscolombia.Repository.dao;

import com.est14.autoscolombia.Repository.entities.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoVehiculoDAO extends JpaRepository<Integer, TipoVehiculo> {

    Optional<TipoVehiculo> findById(Integer id);
    void save(TipoVehiculo tipoVehiculo);
}
