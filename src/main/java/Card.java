import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Card {
//    private
    public static String compareCard(List list, List list1) {
        sort(list);
        sort(list1);
        if(Integer.parseInt(list.get(4).toString().charAt(0)+"")<Integer.parseInt(list1.get(4).toString().charAt(0)+"")){
            return "list1 win";
        }
        return null;
    }
}
