package tdi.training.java.core;

import java.util.Map;
import java.util.HashMap;

public class ArrayFwMap{
    
    public static void main(String[] args){
        Map berkas = new HashMap();
        berkas.put("Laporan2017","ajskajslajl");
        berkas.put("Laporan2018","lalalklsakl");

        System.out.println(berkas.get("Laporan2018"));

        berkas.forEach((kunci,nilai)->{
            System.out.println(String.format(
                "kata kunci %s dan nilainya adalah %s", kunci,nilai
            ));
        });
    }
}