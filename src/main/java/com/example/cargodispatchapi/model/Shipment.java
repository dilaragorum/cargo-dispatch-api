package com.example.cargodispatchapi.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Shipment {
    private int shipmentId;
    private String cargoType;
    private String processType;

    public String toString() {
        return String.format("shipmentID: %d, cargoType: %s, processType: %s", shipmentId, cargoType, processType);
    }
}
