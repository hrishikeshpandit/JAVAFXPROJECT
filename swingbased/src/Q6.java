import java.io.*;
class Callme {
    synchronized void call(String msg1,String msg2,String msg) {
        System.out.print(msg1+ msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print(msg2);
    }
}
class Caller implements Runnable {
    String msg,msg1,msg2;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s1,String s2,String s) {
        target = targ;
        msg = s;
        msg1=s1;
        msg2=s2;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg1,msg2,msg);
    }
}
class Q6 {
    public static void main(String args[]) {
        Callme target = new Callme();
        new Caller(target,"\"","\"" ,"NMAMIT");
        new Caller(target,"[","]" , "Nitte");
        new Caller(target, "(",")", "Autonomous Institute");
        new Caller(target, "{","}", "Karkala");
    }
}
