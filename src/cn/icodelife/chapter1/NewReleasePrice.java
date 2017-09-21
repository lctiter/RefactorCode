package cn.icodelife.chapter1;

/**
 * Created by lichunting on 2017/9/21.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double getCharge(int daysRented){

        return daysRented*3;
    }

    public int getFrequentRenterPoints(int daysRented) {

        return daysRented>1?2:1;
    }
}
