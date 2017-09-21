package cn.icodelife.chapter1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by lichunting on 2017/9/21.
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
    double getCharge(int daysRented){
        double result = 1.5;
        if(daysRented >3){
            result += (daysRented-3) *1.5;
        }
        return result;
    }
}
