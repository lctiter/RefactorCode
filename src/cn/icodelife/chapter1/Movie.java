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

    private int _priceCode;

    public Movie(String title,int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }


}
