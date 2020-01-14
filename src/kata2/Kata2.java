package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo=new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        for(HashMap.Entry<String,Integer> i: histogr.entrySet()){
            System.out.println(i.getKey()+"==>"+i.getValue());
        }
    }
    
}
