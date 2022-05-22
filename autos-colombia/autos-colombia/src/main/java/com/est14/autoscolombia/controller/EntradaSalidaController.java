package com.est14.autoscolombia.controller;

import com.est14.autoscolombia.Repository.entities.TipoVehiculo;
import com.est14.autoscolombia.service.TipoVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("autos-colombia/autos/api/")
public class EntradaSalidaController {

    @Autowired
    private TipoVehiculoService tipoVehiculoService;

    @GetMapping("tipoVehiculo/{id}")
    public ResponseEntity<TipoVehiculo> getTipoVehiculo(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(tipoVehiculoService.getTipoVehiculo(id), HttpStatus.OK);
    }

    @PostMapping
    public void saveTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
        tipoVehiculoService.saveTipoVehiculo(tipoVehiculo);
    }

}
