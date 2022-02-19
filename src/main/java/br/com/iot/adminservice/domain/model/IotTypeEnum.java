package br.com.iot.adminservice.domain.model;

public enum IotTypeEnum {

    TEMPERATURE,
    WATER,
    PRESSURE,
    MOVEMENT,
    PRESENCE,
    OTHER;

    public static IotTypeEnum from(String type) {
        for (IotTypeEnum iotTypeEnum : values()) {
            if (iotTypeEnum.name().equals(type)) {
                return iotTypeEnum;
            }
        }
        return null;
    }
}
