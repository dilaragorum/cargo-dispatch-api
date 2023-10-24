package com.example.cargodispatchapi.controller;

import com.example.cargodispatchapi.helper.TopicNameGenerator;
import com.example.cargodispatchapi.model.DispatchRequest;
import com.example.cargodispatchapi.service.CargoService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dispatch")
@Controller
public class CargoController {
    private final CargoService cargoService;

    @PostMapping
    public void DispatchCargoMessage(@RequestBody DispatchRequest dispatchRequest) {
        cargoService.DispatchCargoMessage(dispatchRequest);
    }
}
