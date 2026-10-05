public class car {

    // properities of the car
    String name;
    String color;
    String modName;
    
    // Constructor
    car(String name, String color,String modName){
         this.name=name;  // r1.name = name // name argument is passed while creating the object
         this.color=color;
         this.modName=modName;
    }

    // Method for car -- does some action
     void start(String name){
      System.out.println("The car is started by"+name);
     } 
     void stop(){
      System.out.println("The car is stopped");
     }
     void Accerlate(){
      System.out.println("The car speed as increased");
     }

 public static void main(String[] args){
    car r1=new car("BMW","Black","x5"); // arguments
    r1.start("Ravi");
    r1.Accerlate();
    r1.stop();
 }

}
