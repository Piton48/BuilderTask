package ru.netology;

public class PersonBuilder {
    public String name;
    public String surName;
    public int age = -1;
    public String city;

    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        } else throw new IllegalArgumentException("Возраст не может быть отрицательным!");
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name != null & surName != null) {
            return new Person(name, surName, age, city);
        } else throw new IllegalArgumentException("На заданны обязательные поля (имя и/или фамилия)!");
    }
}
