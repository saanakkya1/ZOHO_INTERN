//import java.util.ArrayList;
//import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.HashMap;
//import java.util.

public class COLL_INSIDE_COLL{


    public static  void main(String[] args) {
        HashSet<HashMap<Integer,String>> arr = new HashSet<HashMap<Integer,String>>();
        /* Set        [Map,                 Map,               Map          ,...]
                        |                    |                  |
                 [<K,V>,<K,V>,...]    [<K,V>,<K,V>,...]   [<K,V>,<K,V>,...]
                 INTERNAL REPRESENTATION

        */
        for(int i=0;i<5;i++){
            HashMap<Integer,String> O = new HashMap<Integer,String>(); //loop for random data inside the HashMap and adding it to HashSet
            O.put(i,"Vishnu");
            O.put(i+1,"Sushmitha");
            O.put(i+2,"Saanakkya");
            //System.out.println(O);
            arr.add(O);
        }
        System.out.println(arr);
    }
}
