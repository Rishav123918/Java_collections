package Hash_set;

import java.util.HashSet;

public class Hash_set {

    public static void main(String args[]){
        HashSet<String>st=new HashSet<>();
        st.add("apple");
        st.add("banana");
        st.add("cherry");
        st.add("apple"); // not include

        System.out.println(st.size());
        System.out.println(st.isEmpty());

        for (Object i:st){
            System.out.println(i);
        }

        System.out.println(st.contains("apple"));
        System.out.println(st.contains("cherry"));

        st.add("cherry");
        st.remove("cherry");

        HashSet<String> otherSet = new HashSet<>();
        otherSet.add("banana");
        otherSet.add("cherry");

        st.addAll(otherSet);
        System.out.println("Print union");
        for(Object i:st) System.out.println(i);

        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("banana");
        anotherSet.add("dragonfruit");

        st.retainAll(anotherSet);
        System.out.println("Intersaction");
        for(Object i:st){
            System.out.println(i);
        }
        HashSet<String> finalSet = new HashSet<>();
        finalSet.add("banana");
        finalSet.add("apple");

        finalSet.removeAll(anotherSet); // remove banana
        System.out.println("Difference: " + finalSet);

    }
}
