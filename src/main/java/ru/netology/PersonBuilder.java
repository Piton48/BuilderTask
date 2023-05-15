package ru.netology;

public class PersonBuilder {
    public String name;
    public String surName;
    public int age = -1;
    public String city;

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else throw new IllegalArgumentException("Возраст не может быть отрицательным!");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person build() {
        if (name != null & surName != null) {
            return new Person(name, surName, age, city);
        } else throw new IllegalArgumentException("На заданны обязательные поля (имя, или фамилия)!");
    }
}
