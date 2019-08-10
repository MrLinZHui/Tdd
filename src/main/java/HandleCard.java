import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class HandleCard {
    public static String compareCard(List<Card> list, List<Card> list1) {
        List<Integer>numList = list.stream().map(Card::getNum).collect(Collectors.toList());
        List<Integer>numList1 = list1.stream().map(Card::getNum).collect(Collectors.toList());
        sort(numList);
        sort(numList1);
        int pairCount = 0;
        int pairCount1 = 0;
        for (Integer num : numList) {
            int count = Collections.frequency(numList, num);
            if(count>1){
               pairCount++;
           }
        }
        for (Integer num : numList1) {
            int count = Collections.frequency(numList1, num);
            if(count>1){
                pairCount1++;
            }
        }
        System.out.println("count:"+pairCount+",count1:"+pairCount1);
        if(pairCount>pairCount1){
            return "list win";
        }
        System.out.println(numList+","+numList1);
        if(numList.containsAll(numList1)){
            return "equal";
        }
        int max1 = list.stream().mapToInt(Card::getNum).max().getAsInt();
        int max2 = list1.stream().mapToInt(Card::getNum).max().getAsInt();
        if(max1<max2){
            return "list1 win";
        }
        return null;
    }

}
