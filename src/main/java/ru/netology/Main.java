package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurName("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

//        try {
//            // Не хватает обязательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }

//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}
