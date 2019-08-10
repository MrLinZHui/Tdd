import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.*;

public class Card {
    private Integer num;
    private char type;

    public Card(Integer num, char type) {
        this.num = num;
        this.type = type;
    }

    public Card(String numType) {
        this.type = numType.charAt(1);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('T', 10);
        map.put('J', 11);
        map.put('Q', 12);
        map.put('K', 13);
        map.put('A', 14);
        char number = numType.charAt(0);
        if(map.containsKey(number)){
            this.num = map.get(number);
        }else {
            this.num = (int) number -48;
        }
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }


}
