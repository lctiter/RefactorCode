package cn.icodelife.chapter1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 用来表示客户的类
 * Created by lichunting on 2017/9/21.
 */
public class Customer {

    private String _name;

    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public  void addRental(Rental arg){
        _rentals.add(arg);
    }

    public String getName(){
        return _name;
    }

    /**
     * 打印详单
     * @return
     */
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() +"\n";

        while(rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //对不同影片进行不同的计算方式
            switch (each.get_movie().get_priceCode()){
                case Movie.REGULAR:
                    thisAmount += 2;
                    if(each.get_daysRented() >2)
                        thisAmount += (each.get_daysRented()-2)*1.5;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.get_daysRented() >3)
                        thisAmount += (each.get_daysRented()-3)*1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.get_daysRented()*3;
                    break;
            }
            frequentRenterPoints++;

            if((each.get_movie().get_priceCode() == Movie.NEW_RELEASE)&&each.get_daysRented()>1)
                frequentRenterPoints++;

            result += "\t" + each.get_movie().get_title() +"\t"+String.valueOf(thisAmount)+"\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is "+String.valueOf(totalAmount)+"\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)+ " frequent center points";

        return result;
    }
}
