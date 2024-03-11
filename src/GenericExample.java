import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericExample {
    public static void main(String[] args) {

       // System.out.println("Hello world!");
       /* IntegerCounter integerCounter = new IntegerCounter(10);
        integerCounter.print();

        DoubleCounter doubleCounter = new DoubleCounter(10.0);
        doubleCounter.print();*/

        Counter<Integer> counter = new Counter<>(12);
        counter.print();

        Counter<Double> counter1= new Counter<>(12.2);
        counter1.print();

        /*Counter<Object> counter2 = new Counter("shyam");
        counter2.print();*/

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("shyam");

        System.out.println(arrayList);

        print(1,2);


        List<Integer> intlist = new ArrayList<>();
        intlist.add(1);
        intlist.add(20);
        print(intlist);

    }

    private static <T, U> void print(T t ,U u) {
        System.out.println(t);
        System.out.println(u);
    }

    private static void print(List<? extends Number> list){
        System.out.println(list);
    }

}