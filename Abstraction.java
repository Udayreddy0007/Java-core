// Car analogy
    public class Abstraction {
    public static void main(String[] args){
       
        BMW b1 = new BMW("BMW");
        System.out.println("The brand name is :" +b1.Brand);
        b1.start();
        b1.stop();
        Benz b2 = new Benz("Benz");
        System.out.println("The brand name is :" +b2.Brand);
        b2.start();
        b2.stop();

    }
    
 }
 abstract class car{   // parent class
    
    String Brand;
    car(String Brand){
        this.Brand=Brand;
    }
    abstract void start(); // abstract method consists of only decalaration
    void stop(){
        System.out.println("The car has stopped");
    }

}

class BMW extends car{ 
    
    BMW(String Brand){
        super(Brand);        // super keyword is used to call the parent constructor inside a child class
    }
        // child class
    //@override
    void start(){
        System.out.println("Bmw has started");
    }
} 
class Benz extends car{                // child class
    
    
     Benz(String Brand){
        super(Brand);        // super keyword is used to call the parent constructor inside a child class
    }
    //@override
    void start(){
        System.out.println("Bmw has started");
    }

}

