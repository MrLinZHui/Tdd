import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

//input: 1s 2D 3s 5D
public class CardTest {
    @Test
    public void should_return_list1_win_when_give_two_high_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("3d"), new Card("5s"), new Card("6d"), new Card("7s"));
        List list1 = Arrays.asList(new Card("4s"),
                new Card("9d"), new Card("As"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);

        //then
        Assert.assertEquals("list1 win",result);

    }
    @Test
    public void should_return_equal_when_give_two_high_list_num_is_equal(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("9s"), new Card("Ad"), new Card("5s"), new Card("3d"));
        List list1 = Arrays.asList(new Card("2d"),
                new Card("9d"), new Card("As"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);

        //then
        Assert.assertEquals("equal",result);
    }
}
