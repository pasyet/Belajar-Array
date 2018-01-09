package tdi.training.java.core;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class ArrayFwList{
    public static void main (String[] args){
       // List values = new ArrayList();
        // values.add("Nabila");
        // values.add(1);
        // values.add(false);
        // values.add(true);
        // values.add('A');
        // values.add(100f);
        // values.add(0.1d);
        // values.add(new BigDecimal (100000));

        List<Integer> values = new ArrayList(); //Type Generic
        values.add(123);
        values.add(167);
        values.add(999);

        for(int i=0; i<values.size(); i++) // tidak pakai {} karena 1 stetment aja 
            System.out.println(values.get(i));
    }
}