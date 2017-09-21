package cn.icodelife.chapter1;

/**
 * 简单的封装电影数据的类
 * Created by lichunting on 2017/9/21.
 */
public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;

    private String _title;

    private Price _priceCode;

    public Movie(String title,int priceCode){
        _title = title;
        set_priceCode(priceCode);
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public Price get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int arg) {
        switch (arg){
            case REGULAR:
                _priceCode = new RegularPrice();
                break;
            case CHILDRENS:
                _priceCode = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _priceCode = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented){
        return _priceCode.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _priceCode.getFrequentRenterPoints(daysRented);
    }
}
