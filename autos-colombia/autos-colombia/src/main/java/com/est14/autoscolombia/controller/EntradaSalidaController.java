package com.est14.autoscolombia.controller;

import com.est14.autoscolombia.Repository.entities.TipoVehiculo;
import com.est14.autoscolombia.Repository.entities.Vehiculo;
import com.est14.autoscolombia.service.TipoVehiculoService;
import com.est14.autoscolombia.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autos-colombia/autos/api/")
public class EntradaSalidaController {

    @Autowired
    private TipoVehiculoService tipoVehiculoService;

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("tipoVehiculo/{id}")
    public ResponseEntity<TipoVehiculo> getTipoVehiculo(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(tipoVehiculoService.getTipoVehiculo(id), HttpStatus.OK);
    }

    @PostMapping("guardar")
    public void saveTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
        tipoVehiculoService.saveTipoVehiculo(tipoVehiculo);
    }

    @GetMapping("vehiculo")
    public ResponseEntity<List<Vehiculo>> list(){
        return new ResponseEntity<>(vehiculoService.listVehiculos(), HttpStatus.OK);
    }

    @GetMapping("vehiculo/{placa}")
    public ResponseEntity<Vehiculo> getVehiculo(@PathVariable("placa") String placa){
        return vehiculoService.getVehiculo(placa).map(vehiculo -> new ResponseEntity<>(vehiculo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("vehiculo/guardar")
    public void save(@RequestBody Vehiculo vehiculo){
        vehiculoService.saveVehiculo(vehiculo);
    }
}
