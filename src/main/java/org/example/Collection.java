package org.example;
import java.util.*;
public class Collection {
    public static void main(String args[]) {
        //ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        Vector<String> list = new Vector<String>();
        //LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");//Adding object in arraylist
        list.add("Ravi");
        list.add(null);
        list.add("Ravi");
        list.add("Ravi");
        list.add(null);
//Traversing list through Iterator
  //      Stack<String> stack = new Stack<String>();
//        stack.push("Ayush");
//        stack.push("Garima");
//        stack.push(null);
//        stack.push("Ashish");
//        stack.push("Garima");
//       // stack.pop();
//
//        Iterator itr=list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
// From here on it is about Queue

//        PriorityQueue<String> queue=new PriorityQueue<String>();
//        queue.add("Raj");
//        queue.add("Vijay Raj");
//        queue.add("Vijay Raj");
//        queue.add("JaiShankar");
//
//        System.out.println("head:"+queue.element());
//        System.out.println("head:"+queue.peek());
//        System.out.println("iterating the queue elements:");
//        Iterator itr2=queue.iterator();
//        while(itr2.hasNext()){
//          //  System.out.println(itr2.next());
//        }
//        queue.remove();
//        queue.poll();
//        System.out.println("after removing two elements:");
//        Iterator<String> itr3=queue.iterator();
//        while(itr3.hasNext()){
//            //System.out.println(itr3.next());
//        }

//        Deque<String> deque = new ArrayDeque<String>();
//        deque.add("Gautam");
//        deque.add("Gautam");
//        deque.add("Ajay");

//        for (String str : deque) {
//            System.out.println(str);
//        }


        // From here it is Set
       // HashSet<String> set = new HashSet<String>();
        // LinkedHashSet<String> set=new LinkedHashSet<String>();
//        TreeSet<String> set=new TreeSet<String>();
//        //set.add(null);
//        set.add("Ravi");
//        //set.add(null);
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");
        //set.add(null);

//Traversing elements
//        Iterator<String> itr = set.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        Map map=new HashMap();
       // LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
      //  TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(2,"Rahul");
        map.put(7,"Jai");
        map.put(8,"Amit");
        map.put(0,"Amit");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry s=(Map.Entry)itr.next();
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}

//class TestGarbage1{
//   public void finalize()
//   {System.out.println("object is garbage collected");}
//    public static void main(String args[]){
//        TestGarbage1 s1=new TestGarbage1();
//        TestGarbage1 s2=new TestGarbage1();
//        s1=null;
//        s2=null;
//       System.gc();
//    }
//}