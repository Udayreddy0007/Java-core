public class interfaceses {

    public static void main(String[] args){
       Thar T1 = new Thar();
        T1.start();
        T1.stop();
        T1.turbo();
    }
    
}
interface Car{   // contract in which we give instruction

    void start();
    void stop();
    

}
class Thar implements Car{
    public void start(){
        System.out.println("The Thar started ");
    }
    public void stop(){
        System.out.println("The Thar stopped");
    }
    void turbo(){
        System.out.println("Thar turbo mode is on");
    }
}

