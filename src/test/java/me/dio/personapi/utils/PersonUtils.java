package me.dio.personapi.utils;

import me.dio.personapi.dto.request.PersonDTO;
import me.dio.personapi.dto.request.PhoneDTO;
import me.dio.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public class PersonUtils {

    private static final Long PERSON_ID = 1L;
    private static final String PERSON_FIRSTNAME = "Marcos";
    private static final String PERSON_LASTNAME = "Juca";
    private static final String PERSON_CPF = "000.000.000-00";
    private static final LocalDate PERSON_BIRTHDATE = LocalDate.of(2001,10,13);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(PERSON_FIRSTNAME)
                .lastName(PERSON_LASTNAME)
                .cpf(PERSON_CPF)
                .birthDate("2001-10-13")
                .id(PERSON_ID)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(PERSON_FIRSTNAME)
                .lastName(PERSON_LASTNAME)
                .cpf(PERSON_CPF)
                .birthDate(PERSON_BIRTHDATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }


}
