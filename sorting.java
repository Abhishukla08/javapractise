class student{
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
