
// Non-static Inner class / Nested class
//public class innerclass{
//    public static void main(String[] args){
//        Car car = new Car();
//        Car.Engine engine = car.new Engine();
//         engine.start();;
//
//    }
//}
//
//
//
//class Car {
//    class Engine{
//        void start(){
//           System.out.println("Engine is started");
//        }
//    }
//}
//



//Static inner class/ Static nested class



public class innerclass{
    public static void main(String[] args){

        Car.musicSystem mus = new Car.musicSystem();
        mus.music();

    }
}



class Car {
    static class musicSystem{
        void music(){
            System.out.println("Music has started");
        }
    }
}