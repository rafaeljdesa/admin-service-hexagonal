package br.com.iot.adminservice.adapter.entity;

import br.com.iot.adminservice.domain.model.IotTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "iot")
public class IotEntity implements Serializable {

    @Id
    private String id;
    private String macAddress;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String model;
    private IotTypeEnum type;

}
