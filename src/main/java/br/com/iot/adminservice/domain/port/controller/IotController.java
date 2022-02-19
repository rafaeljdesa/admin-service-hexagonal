package br.com.iot.adminservice.domain.port.controller;

import br.com.iot.adminservice.domain.dto.IotDTO;

import java.util.List;

public interface IotController {

    IotDTO createIot(IotDTO iotDTO);
    IotDTO updateIot(IotDTO iotDTO);
    IotDTO getById(String id);
    void deleteById(String id);
    List<IotDTO> getAll();

}
