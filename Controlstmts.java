public class Controlstmts{
    public static void main(String[] args){
        int num  = 1;
          String msg;
          switch(num)
          {
            case 1:
                  msg ="user chosen  value is 1";
             
            case 2:
                  msg="user chosen value is 2";
                  break;
                 
            
                default:
                  msg="user hasn't chosen any value";
          }
          System.out.println("the correct value chosen by the user is :" + msg);
    }
}