public class Wrapperclasses {
    public static void main(String[] args) {
        int age=19;
        Integer age1 = Integer.valueOf(14);
        //boxing primitive type converted to wrapper object is called boxing

        int a=10;
        Integer b = a;
        //Autoboxing -- java automatically coverts the primitive to wrapper 
        System.out.println(b);


        //Unboxing - converts the Wrapper object into primitive
        Integer c = Integer.valueOf(15);
        int d=c;
        System.out.println(d);

        //Auto-Unboxing -- Wrapper class to primitive

        Integer e =16;
        int f=e;
        System.out.println(f);


    
    }
}


// Java Api -- it require a object of int , char , boolean 

// wrapper classes-  creation of objects for the primitive datatypes