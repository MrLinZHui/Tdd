import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class HandleCard {
    public static String compareCard(List<Card> list, List<Card> list1) {
        List<Integer> numList = getSortIntegers(list);
        List<Integer> numList1 = getSortIntegers(list1);
        Map<Integer, Integer> pairCount = getPairCount(numList);
        Map<Integer, Integer> pairCount1 = getPairCount(numList1);
        Set<Character> types = list.stream().map(Card::getType).collect(Collectors.toSet());
        Set<Character> types1 = list1.stream().map(Card::getType).collect(Collectors.toSet());
        System.out.println("types:"+types.size()+",types1:"+types1.size());
        if(types1.size()==1){
            if(types.size()!=1){
                return "list1 win";
            }
        }
        System.out.println("count:"+pairCount.size()+",count1:"+pairCount1.size());
        if(Collections.max(numList)-Collections.min(numList)==4&&pairCount.size()==0){
            if(pairCount1.size()>0||Collections.max(numList1)-Collections.min(numList1)!=4) {
                return "list win";
            }
        }
        if(pairCount.size()>0&&pairCount1.size()>0){
            if (getThreePair(pairCount, pairCount1)) return "list win";
        }
        if(pairCount.size()>pairCount1.size()){
            return "list win";
        }
        if(pairCount.size()<pairCount1.size()){
            return "list1 win";
        }
        if(pairCount.size() > 0){
            if (getListHigh(pairCount, pairCount1)) return "list1 win";
        }
        if(numList.containsAll(numList1)){
            return "equal";
        }
        String x = getString(list, list1);
        if (x != null) return x;
        return null;
    }

    private static boolean getThreePair(Map<Integer, Integer> pairCount, Map<Integer, Integer> pairCount1) {
        int numMax = getListMax(pairCount);
        int numMax1 = getListMax(pairCount1);
        if(pairCount.get(numMax)>pairCount1.get(numMax1)){
            return true;
        }
        return false;
    }

    private static boolean getListHigh(Map<Integer, Integer> pairCount, Map<Integer, Integer> pairCount1) {
        int numMax = getListMax(pairCount);
        int numMax1 = getListMax(pairCount1);
        if(numMax1>numMax){
            return true;
        }
        return false;
    }

    private static String getString(List<Card> list, List<Card> list1) {
        int max1 = getMax1(list);
        int max2 = getMax1(list1);
        if(max1<max2){
            return "list1 win";
        }else if (max1>max2){
            return "list win";
        }
        return null;
    }

    private static int getListMax(Map<Integer, Integer> pairCount) {
        return (new ArrayList<Integer>(pairCount.keySet())).stream().mapToInt(num -> num).max().getAsInt();
    }

    private static int getMax1(List<Card> list) {
        return list.stream().mapToInt(Card::getNum).max().getAsInt();
    }

    private static List<Integer> getSortIntegers(List<Card> list) {
        List<Integer> numList = list.stream().map(Card::getNum).collect(Collectors.toList());
        sort(numList);
        return numList;
    }

    private static Map getPairCount(List<Integer> numList) {
        Set<Integer> numSet = new HashSet<>(numList);
        Map<Integer,Integer> pairMap = new HashMap();
        for (Integer num : numSet) {
            int count = Collections.frequency(numList, num);
            if (count > 1) {
                pairMap.put(num,count);
            }
        }
        return pairMap;
    }

}
