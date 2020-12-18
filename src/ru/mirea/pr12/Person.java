package ru.mirea.pr12;

public class Person {
    private String fName, sName, mName;

    Person(String sName){
        this.sName = sName;
    }

    Person(String surname, String name, String middleName){
        this.sName = surname;
        this.fName = name;
        this.mName = middleName;
    }

    public String toString(){
        if (fName == null || mName == null) {
            return (sName);
        } else {
            return (sName + " " + ((fName.toUpperCase()).toCharArray())[0] + ". " + ((mName.toUpperCase()).toCharArray())[0] + ".");
        }
    }

    public static void main(String[] args) {
        Person people = new Person("Кириллов", "Михаил", "Петрович");
        System.out.println(people.toString());
        Person people1 = new Person("Кириллов");
        System.out.println(people1.toString());
    }
}
