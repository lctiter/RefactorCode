package cn.icodelife.chapter1;

/**
 * Created by lichunting on 2017/9/21.
 */
public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {

       return 1;
    }
}
