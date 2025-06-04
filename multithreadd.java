class Bythread extends Thread{
 public void run()
 {
     System.out.println("Hey");
 }
}
public class multithreadd {
    public static void main(String[] args) {
        Bythread t1=new Bythread();
         t1.start();
        System.out.println("no no no ");

    }
}

class downloadfile{
    public static void file(String file ) {
        for(int i=0;i==5;i++){
            System.out.println(file+"  downloading  " +(i=20) +"%");

        }
        try{
            Thread.sleep(200);

        }
        catch (Exception e){

        }
        System.out.println(file+"done");
    }
}
class multithread1 {
    public static void main(String[] args) {
        downloadfile  dd=new downloadfile();
        dd.file("file A");
        dd.file("file B");
    }
}