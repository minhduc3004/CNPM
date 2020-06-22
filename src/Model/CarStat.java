/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import Model.BookedCar;
import Model.CarStat;

public class CarStat extends Car implements Serializable{
    public CarStat(){
        super();
    }

    public CarStat(int totalRentTime, int amount ) {
        super();
        this.amount = amount;
        this.bookedCar = bookedCar;
    }

    public int getTotalRentTime() {
        return totalRentTime;
    }

    public void setTotalRentTime(int totalRentTime) {
        this.totalRentTime = totalRentTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int  totalRentTime,amount;
    private ArrayList<BookedCar> bookedCar;
}
