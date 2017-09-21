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
        //int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() +"\n";

        while(rentals.hasMoreElements()){
            //第四部分：去掉多余的临时变量,只更改过一次
           // double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //第三部修改引用的地方
            //thisAmount = amountFor(each);
            //thisAmount = each.getCharge();
            /*//对不同影片进行不同的计算方式
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
            }*/
           // frequentRenterPoints += each.getFrequentRenterPoints();

            result += "\t" + each.get_movie().get_title() +"\t"+String.valueOf(each.getCharge())+"\n";
        }

        result += "Amount owed is "+String.valueOf(getTotalCharge())+"\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoiont())+ " frequent center points";

        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration retals = _rentals.elements();
        while (retals.hasMoreElements()){
            Rental each = (Rental) retals.nextElement();
            result += each.getCharge();
        }
        return  result;
    }

    private int getTotalFrequentRenterPoiont(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return  result;
    }

    /**
     * 1.分解第一步：将case提取出来
     * extra method
     * @param aRental
     * @return
     */
   /* private double amountFor(Rental aRental){
        *//*double result = 0;
        //对不同影片进行不同的计算方式
        switch (aRental.get_movie().get_priceCode()){
            case Movie.REGULAR:
                result += 2;
                if(aRental.get_daysRented() >2)
                    result += (aRental.get_daysRented()-2)*1.5;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if(aRental.get_daysRented() >3)
                    result += (aRental.get_daysRented()-3)*1.5;
                break;
            case Movie.NEW_RELEASE:
                result += aRental.get_daysRented()*3;
                break;
        }
        return result;*//*
        return aRental.getCharge();
    }*/

}
