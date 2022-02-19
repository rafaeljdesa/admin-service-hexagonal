package br.com.iot.adminservice.domain.service;

import br.com.iot.adminservice.domain.dto.IotDTO;

import java.util.List;

public interface IotService {

    IotDTO createIot(IotDTO iotDTO);
    IotDTO updateIot(IotDTO iotDTO);
    IotDTO getById(String id);
    void deleteById(String id);
    List<IotDTO> getAll();

}
