package Singlenton_synchrinized;

public class single_object {
    private static single_object instance;
    private single_object(){
        System.out.println("work started");
    }

    synchronized public static single_object getInstance(){
        if(instance==null){
            instance=new single_object();
        }
        return instance;
    }
    public void greet()
    {
        System.out.println("Completed"+Thread.currentThread().getName());

    }
}
