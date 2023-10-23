package com.example.cargodispatchapi.service;

import com.example.cargodispatchapi.model.DispatchRequest;
import org.springframework.stereotype.Service;

@Service
public interface CargoService {
    void DispatchCargoMessage(DispatchRequest dispatchRequest);
}
