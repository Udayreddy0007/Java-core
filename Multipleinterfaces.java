public class Multipleinterfaces {

    public static void main(String[] args){
        person p1=new person();
        p1.read();
        p1.write();
        p1.painting();
    }
}

interface hobbies {
    void read();
    void write();

}
interface paint{
    void painting();
}

class person implements hobbies , paint{
    public void read(){
        System.out.println("That prsn is reading");
    }
    public void write(){
        System.out.println("That prsn is writing");

    }
    public void painting(){
        System.out.println("That prsn is painting ");
    }

}





