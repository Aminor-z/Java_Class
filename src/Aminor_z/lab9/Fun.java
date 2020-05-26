package Aminor_z.lab9;

import java.util.*;

public class Fun {
    public void _ArrayList()
    {
        System.out.println("\nArrayList:");
        ArrayList<String> list = new ArrayList<String>();
        list.add("James");
        list.add("Tom");
        list.add("Steven");
        list.add("Alice");
        for(int count=0;count<list.size();count++)
            System.out.println(list.get(count)+" ");
        System.out.println();
        Iterator iter =list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next()+" ");
            if(iter.equals("Tom"))
            {
                iter.remove();
            }
        }
        list.sort((String a,String b)->{return a.compareTo(b);});
        for (String it:list
        ) {
            System.out.println(it);
        }
    }
    public void _LinkedList()
    {
        System.out.println("\nArrayList:");
        LinkedList<String> list = new LinkedList<String>();
        list.add("James");
        list.add("Tom");
        list.add("Steven");
        list.add("Alice");
        list.stream().map(s -> s + " ").forEach(System.out::println);
        System.out.println();
        Iterator iter =list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next()+" ");
            if(iter.equals("Tom"))
            {
                iter.remove();
            }
        }
        list.sort((String a,String b)->{return a.compareTo(b);});
        for (String it:list
        ) {
            System.out.println(it);
        }
    }
    public void _HashMap() {
        System.out.println("\nHashMap:");
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("15H002", new Student("15H002", "孙悟空", 2000));
        hashMap.put("15H001", new Student("15H001", "唐僧", 40));
        hashMap.put("15H003", new Student("15H003", "猪八戒", 1000));
        System.out.println("Search 15H003:");
        Student s = hashMap.get("15H003");
        System.out.println((s == null) ? "Key not found." : s.toString());
        System.out.println("Search 15H004:");
        s = hashMap.get("15H004");
        System.out.println((s == null) ? "Key not found." : s.toString());
        System.out.println("Output All Info:");
        for (Map.Entry<String, Student> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        hashMap.remove("15H001");
        System.out.println("Output All Info After Remove 唐僧:");
        var values = hashMap.values().toArray();
        for (var _s : values){
            System.out.println(_s.toString());
        }
    }
}
