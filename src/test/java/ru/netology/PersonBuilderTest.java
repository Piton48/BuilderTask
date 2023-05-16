package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonBuilderTest {

    PersonBuilder builder = new PersonBuilder();
    int age = -1;
    String name = "Вадик";

    @Test
    void setAgeTest() {
        Assertions.assertThrows(IllegalArgumentException.class
                , () -> builder.setAge(age));
    }

    @Test
    void buildTest() {
        Assertions.assertThrows(IllegalArgumentException.class
                , () -> builder.setName(name).build());
    }

}
