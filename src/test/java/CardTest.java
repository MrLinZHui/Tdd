import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
    public void should_return_equal_when_give_two_num_same_cards(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("9c"), new Card("Ad"), new Card("5s"), new Card("3d"));
        List list1 = Arrays.asList(new Card("2d"),
                new Card("9d"), new Card("As"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("equal",result);
    }

    @Test
    public void should_return_list_win_when_give_a__pair_list_and_a_high_card(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("5s"), new Card("6d"), new Card("7s"));
        List list1 = Arrays.asList(new Card("4s"),
                new Card("9d"), new Card("As"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list win",result);
    }

    @Test
    public void should_return_list1_win_when_give_tow__pair_list_and_list1_pair_is_high_than_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("5s"), new Card("6d"), new Card("7s"));
        List list1 = Arrays.asList(new Card("4s"),
                new Card("4d"), new Card("6s"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list_win_when_give_a_double_tow__pair_list_and_a_tow_pair_list1(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("3s"), new Card("3d"), new Card("7s"));
        List list1 = Arrays.asList(new Card("4s"),
                new Card("4d"), new Card("6s"), new Card("5d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list win",result);
    }

    @Test
    public void should_return_list1_win_when_give_two_double_tow__pair_list_and_list1_is_high_than_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("6s"), new Card("6d"), new Card("As"));
        List list1 = Arrays.asList(new Card("4s"),
                new Card("4d"), new Card("7s"), new Card("7d"), new Card("3s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list1_win_when_give_two_same_double_tow__pair_list_and_list1_simple_card_is_high_than_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("6s"), new Card("6d"), new Card("5s"));
        List list1 = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("6s"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_equal_when_give_two_same_double_two__pair_list_and_the_simple_card_is_equal_too(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("6s"), new Card("6d"), new Card("7d"));
        List list1 = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("6s"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("equal",result);
    }

    @Test
    public void should_return_list_win_when_give_a_three__pair_list_and_a_two_double_two_pair_list1(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("2c"), new Card("6d"), new Card("7d"));
        List list1 = Arrays.asList(new Card("3s"),
                new Card("3d"), new Card("6s"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list win",result);
    }
    @Test
    public void should_return_list1_win_when_give_two_three__pair_lists_and_list1_is_high_than_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("2d"), new Card("2c"), new Card("6d"), new Card("7d"));
        List list1 = Arrays.asList(new Card("3s"),
                new Card("3d"), new Card("3c"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list_win_when_give_a_Straight_list_and_a_three__pair_list1(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("3d"), new Card("4c"), new Card("5d"), new Card("6d"));
        List list1 = Arrays.asList(new Card("3s"),
                new Card("3d"), new Card("3c"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list win",result);
    }

    @Test
    public void should_return_list1_win_when_give_two_Straight_list_and_list1_is_high_than_list(){
        //given
        List list = Arrays.asList(new Card("2s"),
                new Card("3d"), new Card("4c"), new Card("5d"), new Card("6d"));
        List list1 = Arrays.asList(new Card("3s"),
                new Card("4d"), new Card("5c"), new Card("6d"), new Card("7s"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list1_win_when_a_same_color_list1_and_give_a_Straight_list(){
        //given
        List list = Arrays.asList(new Card("5s"),
                new Card("6d"), new Card("7c"), new Card("8d"), new Card("9d"));
        List list1 = Arrays.asList(new Card("3d"),
                new Card("4d"), new Card("5d"), new Card("6d"), new Card("8d"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list_win_when_two_same_color_lists_and_list_is_higher_than_list1(){
        //given
        List list = Arrays.asList(new Card("5s"),
                new Card("6s"), new Card("7s"), new Card("8s"), new Card("10s"));
        List list1 = Arrays.asList(new Card("3d"),
                new Card("4d"), new Card("5d"), new Card("6d"), new Card("8d"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list_win_when_a_same_color_lists_and_a_three_pair_list1(){
        //given
        List list = Arrays.asList(new Card("5s"),
                new Card("6s"), new Card("7s"), new Card("8s"), new Card("10s"));
        List list1 = Arrays.asList(new Card("3d"),
                new Card("2d"), new Card("2s"), new Card("2h"), new Card("8d"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list1_win_when_a_same_color_lists_and_a_three_pair_and_two_pair_list1(){
        //given
        List list = Arrays.asList(new Card("5s"),
                new Card("6s"), new Card("7s"), new Card("8s"), new Card("10s"));
        List list1 = Arrays.asList(new Card("3d"),
                new Card("2d"), new Card("2s"), new Card("2h"), new Card("3h"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }

    @Test
    public void should_return_list1_win_when_a_four_pair_lists_and_a_three_pair_and_two_pair_list1(){
        //given
        List list = Arrays.asList(new Card("5d"),
                new Card("7d"), new Card("7s"), new Card("7h"), new Card("5h"));
        List list1 = Arrays.asList(new Card("2c"),
                new Card("2d"), new Card("2s"), new Card("2h"), new Card("3h"));
        HandleCard handleCard = new HandleCard();
        //when
        String result = HandleCard.compareCard(list, list1);
        //then
        Assert.assertEquals("list1 win",result);
    }
}
