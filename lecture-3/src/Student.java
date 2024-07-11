import java.io.Serializable;







public class Student implements Serializable{
    
    //Genelde projelerde private olarak ilerlenir.
    private String name;
    private String surname;
    private int number;
    public static final Long serialVersionUID = 1L;

    public static void main(String[] args) {
        Student stdClass = new Student();
        stdClass.setName("Furkan");
        
    }


    //Constructor PARAMETRESİZ
    public Student(){
        this.name = "Adınızı girmediniz.";

    }
    //Constructor PARAMETRELİ

    public Student(String name,String surname,int number){
        this.name = name;
        this.surname= surname;
        this.number = number;
    }


    //GETTER AND SETTER HAZIR YAZILABİLİYOR.
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
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
