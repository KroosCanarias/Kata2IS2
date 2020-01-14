package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int [] data=new int[15];
        for(int i=0;i<15;i++){
            if(i%2==0){
                data[i]=2;
            }else{
                data[i]=3;
            }
        }
        HashMap <Integer,Integer> histogram=new HashMap<>();
        for(int i: data){
            if(histogram.containsKey(i)){
                histogram.put(data[i],histogram.get(data[i])+1);
            }else{
                histogram.put(data[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> i: histogram.entrySet()){
            System.out.println(i.getKey()+"==>"+i.getValue());
        }
    }
    
}
