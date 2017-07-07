package Utils;

/**
 * Created by dell on 7.7.2017 г..
 */
public class Checkout {
    private int runningTotal = 0;

     public void add(int count, int price) {

        runningTotal += (count * price);
    }

    public int total() {
        return runningTotal;
    }
}
