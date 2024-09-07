package com.merion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.merion.core.Person;

import java.io.IOException;

public class PersonService {
    public Person parse(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        return person;
    }
    public String covert(Person person) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(person);
    }
}
