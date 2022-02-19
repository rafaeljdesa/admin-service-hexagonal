package br.com.iot.adminservice.domain.factory;

import br.com.iot.adminservice.domain.dto.IotDTO;
import br.com.iot.adminservice.domain.model.Iot;
import br.com.iot.adminservice.domain.model.IotTypeEnum;

public class IotFactory {

    public static Iot from(IotDTO iotDTO) {
        Iot iot = new Iot();
        iot.setId(iotDTO.getId());
        iot.setModel(iotDTO.getModel());
        iot.setMacAddress(iotDTO.getMacAddress());
        iot.setLatitude(iotDTO.getLatitude());
        iot.setLongitude(iotDTO.getLongitude());
        iot.setType(IotTypeEnum.from(iotDTO.getType()));
        return iot;
    }

    public static IotDTO to(Iot iot) {
        IotDTO dto = new IotDTO();
        dto.setId(iot.getId());
        dto.setModel(iot.getModel());
        dto.setMacAddress(iot.getMacAddress());
        dto.setLatitude(iot.getLatitude());
        dto.setLongitude(iot.getLongitude());
        dto.setType(iot.getType().name());
        return dto;
    }

}
