package Hash_map;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {
    Map<Integer,String>mp=new HashMap<>();
    public Hash_map(){
       mp.put(12,"abc");
       mp.put(13,"def");
       mp.put(14,"fgh");
    }


    public String getvalue(){
      for (Map.Entry<Integer,String>mp1:mp.entrySet()){
            if(mp1.getValue().equals("abc")){
                return mp1.getValue();
            }
        }
      return "";
    }

    public String getvalue1() {
        for (Map.Entry<Integer, String> st : mp.entrySet()) {
            if (st.getValue().equals("abc")) {
                mp.remove(st.getValue().equals("def"));
            }
        }
        return "";
    }

    public Integer getkey(){
        for(Map.Entry<Integer,String>mp1:mp.entrySet()){
            if(mp1.getKey()==2){
                return mp1.getKey();
            }
        }
        return -1;
    }
    public boolean check(){
        if(mp.containsKey(2))return true;
//        if(mp.containsValue("abc"))return true;

        return false;
    }


    public void print(){
        System.out.println(mp);
    }
    public void allfun(){
        mp.remove(13);
        for(Map.Entry<Integer,String>mp1:mp.entrySet()){
            System.out.println(mp1.getKey()+ "   " +mp1.getValue());
        }
        System.out.println(mp.size());
        mp.clear();
        if(mp.isEmpty()){
            System.out.println("true");
        }
    }

  public static void main(String args[]){
        Hash_map obj=new Hash_map();
       obj.print();
      System.out.println(obj.getvalue());
      System.out.println(obj.getkey());
      System.out.println(obj.check());
      obj.allfun();

  }
}

