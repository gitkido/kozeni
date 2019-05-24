import entity.aggregate.AggregateYen;
import exception.NoMoneyException;

public class Main {

    public static void main (String[] args) {

        AggregateYen saifu = new AggregateYen();

        try {
            saifu.add1Yen();
            saifu.add5000Yen();
            saifu.remove1Yen();
            saifu.remove1Yen();
        } catch (NoMoneyException e) {
            e.printStackTrace();
        }

        System.out.println(saifu.getValue());

    }
}
