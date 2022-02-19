package br.com.iot.adminservice.domain.service.impl;

import br.com.iot.adminservice.domain.dto.IotDTO;
import br.com.iot.adminservice.domain.port.repository.IotRepository;
import br.com.iot.adminservice.domain.service.IotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class IotServiceImpl implements IotService {

    private final IotRepository repository;

    public IotServiceImpl(IotRepository repository) {
        this.repository = repository;
    }

    @Override
    public IotDTO createIot(IotDTO iotDTO) {
        if (iotDTO.getId() != null) {
            return updateIot(iotDTO);
        }

        iotDTO = repository.save(iotDTO);

        return iotDTO;
    }

    @Override
    public IotDTO updateIot(IotDTO iotDTO) {
        if (iotDTO.getId() == null) {
            return createIot(iotDTO);
        }

        iotDTO = repository.save(iotDTO);

        return iotDTO;
    }

    @Override
    public IotDTO getById(String id) {
        IotDTO iotDTO = repository.findById(id);

        if (iotDTO == null) {
            log.error("Unable to find Iot by id {}", id);
        }

        return iotDTO;
    }

    @Override
    public void deleteById(String id) {
        IotDTO iotDTO = repository.findById(id);

        if (iotDTO == null) {
            log.error("Unable to find Iot by id {}", id);
            return;
        }

        repository.deleteById(id);
    }

    @Override
    public List<IotDTO> getAll() {
        List<IotDTO> iotDTOS = repository.findAll();

        return iotDTOS;
    }
}
