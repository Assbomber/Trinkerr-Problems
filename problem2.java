import java.util.*;
import java.io.*;

class problem2{
    public static void main(String [] args) throws Exception{
        //final List
        List<List<String>> list=new ArrayList();

        //Hashmap to store matching keys and corresponding values
        Map<String,List<String>> map=new HashMap();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of input string: ");

        //count of input strings
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the strings one by one");
        while(n-->0){
            String s=br.readLine();
            String reSorted=rearrange(s);
            List<String> tempList=map.getOrDefault(reSorted,new ArrayList<String>());
            tempList.add(s);
            map.put(reSorted,tempList);
        }
        for(Map.Entry<String,List<String>> o:map.entrySet()){
            list.add(o.getValue());
        }
        System.out.println(list);
    }

    //reSorting the String
    //time complexity-O(n log n)
    public static String rearrange(String str){
        String [] strArr=str.split("");
        Arrays.sort(strArr);
        String s="";
        for(String c:strArr){
            s+=c;
        }
        return s;
    }
}
