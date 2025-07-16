package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main_queue {
    public static void main(String args[])
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);

        int i=0;
        while(i<q.size()){
            System.out.println("Element of queue is : "+q.peek());
            i++;
        }

        while(!q.isEmpty()){
            int x=q.poll();
            System.out.println("Element is : "+x);
        }

        Priority_queue x=new Priority_queue();
        x.minqueue();
        x.maxqueue();
    }
}
