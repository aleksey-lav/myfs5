package codegym;
import java.util.*;

public class KmaxElement {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int k = in.nextInt();*/
        int k = 7;
        int[] numbers = {78,80,51,1,15,23,72,72,77,42,29,87,33,58,75,92,22,92,43};
/*
        Comparator<Integer> sortMyQueue = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };*/

        Queue<Integer> myQueue = new PriorityQueue<>();
        int index = 0;
        while(index < numbers.length) {
            myQueue.add(numbers[index]);
            index++;
        }
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll()+", ");

        }
        System.out.println( myQueue.peek());

        int el=0;
        for (int i = 0; i < k; i++) {
            el=myQueue.poll();
        }
        System.out.println(el);

    }

}