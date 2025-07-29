package Singlenton_synchrinized;

public class main {
    public static void main(String args[]) throws Exception
    {
        Runnable r=(()->{
           single_object inc=single_object.getInstance();
           inc.greet();
            System.out.println("Hash code"+inc.hashCode());
        });

        Thread t1=new Thread(r,"Thread a");
        Thread t2=new Thread(r,"Thread b");
        Thread t3=new Thread(r,"Thread c");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();



    }
}

/*

✅ Why All Hashcodes Are the Same?
Because:
In Singleton Pattern, only one object is ever created.
So when multiple threads call getInstance(), they all receive the same object reference.
 */
