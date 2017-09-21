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
        double result = 0;
        //对不同影片进行不同的计算方式
        switch (get_movie().get_priceCode()){
            case Movie.REGULAR:
                result += 2;
                if(get_daysRented() >2)
                    result += (get_daysRented()-2)*1.5;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if(get_daysRented() >3)
                    result += (get_daysRented()-3)*1.5;
                break;
            case Movie.NEW_RELEASE:
                result += get_daysRented()*3;
                break;
        }
        return result;
    }
    public int getFrequentRenterPoints() {

        if((get_movie().get_priceCode() == Movie.NEW_RELEASE)&&get_daysRented()>1)
            return 2;
        else
            return 1;
    }
}
