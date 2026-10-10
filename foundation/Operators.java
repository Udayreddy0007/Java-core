package foundation;
// Operators in Java

// 1-- Arithmetic operator
//public class Operators{
//    public static void main(String[] args){
//        int a =10;
//        int b = 20;
//        int c = a % b ;
//        System.out.println(c);
//    }
//}

// 2 - Assignment / compound assignment operator

//public class Operators{
//    public static void main(String[] args){
//        int a =10;
//        //System.out.println(a);
//        a += 5;  // a += --> a + 5--10+5 =15
//        System.out.print("After += the value" + a);
//        a -=10;
//        System.out.println("After -= the value is :" + a);
//        a ++ ; // increment
//        System.out.println("After ++ the value is :" + a);
//        a --; // decrement
//        System.out.println("After -- the value is :" + a);
//    }
//}
  
// 3 - Comparision / relational operators
  // public class Operators{
  // public static void main(String[] args){
  //     int a =10;
  //     int b = 20;
  //     System.out.println(a==b);
  //     System.out.println(a>=b);
  //     System.out.println(a<=b);
  //     System.out.println(a != b);
  //     System.out.println(a>b); // fasle
  //     System.out.println(a<b); // true
  // }
//}

public class Operators{
    public static void main(String[] args){
        boolean personAge = true;
        boolean hasId = true;
        System.out.println( personAge && hasId);
         System.out.println( personAge || hasId);
          System.out.println( !personAge);
    }
}
