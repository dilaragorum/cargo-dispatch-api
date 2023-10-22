package com.example.cargodispatchapi.service;

import com.example.cargodispatchapi.model.Shipment;
import org.springframework.stereotype.Service;

@Service
public interface CargoService {
    void DispatchCargoMessage(Shipment shipment);
}
