package me.dio.personapi.service;

import me.dio.personapi.dto.request.PersonDTO;
import me.dio.personapi.dto.response.MessageResponseDTO;
import me.dio.personapi.entity.Person;
import me.dio.personapi.repository.PersonRepository;
import me.dio.personapi.utils.PersonUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {

        PersonDTO personDTO = PersonUtils.createFakeDTO();
        Person expectedSavedPerson = PersonUtils.createFakeEntity();

        Mockito.when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        personService.createPerson(personDTO);

        MessageResponseDTO expectedMessageResponse = createdExpectedMessageResponse(expectedSavedPerson.getId());
        MessageResponseDTO successmessage = personService.createPerson(personDTO);

        assertEquals(expectedMessageResponse, successmessage);

    }

    private MessageResponseDTO createdExpectedMessageResponse(Long id) {
        return  MessageResponseDTO
                .builder()
                .message("Created person with ID " + id)
                .build();
    }
}
