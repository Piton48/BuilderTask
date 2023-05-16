package ru.netology;

public class Person {
    protected final String name;
    protected final String surName;
    protected int age;
    protected String city;

    public Person(String name, String surName, int age, String city) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public boolean hasAge() {
        if (age == -1) {
            return false;
        } else return true;
    }

    public boolean hasCity() {
        if (city.equals(null)) {
            return false;
        } else return true;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder(String name) {
        return new PersonBuilder()
                .setName(name)
                .setSurName(this.surName)
                .setAge(0)
                .setCity(this.city);
    }

    @Override
    public String toString() {
        return (name + " " + surName + "\n" + "(возраст: " + age + " "
                + "проживает в городе: " + city + ")\n");
    }

}

