package com.example.cargodispatchapi.controller;

import com.example.cargodispatchapi.model.Shipment;
import com.example.cargodispatchapi.service.CargoService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dispatch")

public class CargoController {
    private final CargoService cargoService;

    @PostMapping
    public void DispatchCargoMessage(@RequestBody Shipment shipment) {
        cargoService.DispatchCargoMessage(shipment);
    }
}
