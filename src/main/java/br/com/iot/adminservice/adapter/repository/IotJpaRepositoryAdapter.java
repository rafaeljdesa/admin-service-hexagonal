package br.com.iot.adminservice.adapter.repository;

import br.com.iot.adminservice.adapter.entity.IotEntity;
import br.com.iot.adminservice.adapter.factory.IotEntityFactory;
import br.com.iot.adminservice.domain.dto.IotDTO;
import br.com.iot.adminservice.domain.port.repository.IotRepository;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class IotJpaRepositoryAdapter implements IotRepository {

    private final IotJpaRepository repository;

    public IotJpaRepositoryAdapter(IotJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public IotDTO save(IotDTO iotDTO) {
        IotEntity iotEntity = repository.save(IotEntityFactory.from(iotDTO));
        return IotEntityFactory.to(iotEntity);
    }

    @Override
    public boolean deleteById(String id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public IotDTO findById(String id) {
        Optional<IotEntity> optionalIot = repository.findById(id);
        if (optionalIot.isEmpty()) {
            return null;
        }
        return IotEntityFactory.to(optionalIot.get());
    }

    @Override
    public List<IotDTO> findAll() {
        List<IotEntity> iots = repository.findAll();
        if (CollectionUtils.isEmpty(iots)) {
            return null;
        }
        return iots.stream()
                .map(IotEntityFactory::to)
                .collect(Collectors.toList());
    }

}
