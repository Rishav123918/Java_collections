package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

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

        PriorityBlockingQueue<Integer>p=new PriorityBlockingQueue<>();//it is thread safe

        LinkedList<Integer>li=new LinkedList<>();
        li.addLast(12);
        li.addLast(13);
        li.addLast(14);
        li.addLast(15);
        li.addFirst(90);

        li.forEach((element)-> System.out.println(element));

        LinkedList<Integer>li2=new LinkedList<>();
        li2.add(0,6);
        li2.add(1,67);
        li2.add(2,61);
        li2.add(3,68);
        li2.forEach(element -> System.out.println(element));


    }
}
