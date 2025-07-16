package Queue;

import java.util.PriorityQueue;

public class Priority_queue {
    public void minqueue(){
        PriorityQueue<Integer>minpq=new PriorityQueue<>();
        minpq.add(32);
        minpq.add(29);
        minpq.add(60);
        minpq.add(24);
        minpq.add(89);

        while(!minpq.isEmpty()){
            System.out.println(minpq.poll());
        }
    }
    public void maxqueue(){
        PriorityQueue<Integer>maxpq=new PriorityQueue<>((Integer a,Integer b)->(b-a));
        maxpq.add(32);
        maxpq.add(29);
        maxpq.add(60);
        maxpq.add(24);
        maxpq.add(89);

        while(!maxpq.isEmpty()){
            System.out.println(maxpq.poll());
        }
    }
}
