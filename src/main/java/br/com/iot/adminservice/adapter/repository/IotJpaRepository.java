package br.com.iot.adminservice.adapter.repository;

import br.com.iot.adminservice.adapter.entity.IotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IotJpaRepository extends JpaRepository<IotEntity, String> {
}
