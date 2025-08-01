package Basic_java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Integer>values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        Iterator<Integer>it=values.iterator();
        while(it.hasNext())
        {
            int x=it.next();
            if(x==3){
                it.remove();
            }
        }
        Iterator<Integer>it1=values.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
