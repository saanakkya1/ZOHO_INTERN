import java.util.ArrayList;
import java.util.PriorityQueue;
// public class PriorityQueues {
// //    static {
//     PriorityQueue<String> q = new PriorityQueue<String>();

// //   }
// }

public class Arrays{
    
    
    public static  void main(String[] args) {
        ArrayList<PriorityQueue> arr = new ArrayList<PriorityQueue>();
   
    for(int i=0;i<5;i++){
        PriorityQueue<String> O = new PriorityQueue<String>();
        O.add("Vishnu");
        O.add("Sushmitha");
        O.add("Saanakkya");
        System.out.println(O);
        arr.add(O);
    }
    
    
    System.out.println(arr);
    

    }
}

