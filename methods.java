// Method -- A block code which does some action
//ex : a car an accelerate , stop , break
// return type --does some action give an output  and void - will do some action but doesnt given anything back

class methods // calculator
{
   int add() {
      return 10 + 20;
      // return 30;
   }

   public static void main(String[] args) {
      methods m1 = new methods();
      int res = m1.add();
      System.out.println(res);

   }
}
