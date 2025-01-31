package models;

public class Person {
    String name;
    String surname;
    int age;
    boolean gender;

    public Person(){}


    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        String genderToString = gender ? "Male" : "Female";
        return "Person{" + "Him I am" +
                "name=" + name + "year old" +
                ", surname='" + surname + '\'' +
                ", age'" + age + '\'' +
                ", gender=" + genderToString +
                '}';
    }



}


