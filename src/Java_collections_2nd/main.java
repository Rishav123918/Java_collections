package Java_collections_2nd;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class main {
    public static void main(String args[])throws Exception{
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);list.add(3);list.add(4);

        System.out.println("Size of list : "+list.size());
        System.out.println("Empty check : "+list.isEmpty());
        System.out.println("contains : "+list.contains(3));
        try{
            list.remove(4);
        }catch(Exception e){
            System.out.println("out of bound ");
        }

        System.out.println("contains : "+list.contains(4));
        list.remove(2);
        list.remove(Integer.valueOf(2));
        Stack<Integer>st=new Stack<>();
        st.add(6);
        st.add(7);
        st.add(8);
        list.addAll(st);
        System.out.println("contain check : "+list.containsAll(st));
        System.out.println("Contain check : "+st.containsAll(list));
        list.remove(Integer.valueOf(1));
        list.removeAll(st);
        System.out.println("check at 0 index"+list.contains(1));

        for(Integer i:list){
            System.out.println(i);
        }
        list.clear();
       // st.clear();



    }
}
