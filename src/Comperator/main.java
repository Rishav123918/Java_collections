package Comperator;

import java.util.Arrays;

public class main {
    public static void main(String args[]){
        Integer a[]={6,3,7,3,6,3,6,1,8,2,5};
        System.out.println("In increasing order");
        Arrays.sort(a,(Integer x,Integer y)->x-y);
        for(Integer c:a){
            System.out.println(c);
        }
        System.out.println("In decreasing order");
        Arrays.sort(a,(Integer x,Integer y)->y-x);
        for(Integer c:a){
            System.out.println(c);
        }

        sort_car car[]=new sort_car[3];
        car[0]=new sort_car("suv","Blue");
        car[1]=new sort_car("suv1","Blue1");
        car[2]=new sort_car("suv2","Green");

        Arrays.sort(car,(sort_car obj1,sort_car obj2)->obj1.color.compareTo(obj2.color));
        for(sort_car c:car){
            System.out.println(c.name+" "+c.color);
        }
        Arrays.sort(car,(sort_car obj1,sort_car obj2)->obj2.color.compareTo(obj1.color));
        System.out.println("jhgfd");
        for(sort_car c:car){
            System.out.println(c.name+" "+c.color);
        }
        int x = 10;
        int y = 5;
        int sum = x + y;       // Set breakpoint here
        System.out.println("Sum: " + sum);
    }
}
