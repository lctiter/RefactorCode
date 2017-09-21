package cn.icodelife.chapter1;

/**
 * Created by lichunting on 2017/9/21.
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
    double getCharge(int daysRented){
        double result = 2;
        if(daysRented >2){
            result += (daysRented-2) *1.5;
        }
        return result;
    }
}
