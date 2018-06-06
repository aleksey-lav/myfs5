package codegym;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrQueueTraining {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(1000, new Comparator<Integer>() {

            public int compare(Integer w1, Integer w2) {
                return w1.compareTo(w2);
            }
        });

        pQueue.add(12);
        pQueue.add(1);
        pQueue.add(5);
        pQueue.add(22);
        pQueue.add(3);
        pQueue.add(2);
        pQueue.add(124);
        pQueue.add(14);
        pQueue.add(111);
        pQueue.add(9);
        pQueue.add(30);

        /*Object[] ar = pQueue.toArray();
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i].toString() + " ");
        }*/

        while (!pQueue.isEmpty()){
            System.out.print(pQueue.poll() + " ");
        }
        pQueue.add(22);
        System.out.println(pQueue.poll());
        pQueue.add(23);
        pQueue.add(30);
        pQueue.add(27);
        pQueue.add(13);
        pQueue.add(24);
        while (!pQueue.isEmpty())
            System.out.println(pQueue.poll());
    }

}
