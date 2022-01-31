package me.dio.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    private PhoneType(String description){
        this.description = description;
    }
}
