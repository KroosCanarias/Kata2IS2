package kata2;

import java.util.*;

public class Histogram {
    private final int []data;
    public Histogram(int[] data){
        this.data=data;
    }
    public int [] getData(){
        return data;
    }
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> hist=new HashMap<>();
        for(int i: data){
            if(hist.containsKey(i)){
                hist.put(data[i],hist.get(data[i])+1);
            }else{
                hist.put(data[i],1);
            }
        }
        return hist;
    }
}
