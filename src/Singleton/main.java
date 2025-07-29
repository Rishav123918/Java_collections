package Singleton;

public class main {
    public static void main(String args[])
    {
        Singleton_Lazy s1=Singleton_Lazy.getInstance();
        Singleton_Lazy s2=Singleton_Lazy.getInstance();

        s1.greet();
        s2.greet();
        System.out.println(s1==s2);
    }
}
