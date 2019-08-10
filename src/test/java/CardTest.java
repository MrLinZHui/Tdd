import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

//input: 1s 2D 3s 5D
public class CardTest {
    @Test
    public void should_return_list1_win_when_give_two_high_list(){
        //given
        List list = Arrays.asList("2s", "3d", "5s", "6d", "7s");
        List list1 = Arrays.asList("4s", "9d", "8s", "5d", "3s");
        //when
        String result = Card.compareCard(list,list1);

        //then
        Assert.assertEquals("list1 win",result);

    }
}
