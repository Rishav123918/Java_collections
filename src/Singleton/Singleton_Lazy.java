package Singleton;

public class Singleton_Lazy {
    private static Singleton_Lazy instance = null;

    private Singleton_Lazy(){
        System.out.println("Singleton instance created.");
    }
    public static Singleton_Lazy getInstance(){
        if(instance==null){
            instance=new Singleton_Lazy();

        }
        return instance;
    }

    public void greet(){
        System.out.println("Welcome to Singleton Pattern!");
    }

}
