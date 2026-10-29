public class Person{
    int ID;
    String name;
    public Person(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
}

class Patient extends Person{
    public Patient(int ID, String name){
        super(ID, name);
    }
}

class Employee extends Person{
    public Employee(int ID, String name){
        super(ID, name);
    }
}

class Doctor extends Employee{
    String speciality;
    boolean available;
    public Doctor(int ID, String name, String speciality, boolean available){
        this.speciality = speciality;
        this.available = available;
        super(ID, name);
    }
}

class Nurse extends Employee{
    public Nurse(int ID, String name){
        super(ID, name);
    }
}

class Secretary extends Employee{
    public Secretary(int ID, String name){
        super(ID, name);
    }
}