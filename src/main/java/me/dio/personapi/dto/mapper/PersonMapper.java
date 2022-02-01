package me.dio.personapi.dto.mapper;

import me.dio.personapi.dto.request.PersonDTO;
import me.dio.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "birthDate", target = "birthDate" , dateFormat = "yyyy-MM-dd")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
