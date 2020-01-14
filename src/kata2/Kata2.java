package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data=new Integer[15];
        for(int i=0;i<15;i++){
            if(i%2==0){
                data[i]=2;
            }else{
                data[i]=3;
            }
        }
        Histogram histo=new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for(HashMap.Entry<Integer,Integer> i: histogr.entrySet()){
            System.out.println(i.getKey()+"==>"+i.getValue());
        }
    }
    
}
