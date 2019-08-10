import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class HandleCard {
    public static String compareCard(List<Card> list, List<Card> list1) {
        List<Integer> numList = getSortIntegers(list);
        List<Integer> numList1 = getSortIntegers(list1);
        int pairCount = 0;
        int pairCount1 = 0;
        pairCount = getPairCount(numList, pairCount);
        pairCount1 = getPairCount(numList1, pairCount1);
        if(pairCount>pairCount1){
            return "list win";
        }
        if(numList.containsAll(numList1)){
            return "equal";
        }
        int max1 = getMax1(list);
        int max2 = getMax1(list1);
        if(max1<max2){
            return "list1 win";
        }
        return null;
    }

    private static int getMax1(List<Card> list) {
        return list.stream().mapToInt(Card::getNum).max().getAsInt();
    }

    private static List<Integer> getSortIntegers(List<Card> list) {
        List<Integer> numList = list.stream().map(Card::getNum).collect(Collectors.toList());
        sort(numList);
        return numList;
    }

    private static int getPairCount(List<Integer> numList, int pairCount) {
        for (Integer num : numList) {
            int count = Collections.frequency(numList, num);
            if (count > 1) {
                pairCount++;
            }
        }
        return pairCount;
    }

}
