import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /// queue-fifo

        /// /three implementations -linkedlist,priorityqueue,arraydeque
       /// linkedlist

        /// operation-poll and offer dont use add and remove

        Queue<Integer> q=new LinkedList<>();
        q.offer(22);
        q.offer(22);
        q.offer(22);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.poll();
        //q.remove();

        /// priority queue
        Queue<Integer> q1=new PriorityQueue<>();
        q1.offer(22);
        System.out.println(q1);

        /// arraydeque
        Queue<String> q2=new ArrayDeque<>();
        q2.offer("21abd");
        System.out.println(q2);



        /// stack-lifo

        /// stack,using Arraydeque to implement stack most recommended,linkedlist


        Stack<Integer> s1=new Stack<>();
        s1.push(21);
        s1.push(22);
        s1.push(23);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);

        Deque<String> d1=new ArrayDeque<>();
        d1.push("abdul");
        d1.push("mosin");
        d1.push("kali");
        System.out.println(d1);
        d1.pop();
        System.out.println(d1);
        d1.peek();
        System.out.println(d1);




    }
}