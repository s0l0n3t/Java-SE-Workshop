public class car {
    String driver = "";
    int speed = 0;
    int penalty;
    boolean licence;

    car(String driver,int speed){
        this.driver = driver;
        this.speed = speed;
        this.penalty = 0;
        this.licence = true;
        
    }
    void printDriver(){
        System.out.println("Name: "+this.driver);
        System.out.println("Speed: "+this.speed);
        System.out.println("Penalty: "+this.penalty);
        System.out.println("Licence: "+this.licence);
    }
}
