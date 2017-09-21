package cn.icodelife.chapter1;

/**
 * 表示某个顾客租了一部影片
 * Created by lichunting on 2017/9/21.
 */
public class Rental {

    private Movie _movie;

    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public void set_movie(Movie _movie) {
        this._movie = _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public void set_daysRented(int _daysRented) {
        this._daysRented = _daysRented;
    }

    /**
     * 2.第二步移动方法，将方法放到对应的类中
     * @return
     */
    public double getCharge(){
        return _movie.getCharge(_daysRented);
    }
    public int getFrequentRenterPoints() {

        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
