
public class Person{
    private String name;
    private String surname;

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Person(){
        this.name = "Furkan";
    }
    //Constructor
    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;

    }
}
