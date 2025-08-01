package Exception_in_finally;

public class Finally_exp {
    public static void main(String[] args) throws RuntimeException{
        try{
            System.out.println("in try block");
            throw new RuntimeException("throwing exception from try block");
//            System.out.println("in try block 2");
        }
        catch(Exception e){
            System.out.println("in catch block exception: "+e.getMessage());
        }
        finally{
            throw new RuntimeException("throwing exception from finally block");
//            System.out.println();
        }
    }
}
