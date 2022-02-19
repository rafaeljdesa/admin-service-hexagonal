package br.com.iot.adminservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Iot {

    private String id;
    private String macAddress;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String model;
    private IotTypeEnum type;

}
