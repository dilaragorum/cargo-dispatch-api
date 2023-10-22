package com.example.cargodispatchapi.model;

import lombok.Data;

@Data
public class ShipmentEvent {
    private int shipmentId;
    private String processType;
}
