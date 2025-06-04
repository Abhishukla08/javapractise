public class student{
    String firstname="Rahul";
    String secondname=" Ravi";
    void fullName(){
        System.out.println(firstname+ "    "+secondname);
    }
}
class hello{
    public static void main(String[]args){
        student obj=new student();
        obj.fullName();
    }
}
// create class car with their details
class car{
    String brand1="hyundai";
    String  model1="alto";
    String  price="5.6 L";
    String brand2="hyundai";
    String  model2="creta";
    String  price2="15.7 L";
    void Info()
    {
        System.out.println( brand1+"  "+model1+"  "+price);
        System.out.println(brand2+"  "+model2+"  "+price2);
    }
}



