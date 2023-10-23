package com.example.cargodispatchapi.mapper;

import com.example.cargodispatchapi.model.ShipmentEvent;
import com.example.cargodispatchapi.model.DispatchRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShipmentMapper {
    ShipmentMapper MAPPER = Mappers.getMapper(ShipmentMapper.class);

    ShipmentEvent mapToShipmentEvent(DispatchRequest dispatchRequest);
}
