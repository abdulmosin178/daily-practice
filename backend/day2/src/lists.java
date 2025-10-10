//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.sound.midi.Soundbank;
import java.util.*;
public class lists{
    public static void main(String[] args) {
    //arraylist-fast random access
        ArrayList<String> f=new ArrayList<>();
        f.add("mine");
        f.add("line");
        System.out.println(f);
        System.out.println("random access:"+f.get(0));
        //LinkedList-fast Insertion/Deletion
        LinkedList<String> g=new LinkedList<>();
        g.add("rahman");
        g.addFirst("ajith");
        g.addLast("heart");
        System.out.println(g);
        g.removeFirst();
        System.out.println(g);
        //vector-threadsafe
        Vector<String> h=new Vector<>();
        h.add("all");
        h.add("worst");
        System.out.println(h);
        synchronized (h){
            for(String ht:h) System.out.println(ht);
        }
        //stack-lifo
        Stack<String> s=new Stack<>();
        s.push("one");
        s.push("two");
        s.push("three");
        System.out.println(s);
        //s.pop();//remove the element
        System.out.println(s);
        System.out.println("Stack peek (top element): " + s.peek());

        /// /SET////////////////////
        //A Set is a Collection that stores unique elements only.
        //When you need unique elements.
        //✅ When order is not important → use HashSet.
        //✅ When you need insertion order → use LinkedHashSet.
        //✅ When you need sorted order → use TreeSet.
            Set<String> s1=new HashSet<>();
            s1.add("ko");
            s1.add("lee");
            s1.add("rohit");
        System.out.println(s1);//here hashset does not maintain any order in op
        Set<String> s2=new LinkedHashSet<>();
        s2.add("ko");
        s2.add("lee");
        s2.add("rohit");
        s2.add("Rohit");//here no case sensitive so this line will print
        System.out.println(s2);
        Set <String> s3=new TreeSet<>();
        s3.add("sili");
        s3.add("paravai");
        s3.add("raj");
        System.out.println(s3);//here sorted output come
/// ////////MAP//////
        //A Map stores key-value pairs.
        //key-unique but multiple key have same value
        //Access elements by key → map.get(key)
        //
        //Main operations:
        //
        //put(key, value) → add/update
        //
        //get(key) → access value
        //
        //remove(key) → remove entry
        //
        //containsKey(key) / containsValue(value) → check existence
        //
        //keySet() / values() / entrySet() → iterate
        Map<Integer,String> h1=new HashMap<>();//hashmap-->>
        h1.put(1,"abdul");
        h1.put(2,"mosin");
        h1.put(3,"jaga");
        h1.put(4,"rasi");
        System.out.println(h1);//same like hashset
        Map<Integer,String> h2=new LinkedHashMap<>();
        h2.put(1,"ab");
        h2.put(2,"cd");
        h2.put(3,"ef");
        System.out.println(h2);
        Map<Integer,String> h3=new TreeMap<>();
        h3.put(1,"abinesh");
        h3.put(2,"call");
        h3.put(3,"me");
        System.out.println(h3);
        for(Map.Entry<Integer,String> entry:h2.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());

        }

    }
}
