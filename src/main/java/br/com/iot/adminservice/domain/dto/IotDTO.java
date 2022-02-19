package br.com.iot.adminservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IotDTO implements Serializable {

    private String id;
    private String macAddress;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String model;
    private String type;

}
