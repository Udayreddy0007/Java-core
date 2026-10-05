// public class encapsulation {
//     private int speed;
//     String brandName;
// 
//     public void setValue(int speed) {
// 
//         if (speed >= 0 && speed <= 200) {
//             this.speed = speed;
//         } else {
//             System.out.println("Invalid speed");
//         }
// 
//     }
// 
//     public int getValue() {
//         return speed;
//     }
// 
//     void work() {
//         System.out.println("The car is working");
//     }
// 
//     void breakDown() {
//         System.out.println("The Car has stopped working");
//     }
// 
//     public static void main(String[] args) {
// 
//         BMW car2 = new BMW();
//         car2.setValue(200);
//         System.out.println(car2.getValue());
// 
//     }
// }
// 
// class BMW extends encapsulation {
// 
//     void work() {
//         System.out.println("The BMW has started ");
// 
//     }
// 
// }

public class encapsulation{
    void start(){
        System.out.println("The car has started");

    }
    // getter -- get info
    // setter --  setting the value

    private int speed ; // no one can access it 
    String name;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed >=0 && speed <=200){
            this.speed = speed;
        }
        else{
            System.out.println("Invalid speed");
        }
    }
    
    public static  void main(String[] args){
        BMW b1 = new BMW();
        b1.setSpeed(200);
        System.out.println(b1.getSpeed());
        b1.start();
        b1.speed();
        b1.turbo();
    }

}

class BMW extends encapsulation{
    

    void speed(){
        System.out.println("The BMW has satrted ");

    }
    void turbo(){
        System.out.println("The turbo mode is turned on ");

    
    }

}