package models;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int cedula;



    public Person(String name, int age, int cedula) {
        this.name = name;
        this.age = age;
        this.cedula = cedula;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", cedula=" + cedula + "]";
    }

    @Override
    public int compareTo(Person o) {

        int cmp = this.name.compareTo(o.name);
        if (cmp == 0) {
            return Integer.compare(o.age, this.age);
        }
        return cmp;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    

}
