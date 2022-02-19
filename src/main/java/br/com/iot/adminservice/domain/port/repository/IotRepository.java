package br.com.iot.adminservice.domain.port.repository;

import br.com.iot.adminservice.domain.dto.IotDTO;

import java.util.List;

public interface IotRepository {

    IotDTO save(IotDTO iotDTO);
    boolean deleteById(String id);
    IotDTO findById(String id);
    List<IotDTO> findAll();

}
