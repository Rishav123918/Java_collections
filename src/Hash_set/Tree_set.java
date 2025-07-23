package Hash_set;

import java.util.TreeSet;

public class Tree_set {
    public static void main(String args[]){
        TreeSet<Integer>set=new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("size of set : "+set.size());
        set.remove(10);
        System.out.println("print"+set);
        System.out.println("check empty : "+set.isEmpty());

        set.add(10);
        TreeSet<Integer>temp=new TreeSet<>(set);
        for(Object i:temp){
            System.out.println("temp"+i);
        }

        System.out.println("first"+set.first());
        System.out.println("Last"+set.last());

        System.out.println("lower than 25 :"+set.lower(25)); //element that less than 25
        System.out.println("Greater than 25 :"+set.higher(25)); // element that gteater than 25

        System.out.println("Poll first :"+set.pollFirst());
        System.out.println("Poll last : "+set.pollLast());
        System.out.println("print set :"+set);
        System.out.println("set size : "+set.size());
    }
    //addAll , retainAll,removeAll;
}
