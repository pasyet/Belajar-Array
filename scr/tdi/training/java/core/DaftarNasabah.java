package tdi.training.java.core;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class DaftarNasabah{

    public static void main(String[] args){

        Nasabah nabila = new Nasabah("001","Nabila", new BigDecimal(1000));
        System.out.println(nabila.toString());

        List<Nasabah> list = new ArrayList<>();
        list.add(nabila);
        list.add(
            new Nasabah("002","Nabila2",new BigDecimal(2000))
        );
        list.add(
            new Nasabah("003","Nabila3",new BigDecimal(3000))
        );

        Nasabah indexKe2 = list.get(2);
        System.out.println("index ke 2 adalah "+indexKe2.toString());

        for(Nasabah n: list){
            System.out.println(n.toString());
        }

    }
}