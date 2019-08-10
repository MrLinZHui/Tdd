import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class HandleCard {
    public static String compareCard(List<Card> list, List<Card> list1) {
        List<Integer>numList = list.stream().map(Card::getNum).collect(Collectors.toList());
        List<Integer>numList1 = list1.stream().map(Card::getNum).collect(Collectors.toList());
        sort(numList);
        sort(numList1);
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
