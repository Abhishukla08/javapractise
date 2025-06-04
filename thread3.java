class ByRunnable implements Runnable{
    public void run(){
        System.out.println("thread using running interface");
    }
}
public  class thread3 {
    public static void main(String[] args) {
        ByRunnable as=new ByRunnable();
        Thread t3=new Thread(as);
        t3.start();
        try{
            t3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int y=1;y<=5;y++){
            System.out.println(y);
        }

        System.out.println("main thread is running");
    }
}

class withdrawl extends Thread{
    static int totalamount=1000;
    int amount;

    public withdrawl(int amount){
        this.amount=amount;
    }
    public void run()
    {
        if (totalamount>=amount){
            System.out.println("is going to withdrawl"+ " "+amount);
                    try{
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException en){

                    }
                    totalamount=amount;
            System.out.println("Balance: "+ totalamount);

        }
        else {
            System.out.println("invalid amount");
        }
    }

}
 class thread33{
    public static void main(String[] args) {
       withdrawl wt=new withdrawl(500);
       withdrawl wt2=new withdrawl(250);
       wt.start();
       wt2.start();
    }
}

