package abc;

public class cons {
    cons(){
       System.out.println("noo");
 }
 void eat(){
      System.out.println("okay");
 }
}
class helllo{
    public static void main(String[] args) {
        cons obj=new cons();
        obj.eat();
    }
}
